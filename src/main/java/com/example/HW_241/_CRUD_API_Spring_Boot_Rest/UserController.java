package com.example.HW_241._CRUD_API_Spring_Boot_Rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    private final TutorialRepository tutorialRepository;
    public UserController(TutorialRepository tutorialRepository)
    {
        this.tutorialRepository = tutorialRepository;
    }

    /*
    curl -X GET http://localhost:8080/api/users -H 'Content-Type: application/json'
     */
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return tutorialRepository.findAll();
    }
/*
curl -X GET http://localhost:8080/api/users/2 -H 'Content-Type: application/json'
curl -X GET http://localhost:8080/api/users/1 -H 'Content-Type: application/json'
curl -X GET http://localhost:8080/api/users/100 -H 'Content-Type: application/json'
 */

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") long id) {
        Optional<User> tutorialData = tutorialRepository.findById(id);
        if (tutorialData.isPresent()) {
            return tutorialData.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /*
curl -X POST http://localhost:8080/api/users -H 'Content-Type: application/json' -d '{"username":"Kirill","password":"qwe","age": 17}'
curl -X POST http://localhost:8080/api/users -H 'Content-Type: application/json' -d '{"username":"Dima","password":"123","age": 11}'
curl -X POST http://localhost:8080/api/users -H 'Content-Type: application/json' -d '{"username":"Kirill","password":"qqqq","age": 22}'

 */

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        if(!tutorialRepository.findByUsername(user.getUsername()).isEmpty()){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        else {
            return  tutorialRepository.save(new User(user.getUsername(),user.getPassword(), user.getAge()));
        }
    }

    /*
   curl -X PUT http://localhost:8080/api/users/1 -H 'Content-Type: application/json' -d '{"username":"F","password":"ff","age": 30}'
   curl -X PUT http://localhost:8080/api/users/100 -H 'Content-Type: application/json' -d '{"username":"F","password":"ff","age": 30}'


    */
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable("id") long id, @RequestBody User user) {
        Optional<User> tutorialData = tutorialRepository.findById(id);
        if (tutorialData.isPresent()) {
            User _tutorial = tutorialData.get();
            _tutorial.setUsername(user.getUsername());
            _tutorial.setPassword(user.getPassword());
            _tutorial.setAge(user.getAge());
            return tutorialRepository.save(_tutorial);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    /*
   curl -X DELETE http://localhost:8080/api/users/1 -H 'Content-Type: application/json'
   curl -X DELETE http://localhost:8080/api/users/100 -H 'Content-Type: application/json'


    */

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        if(tutorialRepository.existsById(id)){tutorialRepository.deleteById(id);}
        else{throw new ResponseStatusException(HttpStatus.NOT_FOUND);}

    }

}
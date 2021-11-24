package com.example.HW_241._CRUD_API_Spring_Boot_Rest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface TutorialRepository extends JpaRepository<User, Long> {
    //List<User> findByPublished(boolean published);
    List<User> findByUsername(String username);
    List<User> findByAgeBetween(Integer start,Integer finish);

}
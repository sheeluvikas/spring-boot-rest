package org.example.main;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {


    @GetMapping("/{id}")
    public Student getStudentName(@PathVariable(value = "id") String id){
        return new Student("Vikas", "1", "01-01-2001");
    }
}

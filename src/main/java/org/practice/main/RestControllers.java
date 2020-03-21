package org.practice.main;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {


    @GetMapping("/{id}")
    public Student getStudentName(@PathVariable(value = "id") Integer id){
        return new Student("Vikas", id, "01-01-2001");
    }
}

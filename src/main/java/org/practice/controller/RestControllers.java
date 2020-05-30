package org.practice.controller;


import org.practice.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

    /***
     * sample uri : http://localhost:8081/10
     * @param id
     * @return
     */
    @GetMapping("/{rollnumber}")
    public Student getStudentName(@PathVariable(value = "rollnumber") Integer id){
        return new Student("Vikas", id, "01-01-2001");
    }
}

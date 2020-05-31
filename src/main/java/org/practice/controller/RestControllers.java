package org.practice.controller;


import org.practice.bean.Student;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping
    public String getMapping(){
        return "Hello from Get()";
    }

    /**
     * Read this article, its very important for the below :
     * https://dzone.com/articles/using-the-spring-requestmapping-annotation
     *
     * sample URI : http://localhost:8081/mappings?id=20
     * @param id
     * @return
     */
    @RequestMapping(value = "/mappings", method = RequestMethod.GET)
    public String getMappings(@RequestParam(value = "id", required =  false, defaultValue = "10") Integer id){
        return "Hello from GetMappings("+id+")";
    }
}

package org.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo {

    public static void main(String[] args) {
        try{
            SpringApplication.run(SpringBootDemo.class);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}

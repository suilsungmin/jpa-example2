package com.jpaexample
/**
 * Created by smpark on 2017-01-04.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.orm.jpa.EntityScan
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Spring Boot Started.");
    }

}

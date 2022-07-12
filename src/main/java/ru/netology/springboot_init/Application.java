package ru.netology.springboot_init;

import ru.netology.springboot_init.config.*;
import ru.netology.springboot_init.controller.ProfileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

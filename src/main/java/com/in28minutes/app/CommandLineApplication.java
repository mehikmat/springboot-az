package com.in28minutes.app;

import com.in28minutes.components.entity.User;
import com.in28minutes.components.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication
@ComponentScan("com.in28minutes.components")
@EntityScan(basePackages = {"com.in28minutes.components"} )
@EnableJpaRepositories(basePackages = {"com.in28minutes.components"})
public class CommandLineApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) {
        // save a couple of customers
        userService.save(new User("Ranga", "Admin"));
        userService.save(new User("Ravi", "User"));
        userService.save(new User("Satish", "Admin"));
        userService.save(new User("Raghu", "User"));

        log.info("-------------------------------");
        log.info("Finding all users");
        log.info("-------------------------------");
        for (User user : userService.findAll()) {
            log.info(user.toString());
        }
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CommandLineApplication.class, args);
    }
}

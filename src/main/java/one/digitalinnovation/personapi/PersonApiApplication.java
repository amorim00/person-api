package one.digitalinnovation.personapi;

import one.digitalinnovation.personapi.controller.PersonController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(PersonApiApplication.class, args);
        PersonController personController = new PersonController();
        personController.getBook();
    }

}

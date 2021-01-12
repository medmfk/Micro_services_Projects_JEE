package org.sid.customer1;

import org.sid.customer1.entities.Customer;
import org.sid.customer1.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class Customer1Application {

    public static void main(String[] args) {

        SpringApplication.run(Customer1Application.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration) {
        restConfiguration.exposeIdsFor(Customer.class);
        return args -> {
            customerRepository.save(new Customer(null, "Mohamed", "med.mfk@gmail.com"));
            customerRepository.save(new Customer(null, "Omar", "omar.mfk@gmail.com"));
            customerRepository.save(new Customer(null, "Assmae", "Assmae@gmail.com"));
            customerRepository.save(new Customer(null, "Siham", "Sihame@gmail.com"));
            customerRepository.findAll().forEach(
                    customer -> {
                        System.out.println(customer.toString());
                    });
        };

    }
}

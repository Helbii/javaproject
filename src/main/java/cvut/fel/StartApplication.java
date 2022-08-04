package cvut.fel;

import cvut.fel.entity.Adress;
import cvut.fel.entity.Book;
import cvut.fel.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class  StartApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) {

        log.info("StartApplication...");


        Adress adress1 = new Adress();
        System.out.println("\nfindAll()");
        bookRepository.findAll().forEach(System.out::println);

        System.out.println("\nfindById(1L)");
        bookRepository.findById(1L).ifPresent(System.out::println);

        System.out.println("\nfindByName('Node')");
        bookRepository.findByName("Node").forEach(System.out::println);


    }

}
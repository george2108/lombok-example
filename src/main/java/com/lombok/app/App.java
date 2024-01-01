package com.lombok.app;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDate;

// @Log genera un atributo estatico llamado log que es una instancia de java.util.logging.Logger
// podemos especificar el nombre del logger
// @Log(topic = "Person Logger")
// @Log

// @Slf4j genera un atributo estatico llamado log que es una instancia de org.slf4j.Logger
// es una libreria de logging mas popular que java.util.logging.Logger
// hay que agregar la dependencia de slf4j en el pom.xml
@Slf4j
public class App {
    // @SneakyThrows genera un try-catch para las excepciones que se especifiquen
    // tambien se puede usar en un try-with-resources
    // en este ejemplo haría: try (InputStream input = new FileInputStream("test.txt")) {}
    // en otras palabras propaga la excepcion
    @SneakyThrows
    public static void main( String[] args ) {
        Person person = new Person(
            1L,
            "John",
            "Doe",
            "john@email.com",
            30,
            123456789,
                LocalDate.now()
        );

        Person personBuilder = Person.builder()
            .id(2L)
            .name("Jane")
            .lastName("Doe")
                .build();

        System.out.println(person);
        System.out.println(personBuilder);

        log.info("Person: " + person);

        // @Cleanup cierra el recurso una vez que se termina de usar
        // el recurso debe implementar la interfaz java.io.Closeable
        // tambien se puede usar en un try-with-resources
        // en este ejemplo haría: try (InputStream input = new FileInputStream("test.txt")) {}
        @Cleanup
        InputStream input = new FileInputStream("test.txt");
    }
}
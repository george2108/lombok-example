package com.lombok.app;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDate;

// Value es una combinacion de @Getter, @AllArgsConstructor, @EqualsAndHashCode y @ToString
// lo que hace es generar una clase inmutable es decir que no se puede modificar una vez creada la instancia
// define los atributos como private final
@Value

// podemos usar @RequiredArgsConstructor para generar un constructor con los atributos marcados como final
// obliga a que todos los atributos marcados como final sean inicializados en el constructor
@RequiredArgsConstructor
public class Person2 {
    Long id;

    // @NonNull obliga a que el atributo no sea null y genera una excepcion en caso de que lo sea
    // @RequiredArgsConstructor obliga a que el atributo si o si sea inicializado en el constructor
    @NonNull
    String name;
    String lastName;
    String email;
    Integer age;
    Integer phoneNumber;
    LocalDate birthDate;
}

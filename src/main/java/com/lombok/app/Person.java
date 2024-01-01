package com.lombok.app;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

// genera gettes y setters para todos los atributos de la clase
// nivel de acceso para los getters por defecto es public
// @Getter(value = AccessLevel.PROTECTED)
// tambien se pueden utilizar en atributos y metodos
@Setter
@Getter

// genera un constructor con todos los atributos de la clase
// tambien tiene un access level
// @AllArgsConstructor(access = AccessLevel.PRIVATE)
// por defecto el access level es public
// podemos crear una instancia usando un metodo estatico con la propiedad staticName
// @AllArgsConstructor(staticName = "of")
// ejemplo: Person person = Person.of(1L, "John", "Doe", "email", 30, 123456789, LocalDate.now());
@AllArgsConstructor

// genera un constructor vacio
@NoArgsConstructor

// podemos modificar el access level de los atributos
// por defecto el access level es public
// podemos marcar los atributos como final
// @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@FieldDefaults(level = AccessLevel.PRIVATE)

// genera un metodo toString
// podemos incluir u omitir el nombre los atributos que queremos que se muestren en el toString
// @ToString(includeFieldNames = false)
// podemos excluir los atributos que queremos que se muestren en el toString
// @ToString(exclude = {"phoneNumber", "birthDate"})
// podemos incluir los atributos que queremos que se muestren en el toString
// @ToString(of = {"name", "lastName"})
// llamar a los atributos de la clase padre
// @ToString(callSuper = true)
@ToString

// genera un metodo equals y hashCode para todos los atributos de la clase
// estos metodos funcionan para comparar objetos de la misma clase y no para comparar objetos de clases hijas y para generar el hashCode se utiliza el algoritmo de Bloch
// podemos excluir los atributos que queramos
// @EqualsAndHashCode(exclude = {"phoneNumber", "birthDate"})
// podemos incluir los atributos que queramos
// @EqualsAndHashCode(of = {"name", "lastName"})
// podemos usar o no los getters para generar el equals y hashCode
// @EqualsAndHashCode(doNotUseGetters = true)
@EqualsAndHashCode

// podemos generar lo anterior con la anotacion @Data
// @Data
// cosas que no hace @Data:
// debemos configurar @FieldDefaults para darles accesibilidad a los atributos ya que data los genera como public
// debemos configurar @AllArgsConstructor para darle el access level que queramos
// por lo general se usan @Data, @AllArgsConstructor y @NoArgsConstructor juntos
@Data

// podemos generar un builder para la clase para el patron de diseño builder
// podemos modivicar el access level de los atributos por defecto el access level es public
// @Builder(access = AccessLevel.PUBLIC)
// podemos renombrar el nombre del builder
// @Builder(builderMethodName = "personBuilder")
// ejemplo: Person personBuilder = Person.personBuilder()
// podemos cambiar el nombre de la clase builder
// @Builder(builderClassName = "PersonBuilder")
// ejemplo: Person.PersonBuilder personBuilder = Person.PersonBuilder()
@Builder
public class Person {
    Long id;
    String name;
    String lastName;
    String email;
    Integer age;
    Integer phoneNumber;
    LocalDate birthDate;
}

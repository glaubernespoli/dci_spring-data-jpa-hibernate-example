package com.database.example.jpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Inheritance
@Table(indexes = @Index(columnList = "ownerID", name = "id_dog_owner_id"))
public abstract class Pet extends BaseEntity {

    @Column(updatable = false)
    @NotBlank
    private String name;

    @Column(nullable = false, unique = true)
    private String ownerID;

    @Column(updatable = false)
    private String breed;

    @PositiveOrZero
    private Integer age;

    @Positive
    private Integer weight;

    @Column(updatable = false)
    @Past
    private LocalDate birthDate;
}

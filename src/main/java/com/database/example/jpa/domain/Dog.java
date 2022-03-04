package com.database.example.jpa.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@DiscriminatorValue("dog")
public class Dog extends Pet {

    @NotNull
    private Boolean houseTrained;
}

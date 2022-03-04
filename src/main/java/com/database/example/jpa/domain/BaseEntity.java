package com.database.example.jpa.domain;

import com.database.example.jpa.domain.listener.BaseEntityPersistenceListener;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(BaseEntityPersistenceListener.class)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private String createdBy;

    private String updatedBy;
}

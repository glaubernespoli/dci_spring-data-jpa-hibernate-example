package com.database.example.jpa.domain.listener;

import com.database.example.jpa.domain.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class BaseEntityPersistenceListener {

    @PrePersist
    public void prePersistAudibleData(BaseEntity baseEntity) {
        baseEntity.setCreatedAt(LocalDateTime.now());
        baseEntity.setCreatedBy("admin");
    }

    @PreUpdate
    public void preUpdateAudibleData(BaseEntity baseEntity) {
        baseEntity.setUpdatedAt(LocalDateTime.now());
        baseEntity.setUpdatedBy("admin2");
    }
}

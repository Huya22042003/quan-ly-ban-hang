package com.backend.infrastructure.listener;

import com.backend.entity.base.AuditEntity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Calendar;

public class AuditEntityListener {
    @PrePersist
    private void onCreate(AuditEntity auditEntity) {
        auditEntity.setCreatedDate(getCurrentTime());
        auditEntity.setLastModifiedDate(getCurrentTime());
    }

    @PreUpdate
    private void onUpdate(AuditEntity auditEntity) {
        auditEntity.setLastModifiedDate(getCurrentTime());
    }

    private long getCurrentTime() {
        return Calendar.getInstance().getTimeInMillis();
    }
}

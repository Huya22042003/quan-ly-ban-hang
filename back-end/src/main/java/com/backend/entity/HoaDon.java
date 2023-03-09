package com.backend.entity;

import com.backend.entity.base.AuditEntity;
import com.backend.infrastructure.constant.HoaDonConstant;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hoa-don")
@Entity
public class HoaDon extends AuditEntity implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_hoa_don")
    private String maHoaDon;

    @Column(name = "trang_thai")
    private HoaDonConstant hoaDonConstant;

    @Column(name = "khach_hang_id")
    private Long khachHangId;
}

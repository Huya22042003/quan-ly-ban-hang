package com.backend.entity;

import com.backend.entity.base.AuditEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Table(name = "hoa_don_chi_tiet")
@Entity
@IdClass(HoaDonChiTietId.class)
public class HoaDonChiTiet extends AuditEntity implements Serializable {

    @Id
    private Long hoaDonId;

    @Id
    private Long productId;

    @Column(name = "don_gia")
    private Long donGia;

    @Column(name = "so_luong")
    private Long soLuong;
}

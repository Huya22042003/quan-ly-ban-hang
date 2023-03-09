package com.backend.repository;

import com.backend.entity.HoaDonChiTiet;
import com.backend.entity.HoaDonChiTietId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, HoaDonChiTietId> {
}

package com.backend.util;

import com.backend.infrastructure.constant.HoaDonConstant;

public class HoaDonConvert {
    public static String ConvertHoaDon(HoaDonConstant hoaDonConstant) {
        String trangThai = "";
        switch (hoaDonConstant) {
            case DA_HUY_DON: { trangThai = "Đã hủy đơn"; break;}
            case CHO_THANH_TOAN: { trangThai = "Chờ thanh toán"; break;}
            case DA_THANH_TOAN: { trangThai = "Đã hoàn thành"; break;}
            default: trangThai = "Lỗi !!!";
        }
        return trangThai;
    }
}

package com.example.test.payload.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Data
@NoArgsConstructor
public class HoatDongRequest {
    @NotBlank
    private String MaHD;
    @NotBlank
    private String TenHD;
    @NotBlank
    private String MoTaHD;
    private Date NgayGioBatDau;
    private Date NgayGioKetThuc;
    private int SLToiThieuYC;
    private int SLToiDaYC;
    private Date ThoiHanDangKy;
    private String TrangThai;
    @NotBlank
    private String MaTV;


    public HoatDongRequest(String maHD, String tenHD, String moTaHD, Date ngayGioBatDau, Date ngayGioKetThuc, int SLToiThieuYC, int SLToiDaYC, Date thoiHanDangKy, String trangThai, String maTV) {
        MaHD = maHD;
        TenHD = tenHD;
        MoTaHD = moTaHD;
        NgayGioBatDau = ngayGioBatDau;
        NgayGioKetThuc = ngayGioKetThuc;
        this.SLToiThieuYC = SLToiThieuYC;
        this.SLToiDaYC = SLToiDaYC;
        ThoiHanDangKy = thoiHanDangKy;
        TrangThai = trangThai;
        MaTV = maTV;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        MaHD = maHD;
    }
}

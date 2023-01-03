package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoatDong {
    @Id
    @Column(name = "MaHD")
    private String MaHD;
    @Column(name = "TenHD")
    private String TenHD;
    @Column(name = "MoTaHD")
    private String MoTaHD;
    @Column(name = "NgayGioBatDau")
    private Date NgayGioBatDau;
    @Column(name = "NgayGioKetThuc")
    private Date NgayGioKetThuc;
    @Column(name = "SLToiThieuYC")
    private int SLToiThieuYC;
    @Column(name = "SLToiDaYC")
    private int SLToiDaYC;
    @Column(name = "ThoiHanDangKy")
    private Date ThoiHanDangKy;
    @Column(name = "TrangThai")
    private String TrangThai;
    @Column(name = "LyDoHuyHD")
    private String LyDoHuyHD;

    @ManyToOne(targetEntity = ThanhVien.class)
    @JoinColumn(name = "MaTV")
    @JsonIgnore
    private ThanhVien thanhVien;

    @OneToMany(mappedBy = "hoatDong")
    @JsonIgnore
    private List<ThamGia> thamGias;

}

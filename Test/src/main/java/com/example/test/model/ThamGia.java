package com.example.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThamGia {
    @EmbeddedId
    private ThamGiaID id;
    @Column(name = "NgayGioDangKy")
    private Date NgayGioDangKy;
    @Column(name = "DiemTruongDoan")
    private int DiemTruongDoan;
    @Column(name = "DiemTieuChi1")
    private int DiemTieuChi1;
    @Column(name = "DiemTieuChi2")
    private int DiemTieuChi2;
    @Column(name = "DiemTieuChi3")
    private int DiemTieuChi3;
    @Column(name = "NhanXetKhac")
    private String NhanXetKhac;

    @ManyToOne
    @MapsId("MaTV")
    @JoinColumn(name = "MaTV")
    private ThanhVien thanhVien;

    @ManyToOne
    @MapsId("MaHD")
    @JoinColumn(name = "MaHD")
    private HoatDong hoatDong;
}

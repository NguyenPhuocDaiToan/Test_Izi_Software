package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThanhVien {
    @Id
    @Column(name = "MaTV")
    private String MaTV;
    @Column(name = "HoTen")
    private String HoTen;
    @Column(name = "GioiTinh")
    private String GioiTinh;
    @Column(name = "NgaySinh")
    private Date NgaySinh;
    @Column(name = "DiaChiEmail")
    private String DiaChiEmail;
    @Column(name = "SoDienThoai")
    private String SoDienThoai;

    @OneToMany(mappedBy = "thanhVien")
    @JsonIgnore
    private List<HoatDong> hoatDongs;

    @OneToMany(mappedBy = "thanhVien")
    private List<ThamGia> thamGias;
}

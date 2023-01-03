package com.example.test.repository;

import com.example.test.model.HoatDong;
import com.example.test.model.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;


@Repository
public interface HoatDongRepository extends JpaRepository<HoatDong, String> {
    @Transactional
    @Modifying
    @Query(value = "insert into hoatdong(MaHD, TenHD, MoTaHD, NgayGioBatDau, NgayGioKetThuc, SLToiThieuYC, SLToiDaYC," +
            " ThoiHanDangKy, TrangThai, MaTV) " +
            " values (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)", nativeQuery = true)
    void create(String MaHD, String TenHD, String MoTaHD, Date NgayGioBatDau, Date NgayGioKetThuc,
                int SLToiThieuYC, int SLToiDaYC, Date ThoiHanDK, String TrangThai, String MaTV);

    @Transactional
    @Modifying
    @Query(value = "update hoatdong set TenHD = ?1, MoTaHD = ?2, NgayGioBatDau = ?3, NgayGioKetThuc = ?4, SLToiThieuYC = ?5" +
            ", SLToiDaYC = ?6, ThoiHanDangKy = ?7, TrangThai = ?8 where MaHD = ?9", nativeQuery = true)
    void update(String TenHD, String MoTaHD, Date NgayGioBatDau, Date NgayGioKetThuc,
                int SLToiThieuYC, int SLToiDaYC, Date ThoiHanDK, String TrangThai, String MaHD);

    @Query(value = "select thanhvien.MaTV, thanhvien.HoTen, avg(DiemTruongDoan) as DiemTrungBinh from thanhvien " +
            "join hoatdong on thanhvien.MaTV = hoatdong.MaTV " +
            "join thamgia on hoatdong.MaHD = thamgia.MaHD " +
            "group by thanhvien.MaTV " +
            "order by DiemTrungBinh DESC", nativeQuery = true)
    List<Statistic> statistic();
}

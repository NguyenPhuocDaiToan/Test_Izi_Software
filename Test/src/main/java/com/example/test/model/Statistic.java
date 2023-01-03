package com.example.test.model;

import org.springframework.beans.factory.annotation.Value;

public interface Statistic {
    @Value("#{target.MaTV}")
    String getMaTV();
    @Value("#{target.HoTen}")
    String getHoTen();
    @Value("#{target.DiemTrungBinh}")
    String getDiemTrungBinh();
}

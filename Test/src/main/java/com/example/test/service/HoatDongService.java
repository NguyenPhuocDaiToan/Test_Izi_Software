package com.example.test.service;

import com.example.test.model.HoatDong;
import com.example.test.model.Statistic;
import com.example.test.payload.request.HoatDongRequest;

import java.util.List;

public interface HoatDongService {
    List<HoatDong> findAll();
    void deleteById(String MaHD);
    HoatDong findById(String MaHD);
    void create(HoatDongRequest hd);
    List<Statistic> statistic();
    void update(HoatDongRequest hd);
}

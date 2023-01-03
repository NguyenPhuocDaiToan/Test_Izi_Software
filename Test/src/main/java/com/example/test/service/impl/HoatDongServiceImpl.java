package com.example.test.service.impl;

import com.example.test.model.HoatDong;
import com.example.test.model.Statistic;
import com.example.test.payload.request.HoatDongRequest;
import com.example.test.repository.HoatDongRepository;
import com.example.test.service.HoatDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoatDongServiceImpl implements HoatDongService {
    @Autowired
    private HoatDongRepository hoatDongRepository;
    @Override
    public List<HoatDong> findAll() {
        return hoatDongRepository.findAll();
    }

    @Override
    public void deleteById(String MaHD) {
        hoatDongRepository.deleteById(MaHD);
    }

    @Override
    public HoatDong findById(String MaHD) {
        return hoatDongRepository.findById(MaHD).orElse(null);
    }

    @Override
    public void create(HoatDongRequest hd) {
        System.out.println(hd.getTrangThai());
        hoatDongRepository.create(hd.getMaHD(), hd.getTenHD(), hd.getMoTaHD(), hd.getNgayGioBatDau(),
                hd.getNgayGioKetThuc(), hd.getSLToiThieuYC(), hd.getSLToiDaYC(), hd.getThoiHanDangKy(),
                hd.getTrangThai(), hd.getMaTV());
    }

    @Override
    public List<Statistic> statistic() {
        return hoatDongRepository.statistic();
    }

    @Override
    public void update(HoatDongRequest hd) {
        hoatDongRepository.update(hd.getTenHD(), hd.getMoTaHD(), hd.getNgayGioBatDau(), hd.getNgayGioKetThuc(),
                hd.getSLToiThieuYC(), hd.getSLToiDaYC(), hd.getThoiHanDangKy(), hd.getTrangThai(), hd.getMaHD());
    }
}

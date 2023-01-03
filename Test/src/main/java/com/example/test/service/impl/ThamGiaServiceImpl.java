package com.example.test.service.impl;

import com.example.test.repository.ThamGiaRepository;
import com.example.test.service.ThamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThamGiaServiceImpl implements ThamGiaService {
    @Autowired
    private ThamGiaRepository thamGiaRepository;

    @Override
    public void deleteByMaHD(String MaHD) {
        thamGiaRepository.deleteByMaHD(MaHD);
    }
}

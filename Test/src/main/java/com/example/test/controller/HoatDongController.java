package com.example.test.controller;

import com.example.test.model.HoatDong;
import com.example.test.model.Statistic;
import com.example.test.payload.request.HoatDongRequest;
import com.example.test.payload.response.ResponseMessage;
import com.example.test.service.HoatDongService;
import com.example.test.service.ThamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/hoatdong")
public class HoatDongController {
    @Autowired
    private HoatDongService hoatDongService;
    @Autowired
    private ThamGiaService thamGiaService;

    @GetMapping("/findAll")
    public ResponseEntity<List<HoatDong>> findAll() {
        return new ResponseEntity<>(hoatDongService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<HoatDong> findById(@RequestParam String maHD) {
        return new ResponseEntity<>(hoatDongService.findById(maHD), HttpStatus.OK);
    }

    @GetMapping("/delete")
    public ResponseEntity<ResponseMessage> delete(@RequestParam String maHD) {
        HoatDong hoatDong = hoatDongService.findById(maHD);
        if(hoatDong == null) {
            return new ResponseEntity<>(new ResponseMessage("Không tồn tại hoạt động cần xoá !"), HttpStatus.BAD_REQUEST);
        } else if(hoatDong.getTrangThai().equalsIgnoreCase("Đã kết thúc")) {
            return new ResponseEntity<>(new ResponseMessage("Không được phép xoá hoạt động đã kết thúc !"), HttpStatus.BAD_REQUEST);
        } else {
            thamGiaService.deleteByMaHD(maHD);
            hoatDongService.deleteById(maHD);
            return new ResponseEntity<>(new ResponseMessage("Xoá hoạt động thành công !"), HttpStatus.OK);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseMessage> create(@Valid @RequestBody HoatDongRequest hoatDongRequest) {
        System.out.println(hoatDongRequest);
        HoatDong hoatDong = hoatDongService.findById(hoatDongRequest.getMaHD());
        if(hoatDong == null) {
            hoatDongRequest.setTrangThai("Đang mời đăng ký");
            hoatDongService.create(hoatDongRequest);
            return new ResponseEntity<>(new ResponseMessage("Thêm mới thành công !"), HttpStatus.OK);
        }  else {
            return new ResponseEntity<>(new ResponseMessage("Mã hoạt động đã tồn tại !"), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<ResponseMessage> update(@RequestBody HoatDongRequest hoatDongRequest) {
        HoatDong hoatDong = hoatDongService.findById(hoatDongRequest.getMaHD());
        if(hoatDong == null) {
            return new ResponseEntity<>(new ResponseMessage("Mã hoạt động không tồn tại !"), HttpStatus.BAD_REQUEST);
        }  else {
            hoatDongService.update(hoatDongRequest);
            return new ResponseEntity<>(new ResponseMessage("Cập nhật thành công !"), HttpStatus.OK);
        }
    }

    @GetMapping("/statistic")
    public ResponseEntity<List<Statistic>> statistic() {
        return new ResponseEntity<>(hoatDongService.statistic(), HttpStatus.OK);
    }
}

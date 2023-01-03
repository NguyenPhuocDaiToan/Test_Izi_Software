import { Component, OnInit } from '@angular/core';
import {HoatDongService} from "../../../service/hoat-dong.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  maHD: string;
  formUpdate: FormGroup;
  constructor(private hoatDongService: HoatDongService,
              private activatedRoute: ActivatedRoute,
              private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.maHD = paramMap.get('maHD');
    });

    this.formUpdate = new FormGroup({
      maHD: new FormControl('', [Validators.required]),
      tenHD: new FormControl('', [Validators.required]),
      moTaHD: new FormControl('', [Validators.required]),
      ngayGioBatDau: new FormControl('', [Validators.required]),
      ngayGioKetThuc: new FormControl('', [Validators.required]),
      sltoiThieuYC: new FormControl('', [Validators.required]),
      sltoiDaYC: new FormControl('', [Validators.required]),
      thoiHanDangKy: new FormControl('', [Validators.required]),
      trangThai: new FormControl('', [Validators.required]),
    });
    this.hoatDongService.findById(this.maHD).subscribe(hd => {
      this.formUpdate.patchValue(hd);
      console.log(this.formUpdate);
    })
  }

  compareTrangThai(t1: string, t2: string) {
    return t1 === t2;
  }

  get tenHD() {
    return this.formUpdate.get('tenHD');
  }

  update() {
    if(this.formUpdate.valid) {
      this.hoatDongService.update(this.formUpdate.value).subscribe(
        next => {
          this.router.navigateByUrl('/');
        },
        error => {
          alert('Sửa hoạt động không thành công !');
        }
      )
    } else {
      alert('Thông tin trong form không hợp lệ !');
    }
  }
}

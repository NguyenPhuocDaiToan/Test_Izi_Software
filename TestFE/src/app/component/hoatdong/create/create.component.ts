import { Component, OnInit } from '@angular/core';
import {HoatDongService} from "../../../service/hoat-dong.service";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  formCreate: FormGroup;

  constructor(private hoatDongService: HoatDongService, private router: Router) {
  }

  ngOnInit(): void {
    this.formCreate = new FormGroup({
      maHD: new FormControl('', [Validators.required]),
      tenHD: new FormControl('', [Validators.required]),
      moTaHD: new FormControl('', [Validators.required]),
      ngayGioBatDau: new FormControl('', [Validators.required]),
      ngayGioKetThuc: new FormControl('', [Validators.required]),
      sltoiThieuYC: new FormControl('', [Validators.required]),
      sltoiDaYC: new FormControl('', [Validators.required]),
      thoiHanDangKy: new FormControl('', [Validators.required]),
      maTV: new FormControl('', [Validators.required]),
    });
  }

  get maHD() {
    return this.formCreate.get('maHD');
  }

  get tenHD() {
    return this.formCreate.get('tenHD');
  }

  get moTaHD() {
    return this.formCreate.get('moTaHD');
  }

  create() {
    if(this.formCreate.valid) {
      this.hoatDongService.create(this.formCreate.value).subscribe(
        next => this.router.navigateByUrl('/'),
        error => alert('Thêm mới không thành công !')
      )
    } else {
      alert('Thông tin trong form không hợp lệ !');
    }
  }
}

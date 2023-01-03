import { Component, OnInit } from '@angular/core';
import {HoatDongService} from "../../../service/hoat-dong.service";
import {HoatDong} from "../../../model/hoat-dong";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  hoatDongs: HoatDong[];
  hoatDongDeletes: HoatDong[];
  constructor(private hoatDongService: HoatDongService) { }

  ngOnInit(): void {
    this.hoatDongService.findAll().subscribe(hds => {
      this.hoatDongs = hds
    });
  }

  findHoatDongDelete(maHD: string) {
    this.hoatDongDeletes = [];
    this.hoatDongService.findById(maHD).subscribe(hd => {
      this.hoatDongDeletes.push(hd);
    });
  }

  delete() {
    console.log(this.hoatDongDeletes[0].maHD);
    this.hoatDongService.delete(this.hoatDongDeletes[0].maHD).subscribe(
      next => {
        this.ngOnInit();
      },
      error => {
        alert('Xoá thất bại');
      }
    )
  }
}

import { Component, OnInit } from '@angular/core';
import {HoatDongService} from "../../../service/hoat-dong.service";
import {Statistic} from "../../../model/statistic";

@Component({
  selector: 'app-statistic',
  templateUrl: './statistic.component.html',
  styleUrls: ['./statistic.component.css']
})
export class StatisticComponent implements OnInit {
  statistics: Statistic[];
  constructor(private hoatDongService: HoatDongService) { }

  ngOnInit(): void {
    this.hoatDongService.statistic().subscribe(s => this.statistics = s);
  }

}

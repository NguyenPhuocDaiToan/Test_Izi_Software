import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {HoatDong} from "../model/hoat-dong";
import {Statistic} from "../model/statistic";

const API = 'http://localhost:8080/api/hoatdong';
@Injectable({
  providedIn: 'root'
})
export class HoatDongService {

  constructor(private http: HttpClient) { }

  findAll(): Observable<HoatDong[]> {
    return this.http.get<HoatDong[]>(API + '/findAll');
  }

  findById(id: string): Observable<HoatDong> {
    return this.http.get<HoatDong>(API + '/findById?maHD=' + id);
  }

  delete(maHD: string): Observable<any> {
    return this.http.get<any>(API + '/delete?maHD=' + maHD);
  }

  create(hoatDong): Observable<any> {
    return this.http.post<any>(API + '/create', hoatDong);
  }

  statistic(): Observable<Statistic[]> {
    return this.http.get<Statistic[]>(API + '/statistic');
  }

  update(hoatdong): Observable<any> {
    return this.http.post<any>(API + '/update', hoatdong);
  }
}

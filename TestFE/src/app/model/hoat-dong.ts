import {ThanhVien} from "./thanh-vien";

export interface HoatDong {
  maHD: string;
  tenHD: string;
  moTaHD: string;
  ngayGioBatDau: Date;
  ngayGioKetThuc: Date;
  sltoiThieuYC: number;
  sltoiDaYC: number;
  thoiHanDangKy: Date;
  trangThai: string;
  thanhVien: ThanhVien;
}

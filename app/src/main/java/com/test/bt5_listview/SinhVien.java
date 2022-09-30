package com.test.bt5_listview;

public class SinhVien {
    private int hinh;
    private String ten;
    private String thongTin;

    public SinhVien(int hinh, String ten, String thongTin){
        this.hinh = hinh;
        this.ten = ten;
        this.thongTin = thongTin;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }
}

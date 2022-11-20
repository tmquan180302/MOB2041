package com.example.mob2041.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class SanPham {
    @PrimaryKey
    @NonNull
    public String ph19652maSP;
    public String ph19652tenSP;
    public int ph19652soLuongNhap;
    public String ph19652ngayNhap;
    public int ph19652donGia;
    public String ph19652maTL;

    public SanPham() {
    }

    public SanPham(String ph19652maSP, String ph19652tenSP, int ph19652soLuongNhap, String ph19652ngayNhap, int ph19652donGia, String ph19652maTL) {
        this.ph19652maSP = ph19652maSP;
        this.ph19652tenSP = ph19652tenSP;
        this.ph19652soLuongNhap = ph19652soLuongNhap;
        this.ph19652ngayNhap = ph19652ngayNhap;
        this.ph19652donGia = ph19652donGia;
        this.ph19652maTL = ph19652maTL;
    }

    @Override
    public String toString() {
        return "maSP= " + ph19652maSP +
                ", tenSP= " + ph19652tenSP +
                ", soLuongNhap=" + ph19652soLuongNhap +
                ", ngayNhap= " + ph19652ngayNhap +
                ", donGia=" + ph19652donGia +
                ", maTL= " + ph19652maTL ;
    }
}

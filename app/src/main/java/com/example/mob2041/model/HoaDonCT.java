package com.example.mob2041.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class HoaDonCT {
    @PrimaryKey
    @NonNull
    public String ph19652maHDCT;
    public String ph19652maHD;
    public String ph19652maSP;
    public int ph19652soLuongXuat;
    public int ph19652donGiaXuat;

    public HoaDonCT(String ph19652maHDCT, String ph19652maHD, String ph19652maSP, int ph19652soLuongXuat, int donGiaXuat) {
        this.ph19652maHDCT = ph19652maHDCT;
        this.ph19652maHD = ph19652maHD;
        this.ph19652maSP = ph19652maSP;
        this.ph19652soLuongXuat = ph19652soLuongXuat;
        this.ph19652donGiaXuat = donGiaXuat;
    }

    public HoaDonCT() {
    }

    @Override
    public String toString() {
        return
                "maHDCT= " + ph19652maHDCT +
                ", maHD= " + ph19652maHD +
                ", maSP= " + ph19652maSP +
                ", soLuongXuat=" + ph19652soLuongXuat +
                ", donGiaXuat=" + ph19652donGiaXuat  ;
    }
}

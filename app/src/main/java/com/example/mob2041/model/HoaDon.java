package com.example.mob2041.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class HoaDon {
    @PrimaryKey
    @NonNull
    public String ph19652maHD;
    public String ph19652ngayHD;

    public HoaDon(String ph19652maHD, String ph19652ngayHD) {
        this.ph19652maHD = ph19652maHD;
        this.ph19652ngayHD = ph19652ngayHD;
    }
    @Override
    public String toString() {
        return "maHD=" + ph19652maHD  +
                ", ngayHD= " + ph19652ngayHD ;
    }
}

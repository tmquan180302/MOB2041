package com.example.mob2041.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TheLoai {
    @PrimaryKey
    @NonNull
    public String ph19652maTL;
    public String ph19652tenTL;

    public TheLoai() {
    }

    public TheLoai(@NonNull String ph19652maTL, String ph19652tenTL) {
        this.ph19652maTL = ph19652maTL;
        this.ph19652tenTL = ph19652tenTL;
    }

    @Override
    public String toString() {
        return "maTL= " + ph19652maTL +
                ", tenTL= " + ph19652tenTL;
    }
}

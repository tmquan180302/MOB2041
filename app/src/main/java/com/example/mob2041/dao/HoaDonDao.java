package com.example.mob2041.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mob2041.model.HoaDon;

import java.util.List;

@Dao
public interface HoaDonDao {
    @Insert
    public void ph19652Insert(HoaDon a);
    @Query("select*from HoaDon")
    List<HoaDon> ph19652getAll();
}

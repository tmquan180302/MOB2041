package com.example.mob2041.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mob2041.model.HoaDonCT;

import java.util.List;

@Dao
public interface HoaDonCTDao {
    @Insert
    void ph19652Insert(HoaDonCT a);

    @Query("select*from HoaDonCT")
    List<HoaDonCT> ph19652getAll();

    @Delete
    void delete(HoaDonCT hdct);

}

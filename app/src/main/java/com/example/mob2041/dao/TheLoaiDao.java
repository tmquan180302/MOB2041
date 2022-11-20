package com.example.mob2041.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mob2041.model.TheLoai;

import java.util.List;

@Dao
public interface TheLoaiDao {
    @Insert
    void ph19652Insert(TheLoai a);
    @Query("select*from TheLoai")
    List<TheLoai> ph19652getAll();
}

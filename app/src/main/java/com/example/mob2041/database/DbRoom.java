package com.example.mob2041.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.mob2041.model.HoaDon;
import com.example.mob2041.model.HoaDonCT;
import com.example.mob2041.model.SanPham;
import com.example.mob2041.model.TheLoai;
import com.example.mob2041.dao.HoaDonCTDao;
import com.example.mob2041.dao.HoaDonDao;
import com.example.mob2041.dao.SanPhamDao;
import com.example.mob2041.dao.TheLoaiDao;

@Database(entities = {HoaDon.class, HoaDonCT.class, SanPham.class, TheLoai.class}, exportSchema = false , version = 2)
public abstract class DbRoom extends RoomDatabase {
    private static DbRoom Instance;

   public abstract HoaDonCTDao HoaDonCTDao();
   public abstract HoaDonDao HoaDonDao();
   public abstract TheLoaiDao TheLoaiDao();
   public abstract SanPhamDao SanPhamDao();

    public static synchronized DbRoom getInstance(Context context){
        if(Instance==null){
            Instance = Room.databaseBuilder(context.getApplicationContext(),DbRoom.class,"db")
                    .allowMainThreadQueries().build();
        }
        return Instance;
    }
}
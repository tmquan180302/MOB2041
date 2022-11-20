package com.example.mob2041.dao;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mob2041.model.SanPham;

import java.util.List;

@Dao
public interface SanPhamDao {
    @Insert
    void  Insert (SanPham ph19652sp );

    @Query("select*from SanPham")
    List<SanPham> ph19652getAll();

    //Cau 3
    @Query("select ph19652tenSP,sum(ph19652soLuongNhap) from SanPham where ph19652ngayNhap between :bd and :kt group by ph19652tenSP")
    Cursor ph19652getBai3(String bd, String kt);

    //Cau 4
    @Query("select ph19652maTL, ph19652maSP,ph19652soLuongNhap from SanPham where sanpham.ph19652ngayNhap between :bd and :kt")
    Cursor ph19652getBai4(String bd, String kt);

    @Query("select sp.ph19652maTL, sp.ph19652maSP , sum(ph19652soLuongXuat)  from SanPham sp join HoaDonCT hdct on hdct.ph19652maSP = sp.ph19652maSP " +
            "where ph19652ngayNhap like :nam group by sp.ph19652maTL, sp.ph19652maSP ")
    Cursor ph19652getBai42(String nam);
}

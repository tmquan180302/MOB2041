package com.example.mob2041;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mob2041.database.DbRoom;
import com.example.mob2041.databinding.DialogInsertBinding;
import com.example.mob2041.model.HoaDon;
import com.example.mob2041.model.HoaDonCT;
import com.example.mob2041.model.SanPham;
import com.example.mob2041.model.TheLoai;

public class InsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DialogInsertBinding binding = DataBindingUtil.setContentView(this,R.layout.dialog_insert);
        DbRoom ph19652db = DbRoom.getInstance(this);

        binding.btnAdd.setOnClickListener(view -> {
            String ph19652maTL = binding.edMaTheLoai.getText().toString();
            String ph19652tenTL = binding.edTenTheLoai.getText().toString();
            String ph19652maSP = binding.edMaSP.getText().toString();
            String ph19652tenSP = binding.edTenSP.getText().toString();
            String ph19652soLuongNhap = binding.edSoLuongNhap.getText().toString();
            String ph19652ngayNhap = binding.edNgayNhap.getText().toString();
            String ph19652donGiaNhap = binding.edDonGiaNhap.getText().toString();
            String ph19652maHD = binding.edMaHD.getText().toString();
            String ph19652ngayHD = binding.edNgayHD.getText().toString();
            String ph19652maHDCT = binding.edMaHDCT.getText().toString();
            String ph19652soLuongXuat = binding.edSoLuongXuat.getText().toString();
            String ph19652donGiaXuat = binding.edDonGiaXuat.getText().toString();
            if(!ph19652maTL.isEmpty() && !ph19652tenTL.isEmpty()){
                try{
                    ph19652db.TheLoaiDao().ph19652Insert(new TheLoai(ph19652maTL, ph19652tenTL));
                }catch (Exception e){

                }
            }

            if(!ph19652maSP.isEmpty() && !ph19652tenSP.isEmpty() && !ph19652soLuongNhap.isEmpty() && !ph19652ngayNhap.isEmpty() && !ph19652donGiaNhap.isEmpty() && !ph19652maTL.isEmpty()){
               try {
                   ph19652db.SanPhamDao().Insert(new SanPham(ph19652maSP,ph19652tenSP,Integer.parseInt(ph19652soLuongNhap),ph19652ngayNhap,Integer.parseInt(ph19652donGiaNhap),ph19652maTL));
               }catch (Exception e){

               }
            }

            if(!ph19652maHD.isEmpty() && !ph19652ngayHD.isEmpty()){
               try{
                   ph19652db.HoaDonDao().ph19652Insert(new HoaDon(ph19652maHD,ph19652ngayHD));
               }catch (Exception e){

               }
            }

            if(!ph19652maHDCT.isEmpty() && !ph19652maHD.isEmpty() && !ph19652maSP.isEmpty() && !ph19652soLuongXuat.isEmpty() && !ph19652donGiaXuat.isEmpty()){
                try {
                    ph19652db.HoaDonCTDao().ph19652Insert(new HoaDonCT(ph19652maHDCT, ph19652maHD, ph19652maSP,Integer.parseInt(ph19652soLuongXuat),Integer.parseInt(ph19652donGiaXuat)));
                }catch (Exception e){

                }
            }
            finish();
        });

    }
}
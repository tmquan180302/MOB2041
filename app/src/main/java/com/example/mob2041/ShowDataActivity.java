package com.example.mob2041;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mob2041.database.DbRoom;
import com.example.mob2041.model.HoaDon;
import com.example.mob2041.model.HoaDonCT;
import com.example.mob2041.model.SanPham;
import com.example.mob2041.model.TheLoai;

import java.util.ArrayList;
import java.util.List;

public class ShowDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        DbRoom ph19652db = DbRoom.getInstance(this);

        List<TheLoai> ph19652listTL = ph19652db.TheLoaiDao().ph19652getAll();
        List<SanPham> ph19652listSP = ph19652db.SanPhamDao().ph19652getAll();
        List<HoaDon> ph19652listHD = ph19652db.HoaDonDao().ph19652getAll();
        List<HoaDonCT> ph19652listHDCT = ph19652db.HoaDonCTDao().ph19652getAll();
        List<String> ph19652list = new ArrayList<>();

        ph19652list.add("Bang THE LOAI \n");
        for (TheLoai tl : ph19652listTL) {
            ph19652list.add(tl.toString() + "\n");
        }
        ph19652list.add("Bang SAN PHAM \n");
        for (SanPham tl : ph19652listSP) {
            ph19652list.add(tl.toString() + "\n");
        }
        ph19652list.add("Bang HOA DON \n");
        for (HoaDon tl : ph19652listHD) {
            ph19652list.add(tl.toString() + "\n");
        }
        ph19652list.add("Bang HOA DON CHI TIET \n");
        for (HoaDonCT tl : ph19652listHDCT) {
            ph19652list.add(tl.toString() + "\n");
        }

        ArrayAdapter<String> ph19652adapter = new ArrayAdapter<>(this, R.layout.item, ph19652list);
        ListView ph19652lv = findViewById(R.id.lv);
        ph19652lv.setAdapter(ph19652adapter);
    }
}
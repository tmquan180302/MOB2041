package com.example.mob2041;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mob2041.database.DbRoom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    DbRoom ph19652db;
    TextView ph19652tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ph19652btnShowData = findViewById(R.id.button);
        Button ph19652btnBai2 = findViewById(R.id.button2);
        Button ph19652btnBai3 = findViewById(R.id.button3);
        Button ph19652btnBai4 = findViewById(R.id.button4);
        EditText ph19652edBai3 = findViewById(R.id.edBai3);
        EditText ph19652edBai4 = findViewById(R.id.edBai4);
        ph19652tv = findViewById(R.id.textView);
        //Cau 1 tao CSDL
        ph19652db = DbRoom.getInstance(getApplicationContext());

        ph19652btnShowData.setOnClickListener(view -> {
            startActivity(new Intent(this,ShowDataActivity.class));
        });

        ph19652btnBai2.setOnClickListener(view -> {
            //Dùng dialog de them
            startActivity(new Intent(this,InsertActivity.class));
        });

        ph19652btnBai3.setOnClickListener(view -> {
            String ph19652keyWord = ph19652edBai3.getText().toString() + "%";
            Cursor ph19652cursor = ph19652db.SanPhamDao().ph19652getBai42(ph19652keyWord);
            String ph19652s = "";
            while (ph19652cursor.moveToNext()){
                ph19652s += "Mã thể loại: " + ph19652cursor.getString(0) ;
                ph19652s+= "  Mã sản phẩm: " + ph19652cursor.getString(1) ;
                ph19652s+= "  Số lượng xuất: " + ph19652cursor.getString(2) + "\n";
            }
            ph19652cursor.close();
            ph19652tv.setText(ph19652s);
        });

        ph19652btnBai4.setOnClickListener(view -> {
            try {
                String ph19652batDau = ph19652edBai4.getText().toString();
                SimpleDateFormat ph19652format = new SimpleDateFormat("yyyy-MM-dd");
                Calendar ph19652calendar = Calendar.getInstance();
                Date date = ph19652format.parse(ph19652batDau);
                ph19652calendar.setTime(date);
                ph19652calendar.add(Calendar.DATE,7);//xu ly ngay oke r
                String ph19652ketThuc = ph19652format.format(ph19652calendar.getTime());
                Cursor ph19652cursor = ph19652db.SanPhamDao().ph19652getBai4(ph19652batDau,ph19652ketThuc);

                //Doc du lieu lay duoc
                StringBuilder ph19652sb = new StringBuilder("tu " + ph19652batDau + " den " + ph19652ketThuc + "\n");
                while (ph19652cursor.moveToNext()){
                    ph19652sb.append( "Ma the loai: "+ ph19652cursor.getString(0) + ", Ma san pham: " + ph19652cursor.getString(1) + ", So luong: " + ph19652cursor.getInt(2)+ "\n");
                }
                ph19652cursor.close();
                if(ph19652sb.toString().isEmpty()){
                    ph19652tv.setText("Không có dữ liệu");
                }else {
                    ph19652tv.setText(ph19652sb.toString());
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
    }
}
package com.test.bt5_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<SinhVien> arrayList;
    Apdater adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new Apdater(this, R.layout.sinhvienlayout, arrayList);
        listView.setAdapter(adapter);

    }
    private void AnhXa(){
        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new SinhVien(R.drawable.anh1, "Nguyễn Thị Hoa", "20T1"));
        arrayList.add(new SinhVien(R.drawable.anh2, "Trần Văn Minh", "19DX2"));
        arrayList.add(new SinhVien(R.drawable.anh3, "Lê Thị Trúc Vy", "18VL1"));
        arrayList.add(new SinhVien(R.drawable.anh4, "Hồ Thị Minh Tâm", "20HTP1"));
        arrayList.add(new SinhVien(R.drawable.anh5, "Phạm Hồng Trâm", "21T2"));
    }
}
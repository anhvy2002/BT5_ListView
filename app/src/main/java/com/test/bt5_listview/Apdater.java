package com.test.bt5_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Apdater extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SinhVien> arraylist;

    public Apdater(Context context, int layout, List<SinhVien> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        SinhVien sinhVien = arraylist.get(i);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView tv_ten = view.findViewById(R.id.tv_ten);
        TextView tv_thongTin = view.findViewById(R.id.tv_thongTin);

        imageView.setImageResource(sinhVien.getHinh());
        tv_ten.setText(sinhVien.getTen());
        tv_thongTin.setText(sinhVien.getThongTin());
        return view;
    }
}

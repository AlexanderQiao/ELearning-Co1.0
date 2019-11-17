package com.example.elearning;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class courseinfor extends RecyclerView.Adapter<courseinfor.VH> {

    private VH holder;
    private int position;

    public static class VH extends RecyclerView.ViewHolder{
//        public final TextView title;

        public VH(View v){
            super(v);
//            title = (TextView)v.findViewByID(R.id.title);
//            title = "";
        }
    }

    private List<String> mDatas;
    public courseinfor(List<String> data) {
        this.mDatas = data;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

//        holder.title.setText(mDatas.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //item 点击事件
            }
        });
    }
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//
//    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.courseinfor, parent, false);
        return new VH(v);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}
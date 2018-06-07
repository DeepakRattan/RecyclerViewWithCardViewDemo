package com.example.deepakrattan.recyclerviewwithcardviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by deepak.rattan on 2/13/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<SingleRow> singleRowArrayList;

    public MyAdapter(Context context, ArrayList<SingleRow> singleRowArrayList) {
        this.context = context;
        this.singleRowArrayList = singleRowArrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SingleRow s = singleRowArrayList.get(position);
        String name = s.getName();
        String designation = s.getDesignation();
        int image = s.getImage();

        holder.iv.setImageResource(image);
        holder.txtName.setText(name);
        holder.txtDesignation.setText(designation);


    }

    @Override
    public int getItemCount() {
        return singleRowArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView txtName, txtDesignation;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv =  itemView.findViewById(R.id.iv1);
            txtName = itemView.findViewById(R.id.txtName1);
            txtDesignation =  itemView.findViewById(R.id.txtDesignation);
        }
    }


}

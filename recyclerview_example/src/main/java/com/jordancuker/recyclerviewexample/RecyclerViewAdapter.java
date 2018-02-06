package com.jordancuker.recyclerviewexample;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private ArrayList<DataHolder> data;
    private LayoutInflater inflater;

    RecyclerViewAdapter(Context context, ArrayList<DataHolder> data){
        inflater=LayoutInflater.from(context);
        this.data = data;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recyclerview_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.contentText.setText(data.get(position).getText());
        holder.imageView.setImageResource(data.get(position).getResId());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView contentText;
        ImageView imageView, shareButton, starButton, xButton;

        public MyViewHolder(View itemView){
            super(itemView);
            contentText = (TextView) itemView.findViewById(R.id.contentText);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            shareButton = (ImageView) itemView.findViewById(R.id.shareButton);
            starButton = (ImageView) itemView.findViewById(R.id.starButton);
            xButton = (ImageView) itemView.findViewById(R.id.xButton);
        }
    }


}

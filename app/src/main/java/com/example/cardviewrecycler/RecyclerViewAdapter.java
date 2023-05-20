package com.example.cardviewrecycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//Paso 1 - 3

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    //Paso 5
    private Context mContext;
    private List<Peliculas> mData;

    public RecyclerViewAdapter(Context mContext, List<Peliculas> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    //Paso 4
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //Paso 9
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.activity_cardview_itm_peliculas, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Paso 11
        holder.tv_pelicualas_title.setText(mData.get(position).getTitle());
        holder.img_peliculas_thumbnail.setImageResource(mData.get(position).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, Peliculas_Activity.class);
                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Category", mData.get(position).getCategory());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                mContext.startActivity(intent);
            }
        });

    }

    //Paso 7
    @Override
    public int getItemCount() {
        return mData.size();
    }

    //Paso 2
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        //Paso 8

        TextView tv_pelicualas_title;
        ImageView img_peliculas_thumbnail;
        CardView cardView;

        //Paso 2.1

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //Paso 10
            tv_pelicualas_title = (TextView) itemView.findViewById(R.id.pelicula_title_id);
            img_peliculas_thumbnail = (ImageView) itemView.findViewById(R.id.peliculas_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }

}

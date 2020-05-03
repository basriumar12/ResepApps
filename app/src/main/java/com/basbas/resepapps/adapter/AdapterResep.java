package com.basbas.resepapps.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.basbas.resepapps.R;
import com.basbas.resepapps.model.ModelResep;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AdapterResep extends RecyclerView.Adapter<AdapterResep.MyHolder> {
    private ArrayList<ModelResep> list;
    private OnItemClickCallback onItemClickCallback;

    public interface OnItemClickCallback {
        void onItemClicked(ModelResep data);
    }
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public AdapterResep(ArrayList<ModelResep> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public AdapterResep.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent
                .getContext()).inflate(R.layout.item_view_resep, parent, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterResep.MyHolder holder, int position) {
    //set data
        holder.tvNamaResep.setText(list.get(position).getNamaResep());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.mipmap.ic_launcher);
        requestOptions.error(R.mipmap.ic_launcher);
        requestOptions.override(350,550);

        Glide.with(holder.itemView.getContext())
                .setDefaultRequestOptions(requestOptions)
                .load(list.get(position).getGambarResep())
                .into(holder.imgResep);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi ketika item di klik
                onItemClickCallback.onItemClicked(list.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
       //variabel
        TextView tvNamaResep;
        ImageView imgResep;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            //inisialisasi
            tvNamaResep = itemView.findViewById(R.id.tv_nama_resep);
            imgResep = itemView.findViewById(R.id.img_resep);

        }
    }
}

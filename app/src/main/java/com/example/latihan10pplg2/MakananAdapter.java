package com.example.latihan10pplg2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {
    private Context context;
    private List<MakananModel> MakananList;
    private ItemClickListener mClickListener;

    public MakananAdapter(Context context, List<MakananModel> makananList) {
        this.context = context;
        this.MakananList = makananList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MakananModel mkn = this.MakananList.get(position);
        holder.tvNama.setText(mkn.getNama());
        holder.tvDesc.setText(mkn.getDesc());
        Glide.with(holder.itemView.getContext())
                .load(mkn.getImgSrc())
                .into(holder.imgMkn);
    }

    @Override
    public int getItemCount() {
        return this.MakananList.size();}

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvNama, tvDesc;
        ImageView imgMkn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            imgMkn = itemView.findViewById(R.id.img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }
    MakananModel getItem(int id) {
        return MakananList.get(id);
    }

    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
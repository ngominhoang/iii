package com.example.myapplicationclothing;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClothingListAdapter extends RecyclerView.Adapter<ClothingListAdapter.NameViewHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Clothing> nameArrayList;

    Context context;

    public ClothingListAdapter(Context context, ArrayList<Clothing> nameArrayList) {
        layoutInflater= LayoutInflater.from(context) ;
        this.nameArrayList = nameArrayList;
        this.context= context;
    }

    @NonNull
    @Override
    public ClothingListAdapter.NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.clothing_item, parent, false);
        return new NameViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ClothingListAdapter.NameViewHolder holder, int position) {
        Clothing mCurrent= nameArrayList.get(position);

        holder.img.setImageResource(mCurrent.getImg());
        holder.name.setText(mCurrent.getTenao());
        holder.price.setText(mCurrent.getGiatien());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity2.class);

                intent.putExtra("img", mCurrent.getImg());
                intent.putExtra("name", mCurrent.getTenao());
                intent.putExtra("gia", mCurrent.getGiatien());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameArrayList.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView price;
        public ImageView img;
        ClothingListAdapter clothingListAdapter;

        public NameViewHolder(@NonNull View itemView, ClothingListAdapter adapter) {
            super(itemView);
            img = itemView.findViewById(R.id.rcvAnh);
            name = itemView.findViewById(R.id.rcvTen);
            price = itemView.findViewById(R.id.rcvGia);

            this.clothingListAdapter = adapter;
        }
    }
}

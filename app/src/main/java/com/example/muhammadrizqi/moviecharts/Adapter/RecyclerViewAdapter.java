package com.example.muhammadrizqi.moviecharts.Adapter;

/**
 * Created by Muhammad Rizqi on 04/12/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import com.example.muhammadrizqi.moviecharts.ItemObject;
import com.example.muhammadrizqi.moviecharts.R;
import com.example.muhammadrizqi.moviecharts.Holder.RecyclerViewHolders;

public  class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    public List<ItemObject.Results> itemList;
    public Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject.Results> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        Picasso.with(context).load
                ("https://image.tmdb.org/t/p/w185" + itemList.get(position).poster_path)
                .placeholder(R.drawable.logo_item)
                .into(holder.img);

        holder.original_title.setText(itemList.get(position).original_title);
        holder.overview = itemList.get(position).overview;
        holder.thn = itemList.get(position).release_date;
        holder.backdrop = "https://image.tmdb.org/t/p/w600" + itemList.get(position).backdrop_path;
        holder.vote = itemList.get(position).vote_average;
        holder.id_film  = itemList.get(position).id;
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public void setFilter(List<ItemObject.Results> countryModels) {
        itemList = new ArrayList<>();
        itemList.addAll(countryModels);
        notifyDataSetChanged();
    }
}
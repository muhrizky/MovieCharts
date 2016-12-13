package com.example.muhammadrizqi.moviecharts.Holder;

/**
 * Created by Muhammad Rizqi on 04/12/2016.
 */

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muhammadrizqi.moviecharts.R;

public class RecyclerHoldersTrailer extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtType;
    public TextView txtName;
    public String key;

    public RecyclerHoldersTrailer(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        txtName = (TextView)itemView.findViewById(R.id.txtName);
        txtType = (TextView)itemView.findViewById(R.id.txtType);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com/watch?v=" + key));
        i.putExtra("name", txtName.getText().toString());
        i.putExtra("type", txtType.getText().toString());
        view.getContext().startActivity(i);
    }

}

package com.example.assignment2.Utility;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment2.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView poster;
    TextView title;
    TextView year;
    MovieClickListener clickListener;
    public MyViewHolder(@NonNull View movieView, MovieClickListener clickListener) {
        super(movieView);

        poster = movieView.findViewById(R.id.moviePoster);
        title = movieView.findViewById(R.id.movieTitle);
        year = movieView.findViewById(R.id.movieRelease);

        this.clickListener = clickListener;

        movieView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClick(v, getAdapterPosition());
            }
        });


    }
}

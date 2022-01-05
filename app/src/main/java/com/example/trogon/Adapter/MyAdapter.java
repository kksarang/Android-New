package com.example.trogon.Adapter;

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

import com.bumptech.glide.Glide;
import com.example.trogon.Activity.CourseDetails;
import com.example.trogon.Model.ModelClass;
import com.example.trogon.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<ModelClass> modelArrayList1;
    private Context context;

    public MyAdapter(ArrayList<ModelClass> modelArrayList1, Context context) {

        this.modelArrayList1 = modelArrayList1;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.course_iteams, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelClass model = modelArrayList1.get(position);
        holder.title.setText(model.getTitle());
        holder.rate.setText(model.getPrice());
        Glide.with(holder.image.getContext()).load(model.getThumbnail()).into(holder.image);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CourseDetails.class);
                intent.putExtra("title", model.getTitle());
                intent.putExtra("prize", model.getFull_price());
                intent.putExtra("image", model.getThumbnail());
                intent.putExtra("total", model.getTotal_enrollment());
                intent.putExtra("rate", "" + model.getRating());
                intent.putExtra("rate1", "" + model.getNumber_of_ratings());
                //       intent.putExtra("video",""+model.getVideo_url());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelArrayList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView rate;
        ImageView image;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.course_txt);
            rate = itemView.findViewById(R.id.course_prize);
            image = itemView.findViewById(R.id.course_img);
            cardView = itemView.findViewById(R.id.card_view_id);
        }
    }
}

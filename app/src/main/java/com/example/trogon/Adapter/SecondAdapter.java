package com.example.trogon.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.trogon.Model.CategoryModel;
import com.example.trogon.R;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder> {

//    public int[] colorCodes = new int[]
//            {R.drawable.grt,
//                    R.drawable.bbbb,
//                    R.drawable.df,
//                    R.drawable.fre,
//            };
    public String[] mColors = {"#3F51B5","#FF9800","#009688","#673AB7"};

    private ArrayList<CategoryModel> arrayList;
    private Context context;

    public SecondAdapter(ArrayList<CategoryModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.categories_iteams, parent, false);

        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CategoryModel model = arrayList.get(position);
        holder.name.setText(model.getName());
        holder.size.setText(model.getNumber_of_courses());
        Glide.with(holder.img.getContext()).load(model.getThumbnail()).into(holder.img);

        holder.cardView.setBackgroundColor(Color.parseColor(mColors[position % 4]));
        // 4 can be replaced by mColors.length



//        String color="#"+mColors[position];
//        for(int c=1;c<mColors.length;c++){
//            holder.cardView.setCardBackgroundColor(Color.parseColor(color));
//            if(c==mColors.length){ c=1;}}
      //  holder.itemView.setBackgroundResource((backgroundColors.length));
       // holder.itemView.setBackgroundResource((backgroundColors.length) % position);
    //    int index = position % backgroundColors.length;

    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, size;
        ImageView img;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.category_txt);
            size = itemView.findViewById(R.id.category_size);
            img = itemView.findViewById(R.id.category_img);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }
}

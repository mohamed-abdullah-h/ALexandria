package com.example.alex_city;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Data_without_img_Adapter extends RecyclerView.Adapter<Data_without_img_Adapter.View_Holder2> {

    ArrayList<Location> list_Attraction;

    public Data_without_img_Adapter(ArrayList<Location> list_Attraction) {
        this.list_Attraction = list_Attraction;
    }

    @NonNull
    @Override
    public View_Holder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.container_without_img, parent, false);

        return new View_Holder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder2 holder, int position) {
        Location location = list_Attraction.get(position);
        holder.Bind(location);
    }

    @Override
    public int getItemCount() {
        return list_Attraction.size();
    }

    public class View_Holder2 extends RecyclerView.ViewHolder {

        private TextView name2;
        private TextView address2;
        private TextView phone2;
        private TextView textView2;
        public View_Holder2(@NonNull View itemView) {
            super(itemView);
            name2 = itemView.findViewById(R.id.name2);
            address2 = itemView.findViewById(R.id.address2);
            phone2 = itemView.findViewById(R.id.phone2);
            textView2 = itemView.findViewById(R.id.textView2);
        }

        public void Bind(Location location) {
            name2.setText(location.getD_name());
            address2.setText(location.getAddress());
            if (location.getPhone_number() == null) {
                phone2.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
            } else {
                phone2.setText(location.getPhone_number());
            }
        }
    }
}

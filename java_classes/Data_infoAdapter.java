package com.example.alex_city;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Data_infoAdapter extends RecyclerView.Adapter<Data_infoAdapter.View_holder> {
    ArrayList<Location> list;

    public Data_infoAdapter(ArrayList<Location> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public View_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.container, parent, false);
        return new View_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_holder holder, int position) {
        Location dataInfo = list.get(position);
        holder.Bind_data(dataInfo);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class View_holder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name;
        TextView location;
        TextView phone;
        TextView other;


        public View_holder(View holder) {
            super(holder);
            img = holder.findViewById(R.id.img);
            location = holder.findViewById(R.id.location_info);
            phone = holder.findViewById(R.id.info);
            name = holder.findViewById(R.id.name);
            other = holder.findViewById(R.id.other_info);
        }

        public void Bind_data(Location dataInfo) {
            img.setImageResource(dataInfo.getIamge_resource());
            location.setText(dataInfo.getAddress());
            if (dataInfo.getPhone_number() == null) {
                phone.setVisibility(View.GONE);
                other.setVisibility(View.GONE);

            } else {
                phone.setText(dataInfo.getPhone_number());
            }
            name.setText(dataInfo.getD_name());
        }
    }
}

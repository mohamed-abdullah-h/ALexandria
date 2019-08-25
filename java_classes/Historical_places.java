package com.example.alex_city;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Historical_places extends Fragment {
    private RecyclerView recyclerView;
    private Data_infoAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Location> data_list;

    public Historical_places() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        Initialize Variables and Inflate the View
        View view = inflater.inflate(R.layout.general_view, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new Data_infoAdapter(data_list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data_list = new ArrayList<>();
//        add location objects to data_list
        data_list.add(new Location(R.drawable.nam, getString(R.string.address_National_Museum), getString(R.string.phonNA), getString(R.string.National_Museum)));
        data_list.add(new Location(R.drawable.alex, getString(R.string.address_alexLibrary), getString(R.string.phone_Alex), getString(R.string.Alex_library)));
        data_list.add(new Location(R.drawable.alex_aquaruim, getString(R.string.address_aqua), getString(R.string.phone_aqua), getString(R.string.aqua_name)));
        data_list.add(new Location(R.drawable.jol, getString(R.string.address_Jewelry), getString(R.string.phone_Jewelry), getString(R.string.Jewelry_museum)));
        data_list.add(new Location(R.drawable.montazah_palace, getString(R.string.address_montzah), null, getString(R.string.montzah)));
        data_list.add(new Location(R.drawable.mosque, getString(R.string.address_mosque), null, getString(R.string.mosque)));
        data_list.add(new Location(R.drawable.opera, getString(R.string.address_opera), getString(R.string.phone_opera), getString(R.string.opera)));
        data_list.add(new Location(R.drawable.qaitbay_castle_in_alexandria, getString(R.string.address_Qaitbay), null, getString(R.string.Qaitbay)));
        data_list.add(new Location(R.drawable.roman, getString(R.string.address_roman), getString(R.string.phone_roman), getString(R.string.roman)));
        data_list.add(new Location(R.drawable.roman_theatre, getString(R.string.address_roman_theatre), getString(R.string.phone_roman_theatre), getString(R.string.roman_theatre)));
        data_list.add(new Location(R.drawable.yahood, getString(R.string.address_yahood), null, getString(R.string.yahood)));
    }
}

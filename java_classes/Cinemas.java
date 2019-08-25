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
public class Cinemas extends Fragment {

    // Required empty public constructor
    public Cinemas() {

    }

    private RecyclerView recyclerView;
    private Data_without_img_Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Location> data_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        Initialize Variables and Inflate the View
        View view = inflater.inflate(R.layout.general_view, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new Data_without_img_Adapter(data_list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data_list = new ArrayList<>();
        //        add location objects to data_list
        data_list.add(new Location(getString(R.string.address_FoxCinema), null, getString(R.string.name_FoxCinema)));
        data_list.add(new Location(getString(R.string.address_Renaissance), getString(R.string.phone_Renaissance), getString(R.string.name_Renaissance)));
        data_list.add(new Location(getString(R.string.address_San_Stefano), getString(R.string.phone__San_Stefano), getString(R.string.name_San_Stefano)));
        data_list.add(new Location(getString(R.string.address_Cine_Plex), getString(R.string.phone_Cine_Plex), getString(R.string.name_Cine_Plex)));
        data_list.add(new Location(getString(R.string.address_Kiroseiz), getString(R.string.phone_Kiroseiz), getString(R.string.name_Kiroseiz)));
        data_list.add(new Location(getString(R.string.address_Amir_Cinema), getString(R.string.phone_Amir_Cinema), getString(R.string.name_Amir_Cinema)));
        data_list.add(new Location(getString(R.string.address_Alex_Metro_Cinema), getString(R.string.phone_Alex_Metro_Cinema), getString(R.string.name_Alex_Metro_Cinema)));
        data_list.add(new Location(getString(R.string.address_Royal_Cinema), getString(R.string.phone_Royal_Cinema), getString(R.string.name_Royal_Cinema)));
        data_list.add(new Location(getString(R.string.address_Marseilia_Cinema), getString(R.string.phone_Marseilia_Cinema), getString(R.string.name_Marseilia_Cinema)));
        data_list.add(new Location(getString(R.string.address_Feryal_Cinema), getString(R.string.phone_Feryal_Cinema), getString(R.string.name_Feryal_Cinema)));
        data_list.add(new Location(getString(R.string.address_Rio_Cinema), getString(R.string.phone_Rio_Cinema), getString(R.string.name_Rio_Cinema)));
        data_list.add(new Location(getString(R.string.address_Strand_Cinema), getString(R.string.phone_Strand_Cinema), getString(R.string.name_Strand_Cinema)));
        data_list.add(new Location(getString(R.string.address_Porto_Marina_Cinema), null, getString(R.string.name_Porto_Marina_Cinema)));
        data_list.add(new Location(getString(R.string.address_Rosanna_Cinema), getString(R.string.phone_Rosanna_Cinema), getString(R.string.name_Rosanna_Cinema)));

    }
}

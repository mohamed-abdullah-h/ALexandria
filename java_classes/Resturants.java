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
public class Resturants extends Fragment {


    public Resturants() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private Data_infoAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Location> data_list;

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
        data_list.add(new Location(R.drawable.rbeach, getString(R.string.address_rBeach_Restaurant_Lounge), getString(R.string.phone_rBeach_Restaurant_Lounge), getString(R.string.name_rBeach_Restaurant_Lounge)));
        data_list.add(new Location(R.drawable.rbyblos, getString(R.string.address_rByblos_Restaurant), getString(R.string.phone_rByblos_Restaurant), getString(R.string.name_rByblos_Restaurant)));
        data_list.add(new Location(R.drawable.rcala, getString(R.string.address_rCalla_Restaurant), getString(R.string.phone_rCalla_Restaurant), getString(R.string.name_rCalla_Restaurant)));
        data_list.add(new Location(R.drawable.rcountry, getString(R.string.address_rCountry_Hills), getString(R.string.phone_rCountry_Hills), getString(R.string.name_rCountry_Hills)));
        data_list.add(new Location(R.drawable.rcrave, getString(R.string.address_rCrave), getString(R.string.phone_rCrave), getString(R.string.name_rCrave)));
        data_list.add(new Location(R.drawable.rfayrouz, getString(R.string.address_rFayrouz_Grills), getString(R.string.phone_rFayrouz_Grills), getString(R.string.name_rFayrouz_Grills)));
        data_list.add(new Location(R.drawable.rjungle, getString(R.string.address_rJungle), getString(R.string.phone_rJungle), getString(R.string.name_rJungle)));
        data_list.add(new Location(R.drawable.rpapa, getString(R.string.address_rPapa_Jones), null, getString(R.string.name_rPapa_Jones)));
        data_list.add(new Location(R.drawable.rprotofino, getString(R.string.address_rPortofino), getString(R.string.phone_rPortofino), getString(R.string.name_rPortofino)));
        data_list.add(new Location(R.drawable.rravioli, getString(R.string.address_rRavioli), getString(R.string.phone_rRavioli), getString(R.string.name_rRavioli)));
        data_list.add(new Location(R.drawable.rroberto, getString(R.string.address_rRoberto_Italian_Restaurant), getString(R.string.phone_rRoberto_Italian_Restaurant), getString(R.string.name_rRoberto_Italian_Restaurant)));
        data_list.add(new Location(R.drawable.rsantrobens, getString(R.string.address_rSaint_Tropez), getString(R.string.phone_rSaint_Tropez), getString(R.string.name_rSaint_Tropez)));
        data_list.add(new Location(R.drawable.rstefano, getString(R.string.address_rStefanos), getString(R.string.phone_rStefanos), getString(R.string.name_rStefanos)));
        data_list.add(new Location(R.drawable.rsurian, getString(R.string.address_rSyrian), getString(R.string.phone_rSyrian), getString(R.string.name_rSyrian)));
        data_list.add(new Location(R.drawable.rtic, getString(R.string.address_rTac_Roof), getString(R.string.phone_rTac_Roof), getString(R.string.name_rTac_Roof)));

    }
}

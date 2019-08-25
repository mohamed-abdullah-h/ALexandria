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

public class Malls extends Fragment {


    public Malls() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private Data_without_img_Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Location> data_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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
        data_list.add(new Location(getString(R.string.address_mCity_Centre_Alexandria), getString(R.string.phone_mCity_Centre_Alexandria), getString(R.string.name_mCity_Centre_Alexandria)));
        data_list.add(new Location(getString(R.string.address_mGreen_Plaza_Mall), getString(R.string.phone_mGreen_Plaza_Mall), getString(R.string.name_mGreen_Plaza_Mall)));
        data_list.add(new Location(getString(R.string.address_mSan_Stefano_Grand_Plaza), getString(R.string.phone_mSan_Stefano_Grand_Plaza), getString(R.string.name_mSan_Stefano_Grand_Plaza)));
        data_list.add(new Location(getString(R.string.address_mMontazah_Mall), null, getString(R.string.name_mMontazah_Mall)));
        data_list.add(new Location(getString(R.string.address_mAl_Multaqa_Mall), getString(R.string.phone_mAl_Multaqa_Mall), getString(R.string.name_mAl_Multaqa_Mall)));
        data_list.add(new Location(getString(R.string.address_mDeep_Mall), getString(R.string.phone_mDeep_Mall), getString(R.string.name_mDeep_Mall)));
        data_list.add(new Location(getString(R.string.address_mCarpet_City), getString(R.string.phone_mCarpet_City), getString(R.string.name_mCarpet_City)));
        data_list.add(new Location(getString(R.string.address_mLotus_Stores), null, getString(R.string.name_mLotus_Stores)));
        data_list.add(new Location(getString(R.string.address_mMajestic_Mall), null, getString(R.string.name_mMajestic_Mall)));
        data_list.add(new Location(getString(R.string.address_mAboAl), getString(R.string.phone_mAboAl), getString(R.string.name_mAboAli)));
        data_list.add(new Location(getString(R.string.address_mSQUARE_JEANS), getString(R.string.phone_mSQUARE_JEANS), getString(R.string.name_mSQUARE_JEANS)));
        data_list.add(new Location(getString(R.string.address_mZahran_Mall), getString(R.string.phone_mZahran_Mall), getString(R.string.name_mZahran_Mall)));
        data_list.add(new Location(getString(R.string.address_mAgamy_Star_Mall), getString(R.string.phone_mAgamy_Star_Mall), getString(R.string.name_mAgamy_Star_Mall)));
        data_list.add(new Location(getString(R.string.address_mRoyal_Mall), null, getString(R.string.name_mRoyal_Mall)));


    }
}

package com.example.mad_project.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.mad_project.R;

public class SellerReputationFragment extends Fragment {
    public SellerReputationFragment() {
        super(R.layout.fragment_seller_reputation);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_seller_reputation, container, false);
        return view;
    }
}
package com.example.mad_project.fragments;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.example.mad_project.R;

public class BuyerHomeFragment extends Fragment {
    public BuyerHomeFragment() {
        super(R.layout.fragment_buyer_home);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buyer_home, container, false);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        return view;
    }
}
package com.example.coffeehouse;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class TintucFragment extends Fragment implements View.OnClickListener{

    ImageView img1_229, img2_229;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_tintuc, container, false);

        img1_229 = root.findViewById(R.id.imageNotify);
        img1_229.setOnClickListener(this);
        img2_229 = root.findViewById(R.id.imageAdd);
        img2_229.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify) {
            Intent dsp = new Intent(TintucFragment.this.getActivity(), Notify.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageAdd) {
            Intent dsp = new Intent(TintucFragment.this.getActivity(), Information.class);
            startActivity(dsp);
        }
    }
}
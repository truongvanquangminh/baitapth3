package com.example.coffeehouse;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class TaikhoanFragment extends Fragment implements View.OnClickListener{
    ImageView img_229;
    Button bt1_229, bt2_229;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_taikhoan, container, false);

        img_229 = r.findViewById(R.id.imageView);
        img_229.setOnClickListener(this);

        bt1_229 = r.findViewById(R.id.button2);
        bt1_229.setOnClickListener(this);

        bt2_229 = r.findViewById(R.id.button_DangXuat);
        bt2_229.setOnClickListener(this);
        return r;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView) {
            Intent dsp = new Intent(TaikhoanFragment.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button2) {
            Intent dsp = new Intent(TaikhoanFragment.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button_DangXuat) {
            Intent dsp = new Intent(TaikhoanFragment.this.getActivity(), Login.class);
            startActivity(dsp);
        }
    }
}
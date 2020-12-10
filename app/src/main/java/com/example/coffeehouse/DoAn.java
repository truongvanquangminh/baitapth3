package com.example.coffeehouse;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class DoAn extends Fragment {
    private GridView gvmon;
    private SanPhamAdapter spadt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.do_an, container, false);

        gvmon = r.findViewById(R.id.gv_mon);
        spadt = new SanPhamAdapter(DoAn.this.getActivity(), R.layout.item);
        gvmon.setAdapter(spadt);
        registerForContextMenu(gvmon);
        fakeData();
        addEvents();
        return r;
    }

    private void fakeData() {
        spadt.add(new DoUong(R.drawable.maccasocola, "Macca Phủ Socola", "45.000"));
        spadt.add(new DoUong(R.drawable.mitsay, "Mít sấy", "20.000"));
        spadt.add(new DoUong(R.drawable.bonglantrungmuoi, "Bông lan trứng muối", "29.000"));
    }
    private void addEvents() {
        gvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(DoAn.this.getActivity());
                dialog.setContentView(R.layout.dathang);
                dialog.show();
            }
        });
    }
}

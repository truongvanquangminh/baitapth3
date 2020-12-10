package com.example.coffeehouse;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class ThucUong extends Fragment {
    private GridView gvmon;
    private SanPhamAdapter spadt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.thuc_uong, container, false);

        gvmon = r.findViewById(R.id.gv_mon);
        spadt = new SanPhamAdapter(ThucUong.this.getActivity(), R.layout.item);
        gvmon.setAdapter(spadt);
        registerForContextMenu(gvmon);
        fakeData();
        addEvents();
        return r;
    }

    private void fakeData() {
        spadt.add(new DoUong(R.drawable.cafedenda, "Cà phê đen đá", "15.000"));
        spadt.add(new DoUong(R.drawable.caphesua, "Cà phê sữa đá", "17.000"));
        spadt.add(new DoUong(R.drawable.nuocepcam, "Nước ép cam", "20.000"));
        spadt.add(new DoUong(R.drawable.chanhday, "Nước ép chanh dây", "17.000"));
        spadt.add(new DoUong(R.drawable.bacxiu1, "Bạc xỉu", "15.000"));
        spadt.add(new DoUong(R.drawable.trasuaday, "Trà sữa dâu tây", "17.000"));
        spadt.add(new DoUong(R.drawable.tradao, "Trà đào", "20.000"));
        spadt.add(new DoUong(R.drawable.kemdau, "Kem dâu tươi", "15.000"));
    }
    private void addEvents() {
        gvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(ThucUong.this.getActivity());
                dialog.setContentView(R.layout.dathang);
                dialog.show();
            }
        });
    }
}

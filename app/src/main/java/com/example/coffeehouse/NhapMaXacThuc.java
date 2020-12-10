package com.example.coffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NhapMaXacThuc extends AppCompatActivity {
    EditText nhapmaxacthuc_229;
    Button btnmaxacthuc_229;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_ma_xac_thuc);
        //1. Nút quay lại
        ImageView quaylai2_nhapsodienthoai_229 = (ImageView) findViewById(R.id.quaylai2_nhapsodienthoai_229);
        quaylai2_nhapsodienthoai_229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNhapSoDienThoai();
            }
        });
        //2. Nút button
        nhapmaxacthuc_229 = (EditText) findViewById(R.id.nhapmaxacthuc_229);
        btnmaxacthuc_229 = (Button) findViewById(R.id.btnmaxacthuc_229);
        btnmaxacthuc_229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str2 = nhapmaxacthuc_229.getText().toString();
                if (str2.length() == 0) {
                    Toast.makeText(NhapMaXacThuc.this, "Bạn chưa điền. Mời nhập lại", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(NhapMaXacThuc.this, "Tiếp tục", Toast.LENGTH_LONG).show();
                    openMainActivity();
                }
            }
        });

    }

    public void openNhapSoDienThoai() {
        Intent intent = new Intent(this, NhapSoDienThoai.class);
        startActivity(intent);
        finish();
    }

    //2.
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
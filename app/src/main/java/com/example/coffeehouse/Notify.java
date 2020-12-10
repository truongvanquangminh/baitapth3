package com.example.coffeehouse;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Notify extends AppCompatActivity {

    ImageView imgClose_229, img_229;
    Button bt_229;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notify_action);

        imgClose_229 = findViewById(R.id.imageClose);
        imgClose_229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        bt_229 = findViewById(R.id.button);
        bt_229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        img_229 = findViewById(R.id.image);
        img_229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    void open() {
        Intent view = new Intent(Notify.this, MainActivity.class);
        startActivity(view);
    }

    public void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}

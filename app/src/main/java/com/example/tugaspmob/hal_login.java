package com.example.tugaspmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hal_login extends AppCompatActivity {

    TextView tnama;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_login);
        tnama = findViewById(R.id.nama);
        String nama = getIntent().getStringExtra("nama");
        tnama.setText(nama);

        logout = findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hal_login.this, MainActivity.class));
            }
        });
    }
}
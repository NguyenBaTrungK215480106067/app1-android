package com.example.app1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button nutTinh, nutChuyen;
    TextView chuvi, dientich;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editText = findViewById(R.id.edit);
        nutTinh = findViewById(R.id.nutTinh);
        nutChuyen = findViewById(R.id.nutMH);
        chuvi = findViewById(R.id.cv);
        dientich = findViewById(R.id.dt);

        nutTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HinhTron tron = new HinhTron();
                int r = Integer.parseInt(editText.getText().toString());
                tron.setR(r);
                Double chuvi1 = tron.chuVi();
                Double dientich1 = tron.dienTich();
                chuvi.setText("Chu vi: "+chuvi1.toString());
                dientich.setText("Diện tích: "+dientich1.toString());
            }
        });
        nutChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
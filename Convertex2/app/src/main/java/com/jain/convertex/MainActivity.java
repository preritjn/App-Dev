package com.jain.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnClick(View view){
        EditText da = (EditText) findViewById(R.id.amount);
        String dollar = da.getText().toString();
        Double dollar1 = Double.parseDouble(dollar);
        Double dollar2 = 76.83 * dollar1;
        String toast = "=" + dollar2.toString();

        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
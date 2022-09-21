package com.example.lab2mobapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void count_elem(View view)
    {
        Button clickButton = (Button) findViewById(R.id.button);
        EditText input = (EditText) findViewById(R.id.input_text);
        TextView output = (TextView) findViewById(R.id.text_view);
        Spinner option = (Spinner) findViewById(R.id.spinner);

        String countInput = input.getText().toString();
        String spinnerChoice = option.getSelectedItem().toString();
        Counter count_method = new Counter();
        if (TextUtils.isEmpty(countInput)) {
            Toast.makeText(getApplicationContext(), "Please enter Your text!", Toast.LENGTH_LONG).show();
        }
        else {
            if (spinnerChoice.equalsIgnoreCase(getResources().getString(R.string.select_chars))) {
                output.setText(String.valueOf(count_method.Chars(countInput)));
            }
            else {
                output.setText(String.valueOf(count_method.Words(countInput)));
            }
        }
    }
}
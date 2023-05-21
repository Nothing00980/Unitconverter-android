package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        taking the button as id----
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        edittext = findViewById(R.id.editText);
//        adding listener to the button -- onclick.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                adding a messager related to the function.
//                Toast.makeText(MainActivity.this, "hey it worked", Toast.LENGTH_SHORT).show();
               String s =  edittext.getText().toString(); // storing the value of the edittext or the kg value
                int kg = Integer.parseInt(s); // this is how we covert string into int same as dart.
                double pound = 2.205 * kg; // value in pound.
                textView.setText("the corresponding value in pound is " + pound);
            }
        });

    }
}
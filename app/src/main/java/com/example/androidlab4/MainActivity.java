package com.example.androidlab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected TextView textView;
    protected TextView answer;
    protected Button button;
    protected String stringFromUI;
    Sort sort = new Sort();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.sortButton);
        answer = findViewById(R.id.answer);
        textView = findViewById(R.id.editTextInput);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                stringFromUI = textView.getText().toString();
                answer.setText(sort.sort(stringFromUI).toString());
                    sort.getList().clear();}
                catch (NumberFormatException e){
                    answer.setText(e.getMessage());
                    sort.getList().clear();
                }
            }
        };

        button.setOnClickListener(listener);
    }
}

package com.example.cl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textVStudent;
    private Button btnWhoAmI;
    private  Button btnIsNotMe;
    private CheckBox checkBoxS;
    boolean check = false;
    boolean check2 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textVStudent = findViewById(R.id.tvOut);
        btnIsNotMe = findViewById(R.id.btnItIsNotMe);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        checkBoxS = findViewById(R.id.checkBoxS);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!check){
                    textVStudent.setText("Мой номер по списку № 10 (Жеребцов Николай)");
                    check = true;
                } else {
                    textVStudent.setText("Здароу");
                    check = false;
                }

                if (!checkBoxS.isChecked()){
                    checkBoxS.setChecked(true);
                } else {
                    checkBoxS.setChecked(false);
                }

            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

    }
    public void onMyButtonClick(View view){
        if (!check2){
            textVStudent.setText("Это не я сделал!");
            Toast.makeText(this,"О, привуэт!", Toast.LENGTH_SHORT).show();
            check2 = true;
        } else {
            textVStudent.setText("Здароу");
            check2 = false;
        }
        if (!checkBoxS.isChecked()){
            checkBoxS.setChecked(true);
        } else {
            checkBoxS.setChecked(false);
        }
    }
}
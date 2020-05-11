package com.example.billyskeddfinalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plus, minus;
    ImageView battery;
    TextView level;
    int batteryLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plusBtn);
        minus = findViewById(R.id.minusBtn);
        battery = findViewById(R.id.battery);
        level = findViewById(R.id.batText);

        batteryLevel = 0;

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(batteryLevel==0){
                    battery.setImageResource(R.drawable.bat20);
                    batteryLevel++;
                    level.setText("Level 1 - 20% Battery");
                }
                else if(batteryLevel==1){
                    battery.setImageResource(R.drawable.bat30);
                    batteryLevel++;
                    level.setText("Level 2 - 30% Battery");
                }
                else if(batteryLevel==2){
                    battery.setImageResource(R.drawable.bat50);
                    batteryLevel++;
                    level.setText("Level 3 - 50% Battery");
                }
                else if(batteryLevel==3){
                    battery.setImageResource(R.drawable.bat60);
                    batteryLevel++;
                    level.setText("Level 4 - 60% Battery");
                }
                else if(batteryLevel==4){
                    battery.setImageResource(R.drawable.bat80);
                    batteryLevel++;
                    level.setText("Level 5 - 80% Battery");
                }
                else if(batteryLevel==5){
                    battery.setImageResource(R.drawable.bat90);
                    batteryLevel++;
                    level.setText("Level 6 - 90% Battery");
                }
                else if(batteryLevel==6){
                    battery.setImageResource(R.drawable.fullbat);
                    batteryLevel = 6;
                    level.setText("Level 7 - Full Battery");
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(batteryLevel==0){
                    battery.setImageResource(R.drawable.lowbat);
                    batteryLevel = 0;
                    level.setText("Level 0 - Low Battery");
                }
                else if(batteryLevel==1){
                    battery.setImageResource(R.drawable.bat20);
                    batteryLevel--;
                    level.setText("Level 1 - 20% Battery");
                }
                else if(batteryLevel==2){
                    battery.setImageResource(R.drawable.bat30);
                    batteryLevel--;
                    level.setText("Level 2 - 30% Battery");
                }
                else if(batteryLevel==3){
                    battery.setImageResource(R.drawable.bat50);
                    batteryLevel--;
                    level.setText("Level 3 - 50% Battery");
                }
                else if(batteryLevel==4){
                    battery.setImageResource(R.drawable.bat60);
                    batteryLevel--;
                    level.setText("Level 4 - 60% Battery");
                }
                else if(batteryLevel==5){
                    battery.setImageResource(R.drawable.bat80);
                    batteryLevel--;
                    level.setText("Level 5 - 80% Battery");
                }
                else if(batteryLevel==6){
                    battery.setImageResource(R.drawable.bat90);
                    batteryLevel--;
                    level.setText("Level 6 - 90% Battery");
                }
            }
        });

    }
}

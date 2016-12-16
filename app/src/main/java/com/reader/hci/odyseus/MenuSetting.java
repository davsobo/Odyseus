package com.reader.hci.odyseus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

/**
 * Created by nelvson on 16/12/16.
 */

public class MenuSetting extends AppCompatActivity {
    private Button btnNightMode,btnDayMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_setting_layout);

        //Default Night Mode as Auto Mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
        btnNightMode= (Button) findViewById(R.id.btnNightMode);
        btnDayMode= (Button) findViewById(R.id.btnDayMode);


        btnNightMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Default Night Mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                Intent i=new Intent(MenuSetting.this,main_drawer.class);
                startActivity(i);
            }
        });

        btnDayMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Default Day Mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                Intent i = new Intent(MenuSetting.this, main_drawer.class);
                startActivity(i);
            }
        });
    }
}

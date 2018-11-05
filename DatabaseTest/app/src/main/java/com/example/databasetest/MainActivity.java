package com.example.databasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MydataBseHelper mydataBseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydataBseHelper = new MydataBseHelper(this,
                "BookStore.db",null,1);
        Button createDatabase = findViewById(R.id.create_table);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydataBseHelper.getWritableDatabase();
            }
        });

    }
}

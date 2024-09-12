package com.example.inclassexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button prev_button;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i += 1;
        System.out.println( "i: " + i );

        //Here is where the Java button and the XML button get together
        prev_button = findViewById(R.id.prev_button);


        prev_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Prev Button");

                clickMethodPrev(v);

            }
        });




    }


    Intent intent;

    public void clickMethodPrev(View view) {

        Log.i("info", "button clicked ");

        Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show();

        intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);

    }
}
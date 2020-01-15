package me.refracc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.editText);
                Log.d("FirstAppTag",
                        "onClick() method called - start button");
                Toast.makeText(MainActivity.this,
                        "Start button clicked!",
                        Toast.LENGTH_LONG).show();

                tv.setText(new Date().toString());
            }
        });

    }
}

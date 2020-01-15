package me.refracc.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbox = findViewById(R.id.checkBox);
        CheckBox cbox1 = findViewById(R.id.checkBox2);
        CheckBox cbox2 = findViewById(R.id.checkBox3);

        cbox.setOnClickListener(startListener);
        cbox1.setOnClickListener(startListener1);
        cbox2.setOnClickListener(startListener2);
    }

    private View.OnClickListener startListener = new View.OnClickListener(){

        public void onClick(View v) {
            CheckBox c = findViewById(R.id.checkBox);

            Toast.makeText(MainActivity.this, c.getText(), Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener startListener1 = new View.OnClickListener(){

        public void onClick(View v) {
            CheckBox c = findViewById(R.id.checkBox2);

            Toast.makeText(MainActivity.this, c.getText(), Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener startListener2 = new View.OnClickListener(){

        public void onClick(View v) {
            CheckBox c = findViewById(R.id.checkBox3);

            Toast.makeText(MainActivity.this, c.getText(), Toast.LENGTH_LONG).show();
        }
    };
}

package me.refracc.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            RadioButton rb = (RadioButton) v;

            
        }
    }
}

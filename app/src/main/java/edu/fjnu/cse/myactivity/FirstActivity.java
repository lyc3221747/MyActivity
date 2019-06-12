package edu.fjnu.cse.myactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private final String TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button B_second = findViewById(R.id.B_Second);
        Button B_dialog = findViewById(R.id.B_dialog);
        B_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        B_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "begin FirstActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "begin FirstActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "begin FirstActivity: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "begin FirstActivity: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "begin FirstActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "begin FirstActivity: onRestart()");
    }
}

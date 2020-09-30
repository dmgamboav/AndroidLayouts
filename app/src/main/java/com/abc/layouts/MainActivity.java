package com.abc.layouts;

import android.content.Intent;
import androidx.appcompact.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goLinearLayout(View view) {
      Intent intent = new Intent(this, TableLayoutActivity.class);
      startActivity(intent);
    }
}

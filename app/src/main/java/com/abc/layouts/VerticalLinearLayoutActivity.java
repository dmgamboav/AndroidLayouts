package com.abc.layouts;

import android.content.Intent;
import androidx.appcompact.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerticalLinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vertical_linear_layout_activity);
    }

    public void goConstraintLayout(View view) {
        Intent intent = new Intent(this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }
}

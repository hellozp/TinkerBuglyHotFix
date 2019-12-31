package com.zp.testbuglyhotfix;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String num = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_showBug = findViewById(R.id.tv_showBug);
        Log.e("MainActivity",num.length()+"");
//        tv_showBug.setText("this have a bug here~~~~");
//        tv_showBug.setText("the bug had fixed~~~~");
    }

}

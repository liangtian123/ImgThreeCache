package com.lt.imgthreecache;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.lt.imgthreecache.bitmap.MyBitmapUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = findViewById(R.id.button);
        final ImageView img = findViewById(R.id.imageView);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyBitmapUtils myBitmapUtils = new MyBitmapUtils();
                myBitmapUtils.display(img,"http://b-ssl.duitang.com/uploads/blog/201512/12/20151212120309_BduTC.jpeg");
            }
        });
    }
}

package com.hfad.androidwantliang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hfad.androidwantliang.glide.GlideActivity;
import com.hfad.androidwantliang.view.ListViewActivity;
import com.hfad.androidwantliang.view.BaiduActivity;
import com.hfad.androidwantliang.view.MenuActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnlistview1,btnbaidu,btnMenu,btnGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
                    btnlistview1 = findViewById(R.id.btn_listview_1);
                    btnbaidu=findViewById(R.id.btn_baidu);
                    btnMenu=findViewById(R.id.btn_menu);
                    btnGlide=findViewById(R.id.btn_glide);
                    setListeners();

            }

            private void setListeners() {
                OnClick onClick = new OnClick();
                btnlistview1.setOnClickListener(onClick);
                btnbaidu.setOnClickListener(onClick);
                btnMenu.setOnClickListener(onClick);
                btnGlide.setOnClickListener(onClick);

            }

            private class OnClick implements View

                    .OnClickListener {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.btn_listview_1:
                            startActivity(new Intent(MainActivity.this, ListViewActivity.class));
                    break;
                case R.id.btn_baidu:
                    startActivity(new Intent(MainActivity.this, BaiduActivity.class));
                    break;
                case R.id.btn_menu:
                    startActivity(new Intent(MainActivity.this, MenuActivity.class));
                    break;
                case R.id.btn_glide:
                    startActivity(new Intent(MainActivity.this, GlideActivity.class));
                    break;
            }
        }
    }
}


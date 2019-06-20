package com.hfad.androidwantliang.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import com.hfad.androidwantliang.R;

/**
 * 作者:王亮 on 2019/6/16 0016 下午 10:01
 * QQ号:1401439953
 * 微信:wantliang
 * B站:香蕉玉米粥c
 * 微博:张洛希c
 * 作用:ListView控件,单一数据用ArrayAdapter
 */
public class ListViewActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> arr_adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.listView);
        //1,数据源准备
        String arr_data[] = {"wifi", "蓝牙", "网络设置", "安全"};
        //2,新建数组适配器arr_adapter(上下文,当前listview加载的每一个列表项做对应的布局文件
        //  适配器加载数据源arr_data[](数据源包含多少个列表项由数据源的个数决定)
        arr_adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr_data);

        //3,listview控件加载适配器
        listView.setAdapter(arr_adapter);

        //为listview每条Item设置监听器
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text=listView.getItemAtPosition(position)+"";
                Toast.makeText(ListViewActivity.this,"position="+position+" "+"text="+text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

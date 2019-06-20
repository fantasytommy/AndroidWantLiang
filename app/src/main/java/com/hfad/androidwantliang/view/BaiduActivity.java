package com.hfad.androidwantliang.view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hfad.androidwantliang.R;

/**
 * 作者:王亮 on 2019/6/16 0016 下午 10:01
 * QQ号:1401439953
 * 微信:wantliang
 * B站:香蕉玉米粥c
 * 微博:张洛希c
 * 作用:ListView控件
 * 每个item不是单一数据,有文字有图片,SimpleAdapter(删除)
 * 网站接入
 */

public class BaiduActivity extends AppCompatActivity {
    /*private ListView listView;
    private List<Map<String, Object>> dataList;
    private SimpleAdapter simp_adapter;*/
   private  String url="http://www.baidu.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baidu);
       /* //1,数据源准备,数据源是特殊泛型的集合
        dataList = new ArrayList<>();
        dataList = getData();

        *//*2,新建一简单适配器simp_adapter(,,,)
          context:上下文
          data:数据源List<? extends Map<String ,?>>一个map所组成的list集合
               每个map(键值对)p对应p对应listview中一行且每个Map中的键必须包含所有在from中指定的键
          resource:列表项的布局文件ID,
          from:map中的键名
          to:绑定数据视图中的ID与from成对应关系
          */
//      使用浏览器加载网页的方法
        Uri uri=Uri.parse(url);//将字符串解析成uri对象
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);//为Intent传递动作
        intent.setData(uri);//为Intent传递数据
        startActivity(intent);//将Intent传递Activity
    }
/*

    //每一个Map对应一项Item，为了方便用for循环让每个Item里图标都一样，
// 文字内容递增就可以，然后添加到dataList，
// 这样就完成一个有20项Item的List。
// 这里注意Map键值对里的键名，后面会需要。
    private List<Map<String, Object>> getData() {
        for (int i=0;i<20;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("image",R.mipmap.ic_launcher);
            map.put("text","file"+(i+1));
            dataList.add(map);
        }
        return dataList;
    }
*/

}


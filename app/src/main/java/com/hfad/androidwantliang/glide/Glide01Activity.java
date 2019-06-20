package com.hfad.androidwantliang.glide;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.hfad.androidwantliang.R;

import java.io.File;

public class Glide01Activity extends Activity {

    TextView tvGlide1;
    ImageView ivGlide1;
    TextView tvGlide2;
    ImageView ivGlide2;
    TextView tvGlide3;
    ImageView ivGlide3;
    TextView tvGlide4;
    ImageView ivGlide4;
    TextView tvGlide5;
    ImageView ivGlide5;
    TextView tvGlide6;
    ImageView ivGlide6;
    TextView tvGlide7;
    ImageView ivGlide7;
    TextView tvGlide8;
    ImageView ivGlide8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide01);
        initView();//初始化视图
        initData();//初始化数据
    }

    private void initData() {
        //（1）加载网络图片
        tvGlide1.setText("1加载网络图片");
        Glide.with(this).load("https://wx2.sinaimg.cn/mw690/006fAr9Pgy1fsrb1ein64j318g18gjx6.jpg").into(ivGlide1);
        //（2）加载资源图片
        tvGlide2.setText("2加载资源图片");
        Glide.with(this).load(R.mipmap.fbb).into(ivGlide2);
        //（3）加载本地图片
        tvGlide3.setText("3加载本地图片");
        String path = Environment.getExternalStorageDirectory() + "/1560734288253.jpg";
        File file = new File(path);
        Uri uri = Uri.fromFile(file);
        Glide.with(this).load(uri).into(ivGlide3);
        // （4）加载网络gif
        tvGlide4.setText("4加载网络gif");
        String gifUrl = "http://b.hiphotos.baidu.com/zhidao/pic/item/faedab64034f78f066abccc57b310a55b3191c67.jpg";
        Glide.with(this).load(gifUrl).placeholder(R.mipmap.ic_launcher).into(ivGlide4);
        // （5）加载资源gif
        tvGlide5.setText("5加载资源gif");
        Glide.with(this).load(R.mipmap.a).placeholder(R.mipmap.ic_launcher).into(ivGlide5);
        //（6）加载本地gif
        tvGlide6.setText("6加载本地gif");
        String gifPath = Environment.getExternalStorageDirectory() + "/9376d739eb842a200af17c221628d91a.gif";
        File gifFile = new File(gifPath);
        Glide.with(this).load(gifFile)
                .placeholder(R.mipmap.ic_launcher).error(R.mipmap.fbb).into(ivGlide6);
        //（7）加载本地小视频和快照
        tvGlide7.setText("7加载本地小视频和快照");
        String videoPath = Environment.getExternalStorageDirectory() + "/201906021814529331.mp4";
        File videoFile = new File(videoPath);
        Glide.with(this).load(Uri.fromFile(videoFile)).placeholder(R.mipmap.ic_launcher).into(ivGlide7);
        //（8）设置缩略图比例,然后，先加载缩略图，再加载原图
        tvGlide8.setText("8设置缩略图比例,然后，先加载缩略图，再加载原图");
        String urlPath = "/storage/emulated/0/Pictures/bili/1560734301169.jpg";
        Glide.with(this)
                .load(urlPath)
                .thumbnail(0.1f)
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .into(ivGlide8);


    }

    private void initView() {
        tvGlide1 = findViewById(R.id.tv_glide_1);
        ivGlide1 = findViewById(R.id.iv_glide_1);

        tvGlide2 = findViewById(R.id.tv_glide_2);
        ivGlide2 = findViewById(R.id.iv_glide_2);

        tvGlide3 = findViewById(R.id.tv_glide_3);
        ivGlide3 = findViewById(R.id.iv_glide_3);

        tvGlide4 = findViewById(R.id.tv_glide_4);
        ivGlide4 = findViewById(R.id.iv_glide_4);

        tvGlide5 = findViewById(R.id.tv_glide_5);
        ivGlide5 = findViewById(R.id.iv_glide_5);

        tvGlide6 = findViewById(R.id.tv_glide_6);
        ivGlide6 = findViewById(R.id.iv_glide_6);

        tvGlide7 = findViewById(R.id.tv_glide_7);
        ivGlide7 = findViewById(R.id.iv_glide_7);

        tvGlide8 = findViewById(R.id.tv_glide_8);
        ivGlide8 = findViewById(R.id.iv_glide_8);



    }
}


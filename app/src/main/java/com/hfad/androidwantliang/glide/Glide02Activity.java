package com.hfad.androidwantliang.glide;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hfad.androidwantliang.R;
import com.hfad.androidwantliang.adapter.GlideRecyclerviewAdapter;

public class Glide02Activity extends Activity {
    RecyclerView rv_glide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide02);
        rv_glide =  findViewById(R.id.rv_glide);
        GlideRecyclerviewAdapter glideTranformationsAdapter = new GlideRecyclerviewAdapter(this);
        rv_glide.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv_glide.setAdapter(glideTranformationsAdapter);
    }
}

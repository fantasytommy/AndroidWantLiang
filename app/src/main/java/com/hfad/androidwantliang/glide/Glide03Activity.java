package com.hfad.androidwantliang.glide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hfad.androidwantliang.R;
import com.hfad.androidwantliang.adapter.GlideTranformationsAdapter;

public class Glide03Activity extends Activity {

    RecyclerView rv_glide_transformations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide03);

        rv_glide_transformations =  findViewById(R.id.rv_glide_transformations);
        GlideTranformationsAdapter glideTranformationsAdapter = new GlideTranformationsAdapter(this);
        rv_glide_transformations.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv_glide_transformations.setAdapter(glideTranformationsAdapter);
    }
}

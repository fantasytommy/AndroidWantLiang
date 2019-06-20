package com.hfad.androidwantliang.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.GenericTransitionOptions;
import com.bumptech.glide.Glide;
import com.hfad.androidwantliang.R;

/**
 * 作者:王亮 on 2019/6/19 0019 下午 1:11
 * QQ号:1401439953
 * 微信:wantliang
 * B站:香蕉玉米粥c
 * 微博:张洛希c
 * 作用:---
 */
public class GlideRecyclerviewAdapter extends RecyclerView.Adapter<GlideRecyclerviewAdapter.ViewHolder>{
    private Context mContext;

    String[] mDatas = new String[]{
            "http://p2.so.qhmsg.com/bdr/_240_/t01ffcdaedde9bcb74c.jpg",
            "http://img.article.pchome.net/00/56/35/09/pic_lib/wm/fengjing1.jpg",
            "http://p1.so.qhmsg.com/bdr/_240_/t0189a38410d9b1a6db.jpg",
            "http://p3.so.qhmsg.com/bdr/_240_/t0118233347354d0838.jpg",
            "http://ww1.sinaimg.cn/mw690/b0d9a523jw1fasfnzuyj1j20760760t2.jpg",
            "http://p1.so.qhmsg.com/bdr/_240_/t01ffd622bffeabb5e1.jpg",
            "http://p4.so.qhmsg.com/bdr/_240_/t01956d7d9ed4a92064.jpg",
            "https://wx2.sinaimg.cn/mw690/006fAr9Pgy1g29j9246zzj30d60d6756.jpg",
            "https://wx2.sinaimg.cn/mw690/006fAr9Pgy1fsrb1ein64j318g18gjx6.jpg",
            "https://wx4.sinaimg.cn/mw690/006fAr9Pgy1fsdjk1cqzkj30ku0kv401.jpg",
            "https://wx3.sinaimg.cn/mw690/006fAr9Pgy1fsdjk1n6ddj30m80m8gp6.jpg",
            "https://wx3.sinaimg.cn/mw690/006fAr9Pgy1fsdjk21qjjj30ku0kumzt.jpg",
            "https://wx3.sinaimg.cn/mw690/006fAr9Pgy1fsdis9f401j32uy2587wm.jpg",
            "https://wx2.sinaimg.cn/mw690/006fAr9Pgy1fsdjk5dgqtj32xb26ze86.jpg"
    };


    public GlideRecyclerviewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = View.inflate(mContext, R.layout.item_glide_recyclerview, null);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // 获取当前item数据

        // 显示数据
        int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, mContext.getResources().getDisplayMetrics());
        int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300, mContext.getResources().getDisplayMetrics());

        Glide.with(mContext)
                .load(mDatas[position])
                .placeholder(R.mipmap.ic_launcher) //占位图
                .error(R.mipmap.ic_launcher)  //出错的占位图
                .override(width, height) //图片显示的分辨率 ，像素值 可以转化为DP再设置
                .transition(GenericTransitionOptions.with(R.anim.glide_anim))
                .centerCrop()
                .fitCenter()
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.iv_glide_recyclerview);
        }
    }
}

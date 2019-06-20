package com.hfad.androidwantliang.glide;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.hfad.androidwantliang.R;

public class GlideActivity extends AppCompatActivity {
    private Button btnGlide01,btnGlide02,btnGlide03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        btnGlide01=findViewById(R.id.glide_1);
        btnGlide02=findViewById(R.id.glide_2);
        btnGlide03=findViewById(R.id.glide_3);
        setListeners();
    }

    private void setListeners() {
        OnClick onClick=new OnClick();
        btnGlide01.setOnClickListener(onClick);
        btnGlide02.setOnClickListener(onClick);
        btnGlide03.setOnClickListener(onClick);

    }

    private class OnClick implements View

            .OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.glide_1:
                    startActivity(new Intent(GlideActivity.this,Glide01Activity.class));
                    break;
                case R.id.glide_2:
                    startActivity(new Intent(GlideActivity.this,Glide02Activity.class));
                    break;
                case R.id.glide_3:
                    startActivity(new Intent(GlideActivity.this,Glide03Activity.class));
                    break;

            }
        }
    }
}

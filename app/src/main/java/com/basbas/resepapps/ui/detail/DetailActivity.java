package com.basbas.resepapps.ui.detail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.basbas.resepapps.R;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvNamaResep, tvDetailResep;
    ImageView imgNamaResep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detail Resep");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvDetailResep = findViewById(R.id.tv_detail_resep);
        tvNamaResep = findViewById(R.id.tv_nama_resep);
        imgNamaResep = findViewById(R.id.img_resep);

        //menangkap datanya
        tvNamaResep.setText(getIntent().getStringExtra("NAMARESEP"));
        tvDetailResep.setText(getIntent().getStringExtra("DETAIL"));
        Glide.with(this).load(getIntent().getStringExtra("GAMBAR"))
                .into(imgNamaResep);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}

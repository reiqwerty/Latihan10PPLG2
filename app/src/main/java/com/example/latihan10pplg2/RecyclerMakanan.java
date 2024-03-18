package com.example.latihan10pplg2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerMakanan extends AppCompatActivity implements MakananAdapter.ItemClickListener {
    RecyclerView rvMakanan;
    ArrayList<MakananModel> listDataMakanan;
    MakananAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_makanan);

        listDataMakanan = new ArrayList<>();
        rvMakanan = findViewById(R.id.rvMakanan);

        MakananModel mknOne = new MakananModel();
        mknOne.setNama("Ayam Geprek");
        mknOne.setDesc("Ayam yang di geprek dengan sambal");
        mknOne.setImgSrc("https://png.pngtree.com/png-clipart/20230319/original/pngtree-complete-geprek-chicken-with-fresh-vegetables-png-image_8996077.png");
        listDataMakanan.add(mknOne);

        MakananModel mknTwo = new MakananModel();
        mknTwo.setNama("Indomie");
        mknTwo.setDesc("Makanan yang mudah dibuat");
        mknTwo.setImgSrc("https://www.indomie.com/uploads/product/category_dry-based-noodles_133948614.png");
        listDataMakanan.add(mknTwo);

        MakananModel mknThree = new MakananModel();
        mknThree.setNama("Soto");
        mknThree.setDesc("Soto ayam enak");
        mknThree.setImgSrc("https://png.pngtree.com/png-clipart/20220918/ourmid/pngtree-soto-ayam-png-image_6189440.png");
        listDataMakanan.add(mknThree);

        MakananModel mknFour = new MakananModel();
        mknFour.setNama("Sushi");
        mknFour.setDesc("Sushi Indonesia lebih enak");
        mknFour.setImgSrc("https://static.vecteezy.com/system/resources/previews/025/064/113/non_2x/sushi-with-ai-generated-free-png.png");
        listDataMakanan.add(mknFour);

        MakananModel mknFive = new MakananModel();
        mknFive.setNama("Kebab");
        mknFive.setDesc("Enak buat ngemil ini");
        mknFive.setImgSrc("https://static.vecteezy.com/system/resources/previews/025/268/633/original/kebab-with-ai-generated-free-png.png");
        listDataMakanan.add(mknFive);

        MakananModel mknSix = new MakananModel();
        mknSix.setNama("Martabak");
        mknSix.setDesc("Ada yang keju,coklat, dan kacang");
        mknSix.setImgSrc("https://www.martabakboss.com/assets/martabak/menu/Manis/original.png");
        listDataMakanan.add(mknSix);

        MakananModel mknSeven = new MakananModel();
        mknSeven.setNama("Ayam Crispy");
        mknSeven.setDesc("Ayam kriuk kres kres");
        mknSeven.setImgSrc("https://www.dapurkobe.co.id/wp-content/uploads/ayam-goreng-crispy.png");
        listDataMakanan.add(mknSeven);

        adapter = new MakananAdapter(this, listDataMakanan);
        adapter.setClickListener(this);
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        rvMakanan.setAdapter(new MakananAdapter(getApplicationContext(),listDataMakanan));
        rvMakanan.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getNama() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
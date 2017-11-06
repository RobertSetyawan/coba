package com.example.d2j_00.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[],ipk[];
    int imageResource[] = {R.drawable.koala,R.drawable.penguins,R.drawable.koala,R.drawable.penguins,R.drawable.koala,R.drawable.penguins};
    MyOwnAdapter ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView)findViewById(R.id.myRecyclerview);

        s1 = getResources().getStringArray(R.array.NIM);
        s2 = getResources().getStringArray(R.array.Profil);
        ipk = getResources().getStringArray(R.array.IPK);

        ad = new MyOwnAdapter(this,s1,s2,imageResource,ipk);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));

    }
}

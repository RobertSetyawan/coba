package com.example.d2j_00.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by D2J-00 on 04/10/2017.
 */
public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String data[],data2[],ipk[];
    int img[];
    Context ctx;

    public MyOwnAdapter(Context ct, String s1[], String s2[], int i1[], String ip[]){
        ctx = ct;

        data = s1;
        data2 = s2;
        img = i1;
        ipk = ip;
    }

    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View myOwnview = myInflator.inflate(R.layout.my_row,parent,false);
        return new MyOwnHolder(myOwnview);
    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, int position) {
        holder.t1.setText(data[position]);
        holder.t2.setText(data2[position]);
        holder.myImage.setImageResource(img[position]);
        holder.tipk.setText(ipk[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder{

        TextView t1,t2,tipk;
        ImageView myImage;
        public MyOwnHolder(View itemView) {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.text1);
            t2 = (TextView)itemView.findViewById(R.id.text2);
            tipk = (TextView)itemView.findViewById(R.id.text_ipk);
            myImage = (ImageView)itemView.findViewById(R.id.my_image);
        }
    }
}

package com.ankiitshrma.myapplication;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Akbar on 8/20/2018.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ImageHolder> {

    int A[];
    Context context;

    public MyAdapter(int A[], Context context)
    {
        this.A=A;
        this.context=context;

    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        int layoutId=R.layout.item_img;
        LayoutInflater inflater= LayoutInflater.from(context);
        boolean shouldAttachImmediately=false;
        View myView=inflater.inflate(layoutId,parent,shouldAttachImmediately);
        ImageHolder viewHolder=new ImageHolder(myView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        holder.bind(A[position]);
    }



    @Override
    public int getItemCount() {
        return A.length;
    }

    public class ImageHolder extends RecyclerView.ViewHolder
    {
        LinearLayout container;
        ImageView imageViewItem;

        public ImageHolder(View itemView) {
            super(itemView);
            container=itemView.findViewById(R.id.container);
            imageViewItem=itemView.findViewById(R.id.imageViewItem);
        }
        void bind(int a)
        {

            imageViewItem.setImageResource(a);
            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}

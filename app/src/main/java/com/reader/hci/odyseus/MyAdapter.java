package com.reader.hci.odyseus;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by USER on 10-Dec-16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        //each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    //provide a suitable constructor
    public MyAdapter(String[] myDataset){
        mDataset = myDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        //create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.info_text,parent,false);
        //set the view's size,margin,paddings and layout parameters
        //code here
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //Replace the contecnt of a view invoked by the layout manager
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        //- get element from your dataset at this position
        //- replace the content of the view with that element
        holder.mTextView.setText(mDataset[position]);
    }

    //return the size of your dataset invoked by the layout manager
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}

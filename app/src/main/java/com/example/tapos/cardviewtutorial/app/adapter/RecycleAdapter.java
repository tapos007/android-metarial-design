package com.example.tapos.cardviewtutorial.app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tapos.cardviewtutorial.R;
import com.example.tapos.cardviewtutorial.app.model.Landscape;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by tapos on 8/24/2017.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder>{

    private List<Landscape> mData;
    private LayoutInflater mInflater;
    public RecycleAdapter(Context context, List<Landscape> data) {
        this.mData = data;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG,"onCreateViewHolder");
        View itemView = mInflater.inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder"+ position);
        Landscape currentObj = mData.get(position);
        holder.setData(currentObj,position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description;
        public ImageView thumbnail, imgDelete,imgAdd;
        public int position;
        Landscape current;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);
            thumbnail = (ImageView) view.findViewById(R.id.img_display);
            imgDelete = (ImageView) view.findViewById(R.id.delete_img);
            imgAdd = (ImageView) view.findViewById(R.id.add_img);
        }

        public void setData(Landscape currentObj, int position) {
            this.title.setText(currentObj.getTitle());
            this.description.setText(currentObj.getDescription());
            this.thumbnail.setImageResource(currentObj.getImageID());
            this.position = position;
            this.current = currentObj;
        }
    }
}

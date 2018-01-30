package com.coffee.designdimensions.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.coffee.designdimensions.R;
import com.coffee.designdimensions.Utils;
import com.coffee.designdimensions.data.DataRepository;
import com.coffee.designdimensions.model.ImageEntity;

import java.util.List;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private List<ImageEntity> list;

    public ImageAdapter() {
        list = DataRepository.imageData();
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        int width = list.get(position).getWidth();
        int height = list.get(position).getHeight();
        holder.imageInfoTv.setText(width + "x" + height);
        ViewGroup.LayoutParams params = holder.imageView.getLayoutParams();
        params.width = Utils.dp2px(width);
        params.height = Utils.dp2px(height);
        holder.imageView.setLayoutParams(params);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        TextView imageInfoTv;
        ImageView imageView;

        public ImageViewHolder(View itemView) {
            super(itemView);
            imageInfoTv = itemView.findViewById(R.id.image_info);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}

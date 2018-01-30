package com.coffee.designdimensions.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.coffee.designdimensions.R;
import com.coffee.designdimensions.Utils;
import com.coffee.designdimensions.data.DataRepository;
import com.coffee.designdimensions.model.DpEntity;

import java.util.List;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class DpAdapter extends RecyclerView.Adapter<DpAdapter.DpViewHolder> {
    private List<DpEntity> list;
    private LayoutInflater inflater;

    public DpAdapter(Context context) {
        list = DataRepository.dpData();
        inflater = LayoutInflater.from(context);
    }

    @Override
    public DpViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_dp, parent, false);
        return new DpViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DpViewHolder holder, int position) {
        holder.dpTv.setText(list.get(position).getDpKey());
        ViewGroup.LayoutParams params = holder.dpView.getLayoutParams();
        params.width = Utils.dp2px(list.get(position).getDpValue());
        holder.dpView.setLayoutParams(params);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class DpViewHolder extends RecyclerView.ViewHolder {
        TextView dpTv;
        View dpView;

        public DpViewHolder(View itemView) {
            super(itemView);
            dpTv = itemView.findViewById(R.id.dp_key);
            dpView = itemView.findViewById(R.id.dp_value);
        }
    }
}

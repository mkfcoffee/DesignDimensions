package com.coffee.designdimensions.adapter;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.coffee.designdimensions.ExtendTextView;
import com.coffee.designdimensions.R;
import com.coffee.designdimensions.Utils;
import com.coffee.designdimensions.data.DataRepository;
import com.coffee.designdimensions.model.CharacterEntity;

import java.util.List;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {
    List<CharacterEntity> list;

    public CharacterAdapter() {
        this.list = DataRepository.characterData();
    }

    @Override
    public CharacterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_character, parent, false);
        return new CharacterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder holder, int position) {
        holder.textView.setText(list.get(position).getSizeKey());
        holder.textView.setTextSize(list.get(position).getSizeValue());
        Paint.FontMetrics fm = holder.textView.getPaint().getFontMetrics();
        String text = " top:" + fm.top + Utils.LINE_BREAK +
                " ascent:" + fm.ascent + Utils.LINE_BREAK +
                " baseline:0" + Utils.LINE_BREAK +
                " descent:" + fm.descent + Utils.LINE_BREAK +
                " bottom:" + fm.bottom;
        holder.infoTv.setText(text);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class CharacterViewHolder extends RecyclerView.ViewHolder {
        ExtendTextView textView;
        TextView infoTv;

        public CharacterViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.character_key);
            infoTv = itemView.findViewById(R.id.character_info);
        }
    }
}

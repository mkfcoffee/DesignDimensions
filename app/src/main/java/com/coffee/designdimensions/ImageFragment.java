package com.coffee.designdimensions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffee.designdimensions.adapter.CharacterAdapter;
import com.coffee.designdimensions.adapter.ImageAdapter;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class ImageFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public static ImageFragment getInstance() {
        return new ImageFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_recyclerview, container, false);
        Log.v("fragment",getClass().getSimpleName());
        mRecyclerView = v.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        mRecyclerView.setAdapter(new ImageAdapter());
        return v;
    }
}

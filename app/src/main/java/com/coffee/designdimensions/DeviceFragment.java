package com.coffee.designdimensions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class DeviceFragment extends Fragment {

    private TextView sizeTv;
    private TextView densityTv;
    private TextView statusTv;
    private TextView navigationBarTv;

    public static DeviceFragment getInstance() {
        return new DeviceFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_device, container, false);
        Log.v("fragment",getClass().getSimpleName());
        sizeTv = v.findViewById(R.id.device_size);
        densityTv = v.findViewById(R.id.device_density);
        statusTv = v.findViewById(R.id.device_status_bar);
        navigationBarTv = v.findViewById(R.id.device_navigation_bar);
        sizeTv.setText(getString(R.string.device_size, Utils.getScreenWidth(), Utils.getScreenHeight()));
        densityTv.setText(getString(R.string.device_density, Utils.dp2px(1)));
        statusTv.setText(getString(R.string.device_status_bar, Utils.getStatusBarHeight()));
        navigationBarTv.setText(getString(R.string.device_navigation_bar, Utils.getNavigationBarHeight(getContext())));
        return v;
    }
}

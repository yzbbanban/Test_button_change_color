package com.wangban.yzbbanban.test_button_change_color;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by YZBbanban on 16/7/17.
 */
public class FragmentTwo extends Fragment {
    View v;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_two, container,false);
        context = getActivity();
        return v;
    }
}

package com.m.generator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;

public class GeneratorFragment extends Fragment implements View.OnClickListener {
    private TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_generator, null);
        tv1 = (TextView) v.findViewById(R.id.fragmentTV1);
        tv2 = (TextView) v.findViewById(R.id.fragmentTV2);
        tv3 = (TextView) v.findViewById(R.id.fragmentTV3);
        tv4 = (TextView) v.findViewById(R.id.fragmentTV4);
        tv5 = (TextView) v.findViewById(R.id.fragmentTV5);

        v.findViewById(R.id.fragmentButton).setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fragmentButton:
                generate();
                break;
        }
    }

    private void generate() {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 80);
        }
        if (arr[0] != arr[1]
                && arr[0] != arr[2]
                && arr[0] != arr[3]
                && arr[0] != arr[4]
                && arr[1] != arr[2]
                && arr[1] != arr[3]
                && arr[1] != arr[4]
                && arr[2] != arr[3]
                && arr[2] != arr[4]
                && arr[3] != arr[4]
                ) {
            Arrays.sort(arr);
            tv1.setText(String.valueOf(arr[0]));
            tv2.setText(String.valueOf(arr[1]));
            tv3.setText(String.valueOf(arr[2]));
            tv4.setText(String.valueOf(arr[3]));
            tv5.setText(String.valueOf(arr[4]));
        } else generate();
    }
}

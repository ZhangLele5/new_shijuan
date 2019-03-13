/**
 *
 */
package com.mad.trafficclient.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.mad.trafficclient.R;
import com.mad.trafficclient.activity.Activity01;
import com.mad.trafficclient.activity.Activity02;
import com.mad.trafficclient.activity.Activity03;
import com.mad.trafficclient.activity.Activity04;
import com.mad.trafficclient.activity.Activity05;
import com.mad.trafficclient.activity.Activity06;
import com.mad.trafficclient.activity.Activity07;
import com.mad.trafficclient.activity.Activity08;
import com.mad.trafficclient.activity.Activity09;
import com.mad.trafficclient.adapter.CommonAdapter;
import com.mad.trafficclient.adapter.CommonViewHolder;

import java.util.ArrayList;
import java.util.List;


public class Fragment_0 extends Fragment {

    private GridView mGvMain;
    private CommonAdapter<String> adapter;
    private List<String> list = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_layout00, container, false);

        initView(view);

        return view;
    }

    private void initView(View view) {
        list.clear();
        for (int i = 0; i < 9; i++) {
            list.add(String.format("%02d", i + 1));
        }
        mGvMain = (GridView) view.findViewById(R.id.gv_main);
        adapter = new CommonAdapter<String>(getActivity(), list, R.layout.activity_main_item) {
            @Override
            public void convert(CommonViewHolder holder, String item, int position) {
                holder.setText(R.id.tv_num, item);
            }
        };
        mGvMain.setAdapter(adapter);
        final Class<?> mTab[] = {
                Activity01.class,
                Activity02.class,
                Activity03.class,
                Activity04.class,
                Activity05.class,
                Activity06.class,
                Activity07.class,
                Activity08.class,
                Activity09.class,
        };
        mGvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), mTab[i]);
                startActivity(intent);
            }
        });
    }

}

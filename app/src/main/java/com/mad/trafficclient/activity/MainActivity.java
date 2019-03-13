/**
 *
 */
package com.mad.trafficclient.activity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.mad.trafficclient.R;
import com.mad.trafficclient.fragment.Fragment_0;
import com.mad.trafficclient.fragment.Fragment_1;
import com.mad.trafficclient.fragment.Fragment_2;
import com.mad.trafficclient.fragment.Fragment_3;
import com.mad.trafficclient.fragment.Fragment_4;
import com.mad.trafficclient.fragment.Fragment_5;
import com.mad.trafficclient.fragment.Fragment_6;
import com.mad.trafficclient.fragment.Fragment_7;
import com.mad.trafficclient.fragment.Fragment_8;
import com.mad.trafficclient.fragment.Fragment_9;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zhaowei
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private TextView mTab1;
    private TextView mTab2;
    private List<Fragment> fragmentList;
    private List<Integer> tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
        initViewPager();

    }

    private void initView() {
        mTab1 = (TextView) findViewById(R.id.tab1);
        mTab1.setOnClickListener(this);
        mTab2 = (TextView) findViewById(R.id.tab2);
        mTab2.setOnClickListener(this);

    }

    private void initViewPager() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new Fragment_0());
        fragmentList.add(new Fragment_1());
        fragmentList.add(new Fragment_2());
        fragmentList.add(new Fragment_3());
        fragmentList.add(new Fragment_4());
        fragmentList.add(new Fragment_5());
        fragmentList.add(new Fragment_6());
        fragmentList.add(new Fragment_7());
        fragmentList.add(new Fragment_8());
        fragmentList.add(new Fragment_9());
        tabs = new ArrayList<>();
        tabs.add(R.id.tab1);
        tabs.add(R.id.tab2);
        getSupportFragmentManager().beginTransaction().replace(R.id.pager, fragmentList.get(0)).commit();
    }

    @Override
    public void onClick(View v) {
        selector(v.getId());
    }

    private void selector(int id) {
        switch (id) {
            case R.id.tab1:
                getSupportFragmentManager().beginTransaction().replace(R.id.pager, fragmentList.get(0)).commit();
                mTab1.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
                mTab1.setTextColor(Color.BLUE);
                mTab2.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);
                mTab2.setTextColor(Color.BLACK);
                break;
            case R.id.tab2:
                getSupportFragmentManager().beginTransaction().replace(R.id.pager, fragmentList.get(1)).commit();
                mTab1.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);
                mTab2.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
                mTab2.setTextColor(Color.BLUE);
                mTab1.setTextColor(Color.BLACK);
                break;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences preferences = getSharedPreferences("yuzhi", 0);
        preferences.edit().putBoolean("isCheck", false).apply();
    }


}

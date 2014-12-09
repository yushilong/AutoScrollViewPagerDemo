package com.asvpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.asvpdemo.lib.AutoScrollViewPager;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
{
    AutoScrollViewPager viewPager;
    AutoScrollViewPagerCirclePageIndicator indicator;
    List<Integer> ids = new ArrayList<Integer>();
    List<View> views = new ArrayList<View>();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViews();
        initData();
    }

    private void initData()
    {
        ids.add(R.drawable.mmaa64034f78f0f736a44895600a55b319ebc41318);//添加最后一张图片在最前面
        ids.add(R.drawable.mm3b292df5e0fe9925b0f1d75936a85edf8db1713d);
        ids.add(R.drawable.mm4e4a20a4462309f75df0f515700e0cf3d7cad61e);
        ids.add(R.drawable.mm55e736d12f2eb9389c4435fbd7628535e5dd6f89);
        ids.add(R.drawable.mm8cb1cb1349540923eff53b799058d109b3de491c);
        ids.add(R.drawable.mmaa64034f78f0f736a44895600a55b319ebc41318);
        for (int i = 0; i < ids.size(); i++)
        {
            View view = View.inflate(this, R.layout.item, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.pic);
            imageView.setImageResource(ids.get(i));
            views.add(view);
        }
        ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(this, views);
        viewPager.setAdapter(imagePagerAdapter);
        indicator.setSnap(true);
        indicator.setViewPager(viewPager);
        viewPager.setInterval(2 * 1000);
        viewPager.startAutoScroll();
    }

    private void findViews()
    {
        viewPager = (AutoScrollViewPager) findViewById(R.id.viewpager);
        indicator = (AutoScrollViewPagerCirclePageIndicator) findViewById(R.id.indicator);
    }
}

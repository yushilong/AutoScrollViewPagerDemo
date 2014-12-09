package com.asvpdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 *author: lscm
 *date: 2014/12/9 15:06
 */
public class ImagePagerAdapter extends PagerAdapter
{
    List<View> views = new ArrayList<View>();
    Context context;

    public ImagePagerAdapter(Context context, List<View> views)
    {
        this.context = context;
        this.views = views;
    }

    @Override public int getCount()
    {
        return views.size();
    }

    @Override public boolean isViewFromObject(View view, Object o)
    {
        return view == o;
    }

    @Override public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView(views.get(position));
    }

    @Override public Object instantiateItem(ViewGroup container, int position)
    {
        container.addView(views.get(position));
        return views.get(position);
    }
}

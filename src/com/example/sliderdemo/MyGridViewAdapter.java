package com.example.sliderdemo;



import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.BaseAdapter;

import android.widget.ImageView;

import android.widget.TextView;



public class MyGridViewAdapter extends BaseAdapter {

  private Context _con;

  private String[] _items;

  private int[] _icons;



  public MyGridViewAdapter(SlidVerticalActivity slidVerticalActivity,

      String[] items, int[] icons) {

    _con = slidVerticalActivity;

    _items = items;

    _icons = icons;

  }



  @Override

  public int getCount() {

    return _items.length;

  }



  @Override

  public Object getItem(int position) {

    return _items[position];

  }



  @Override

  public long getItemId(int position) {

    return position;

  }



  @Override

  public View getView(int position, View convertView, ViewGroup parent) {

    LayoutInflater factory = LayoutInflater.from(_con);



    View v = (View) factory.inflate(R.layout.grid, null);



    ImageView iv = (ImageView) v.findViewById(R.id.icon);

    TextView tv = (TextView) v.findViewById(R.id.text);



    iv.setImageResource(_icons[position]);

    tv.setText(_items[position]);

    return v;

  }

}
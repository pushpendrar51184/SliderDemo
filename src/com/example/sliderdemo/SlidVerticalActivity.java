package com.example.sliderdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SlidingDrawer;

public class SlidVerticalActivity extends Activity {

  private GridView gv;
  private SlidingDrawer sd;
  private ImageView im;

  private int[] icons = { R.drawable.ic_launcher, R.drawable.ic_launcher,

      R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,

      R.drawable.ic_launcher };

  private String[] items = { "quran", "alarm", "calendar", "camera", "clock",

      "tv" };



  /** Called when the activity is first created. */

  @Override

  public void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    gv = (GridView) findViewById(R.id.myContent1);

    sd = (SlidingDrawer) findViewById(R.id.drawer1);

    im = (ImageView) findViewById(R.id.myImage1);

    MyGridViewAdapter adapter = new MyGridViewAdapter(this, items, icons);

    gv.setAdapter(adapter);
    sd.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener()
    {

      @Override

      public void onDrawerOpened() {

        im.setImageResource(R.drawable.ic_launcher);

      }

    });

    sd.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
      @Override
      public void onDrawerClosed() {
        im.setImageResource(R.drawable.ic_launcher);
      }

    });

  }

}

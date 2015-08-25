package com.teamtreehouse.widgetcounter;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton mImageButton1;
    private ImageButton mImageButton2;
    private ImageButton mImageButton3;
    private ImageButton mImageButton4;
    private ImageButton mImageButton5;
    private ImageButton mImageButton6;

    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TextView mTextView4;
    private TextView mTextView5;
    private TextView mTextView6;

    private int ct1 = 0;
    private int ct2 = 0;
    private int ct3 = 0;
    private int ct4 = 0;
    private int ct5 = 0;
    private int ct6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        mImageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        mImageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        mImageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        mImageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        mImageButton6 = (ImageButton) findViewById(R.id.imageButton6);

        mTextView1 = (TextView) findViewById(R.id.textView1);
        mTextView2 = (TextView) findViewById(R.id.textView2);
        mTextView3 = (TextView) findViewById(R.id.textView3);
        mTextView4 = (TextView) findViewById(R.id.textView4);
        mTextView5 = (TextView) findViewById(R.id.textView5);
        mTextView6 = (TextView) findViewById(R.id.textView6);

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        ct1 = sp.getInt("ct1",0);
        ct2 = sp.getInt("ct2",0);
        ct3 = sp.getInt("ct3",0);
        ct4 = sp.getInt("ct4",0);
        ct5 = sp.getInt("ct5",0);
        ct6 = sp.getInt("ct6",0);
        mTextView1.setText(ct1 + "");
        mTextView2.setText(ct2 + "");
        mTextView3.setText(ct3 + "");
        mTextView4.setText(ct4 + "");
        mTextView5.setText(ct5 + "");
        mTextView6.setText(ct6 + "");

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct1++;
                mTextView1.setText(Integer.toString(ct1));
                updateSharedPreferences("ct1", ct1);
            }
        });
        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct2++;
                mTextView2.setText(Integer.toString(ct2));
                updateSharedPreferences("ct2", ct2);
            }
        });
        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct3++;
                mTextView3.setText(Integer.toString(ct3));
                updateSharedPreferences("ct3", ct3);
            }
        });
        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct4++;
                mTextView4.setText(Integer.toString(ct4));
                updateSharedPreferences("ct4", ct4);
            }
        });
        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct5++;
                mTextView5.setText(Integer.toString(ct5));
                updateSharedPreferences("ct5", ct5);
            }
        });
        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct6++;
                mTextView6.setText(Integer.toString(ct6));
                updateSharedPreferences("ct6", ct6);
            }
        });
    }

    public void updateSharedPreferences(String key, int count) {
        PreferenceManager.getDefaultSharedPreferences(this)
                .edit()
                .putInt(key, count)
                .commit();
    }
}

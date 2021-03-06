package com.example.mchugh.differentviews;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class gridView extends AppCompatActivity {

    GridView androidGridView;
    Integer[] imageIDs = {
            R.drawable.avengers, R.drawable.conjuring, R.drawable.dunkirk, R.drawable.fanneykhan, R.drawable.hereditary,
            R.drawable.hp, R.drawable.inceptionposter, R.drawable.interstellarposter, R.drawable.karwaan, R.drawable.shutterisland,
            R.drawable.stree, R.drawable.znmd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        androidGridView = (GridView) findViewById(R.id.androidGridView);


    }

    public class ImageAdapterGridView extends BaseAdapter {
        private Context mContext;

        public ImageAdapterGridView(Context c) {
            mContext = c;
        }

        public int getCount() {
            return imageIDs.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView mImageView;

            if (convertView == null) {
                mImageView = new ImageView(mContext);
                mImageView.setLayoutParams(new GridView.LayoutParams(130, 130));
                mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mImageView.setPadding(16, 16, 16, 16);
            } else {
                mImageView = (ImageView) convertView;
            }
            mImageView.setImageResource(imageIDs[position]);
            return mImageView;
        }
    }
}
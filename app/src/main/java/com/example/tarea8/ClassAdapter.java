package com.example.tarea8;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;


    public class ClassAdapter extends BaseAdapter {

        private ArrayList<ListViewItem> items;

        public ClassAdapter(ArrayList<ListViewItem> items) {
            this.items = items;
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public ListViewItem getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null){
                view = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.listview_item, viewGroup, false);
            }
            decorateWith(view, items.get(i));
            return view;
        }

        private void decorateWith(View view, ListViewItem listViewItem) {
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textView = view.findViewById(R.id.textView3);
            imageView.setImageResource(listViewItem.getImageResource());
            textView.setText(listViewItem.getTitle());
            imageView.setColorFilter(ContextCompat.getColor(view.getContext(), listViewItem.getColor()));
        }


    }


package com.example.tarea8;

import java.util.ArrayList;

    public class ListDataHelper {
        public static ArrayList<ListViewItem> provideItems(){
            ArrayList<ListViewItem> list = new ArrayList<>();
            list.add(new ListViewItem(R.drawable.ic_android_black_24dp,android.R.color.holo_blue_bright, "android"));
            list.add(new ListViewItem(R.drawable.ic_cloud_black_24dp, android.R.color.holo_green_dark ,"nube"));
            list.add(new ListViewItem(R.drawable.ic_brightness_5_black_24dp, android.R.color.holo_orange_light ,"sol"));

            list.add(new ListViewItem(R.drawable.ic_invert_colors_black_24dp, android.R.color.holo_red_dark, "gota"));
            list.add(new ListViewItem(R.drawable.ic_public_black_24dp, android.R.color.holo_purple ,"mundo"));
            list.add(new ListViewItem(R.drawable.ic_spa_black_24dp, android.R.color.holo_blue_dark, "spa"));

            list.add(new ListViewItem(R.drawable.ic_whatshot_black_24dp, android.R.color.holo_green_light, "fuego"));
            list.add(new ListViewItem(R.drawable.ic_brightness_3_black_24dp, android.R.color.holo_blue_dark, "luna"));
            list.add(new ListViewItem(R.drawable.ic_ac_unit_black_24dp, android.R.color.holo_blue_bright, "hielo"));

            return list;
        }
    }

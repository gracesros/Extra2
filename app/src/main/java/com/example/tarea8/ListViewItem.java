package com.example.tarea8;

    public class ListViewItem {

        private int imageResource;
        private int color;
        private String title;

        public ListViewItem(int imageResource, int color, String title) {
            this.imageResource = imageResource;
            this.color = color;
            this.title = title;
        }

        public int getImageResource() {
            return imageResource;
        }

        public int getColor() {
            return color;
        }

        public String getTitle() {
            return title;
        }
    }

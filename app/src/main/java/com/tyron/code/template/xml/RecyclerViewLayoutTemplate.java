package com.tyron.code.template.xml;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class RecyclerViewLayoutTemplate extends CodeTemplate {

    public RecyclerViewLayoutTemplate() {
        super();
    }

    public RecyclerViewLayoutTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "RecyclerView Layout";
    }

    @Override
    public String getExtension() {
        return ".xml";
    }

    @Override
    public void setup() {
        setContents("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:background=\"?attr/colorBackground\">\n\n" +
                "    <!-- Material3 TopAppBar -->\n" +
                "    <com.google.android.material.appbarayout.AppBarLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\">\n\n" +
                "        <com.google.android.material.appbarayout.MaterialToolbar\n" +
                "            android:id=\"@+id/toolbar\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"?attr/actionBarSize\"\n" +
                "            app:title=\"@string/app_name\" />\n\n" +
                "    </com.google.android.material.appbarayout.AppBarLayout>\n\n" +
                "    <!-- RecyclerView for displaying lists -->\n" +
                "    <androidx.recyclerview.widget.RecyclerView\n" +
                "        android:id=\"@+id/recycler_view\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        app:layoutManager=\"androidx.recyclerview.widget.LinearLayoutManager\" />\n\n" +
                "</LinearLayout>");
    }
}

package com.tyron.code.template.xml;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class Material3LayoutTemplate extends CodeTemplate {

    public Material3LayoutTemplate() {
        super();
    }

    public Material3LayoutTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Material Design 3 Layout";
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
                "    <!-- AppBarLayout with Material3 TopAppBar -->\n" +
                "    <com.google.android.material.appbarayout.AppBarLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        app:elevation=\"4dp\">\n\n" +
                "        <com.google.android.material.appbarayout.MaterialToolbar\n" +
                "            android:id=\"@+id/toolbar\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"?attr/actionBarSize\"\n" +
                "            android:background=\"?attr/colorPrimary\"\n" +
                "            app:title=\"@string/app_name\"\n" +
                "            app:titleTextColor=\"?attr/colorOnPrimary\" />\n\n" +
                "    </com.google.android.material.appbarayout.AppBarLayout>\n\n" +
                "    <!-- Content area -->\n" +
                "    <FrameLayout\n" +
                "        android:id=\"@+id/content_frame\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_margin=\"16dp\" />\n\n" +
                "</LinearLayout>");
    }
}

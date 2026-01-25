package com.tyron.code.template.xml;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class FragmentLayoutTemplate extends CodeTemplate {

    public FragmentLayoutTemplate() {
        super();
    }

    public FragmentLayoutTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Fragment Layout";
    }

    @Override
    public String getExtension() {
        return ".xml";
    }

    @Override
    public void setup() {
        setContents("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"?attr/colorBackground\"\n" +
                "    tools:context=\".FragmentName\">\n\n" +
                "    <!-- Main content -->\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:orientation=\"vertical\"\n" +
                "        android:padding=\"16dp\">\n\n" +
                "        <TextView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Fragment Content\"\n" +
                "            android:textAppearance=\"?attr/textAppearanceHeadlineLarge\" />\n\n" +
                "    </LinearLayout>\n\n" +
                "    <!-- Loading indicator (optional) -->\n" +
                "    <ProgressBar\n" +
                "        android:id=\"@+id/loading_progress\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:visibility=\"gone\" />\n\n" +
                "</FrameLayout>");
    }
}

package com.tyron.code.template.xml;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class ComposeLayoutTemplate extends CodeTemplate {

    public ComposeLayoutTemplate() {
        super();
    }

    public ComposeLayoutTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Compose Layout";
    }

    @Override
    public String getExtension() {
        return ".xml";
    }

    @Override
    public void setup() {
        setContents("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:padding=\"16dp\">\n\n" +
                "    <!-- ComposeView for Jetpack Compose content -->\n" +
                "    <androidx.compose.ui.platform.ComposeView\n" +
                "        android:id=\"@+id/compose_view\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\" />\n\n" +
                "</LinearLayout>");
    }
}

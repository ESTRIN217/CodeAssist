package com.tyron.code.template.xml;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class ListItemTemplate extends CodeTemplate {

    public ListItemTemplate() {
        super();
    }

    public ListItemTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Material3 List Item";
    }

    @Override
    public String getExtension() {
        return ".xml";
    }

    @Override
    public void setup() {
        setContents("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<com.google.android.material.card.MaterialCardView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:layout_margin=\"8dp\"\n" +
                "    app:cardCornerRadius=\"12dp\"\n" +
                "    app:cardElevation=\"2dp\">\n\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:orientation=\"horizontal\"\n" +
                "        android:padding=\"16dp\">\n\n" +
                "        <!-- Avatar/Icon -->\n" +
                "        <ImageView\n" +
                "            android:id=\"@+id/item_icon\"\n" +
                "            android:layout_width=\"48dp\"\n" +
                "            android:layout_height=\"48dp\"\n" +
                "            android:contentDescription=\"@string/app_name\"\n" +
                "            android:scaleType=\"centerInside\" />\n\n" +
                "        <!-- Text content -->\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"0dp\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"16dp\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:orientation=\"vertical\"\n" +
                "            android:gravity=\"center_vertical\">\n\n" +
                "            <TextView\n" +
                "                android:id=\"@+id/item_title\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:textAppearance=\"?attr/textAppearanceHeadlineSmall\"\n" +
                "                android:text=\"Item Title\" />\n\n" +
                "            <TextView\n" +
                "                android:id=\"@+id/item_description\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:textAppearance=\"?attr/textAppearanceBodyMedium\"\n" +
                "                android:text=\"Item description\"\n" +
                "                android:textColor=\"?attr/colorOnSurfaceVariant\"\n" +
                "                android:layout_marginTop=\"4dp\" />\n\n" +
                "        </LinearLayout>\n\n" +
                "    </LinearLayout>\n\n" +
                "</com.google.android.material.card.MaterialCardView>");
    }
}

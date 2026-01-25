package com.tyron.code.template.xml;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class Material3FormTemplate extends CodeTemplate {

    public Material3FormTemplate() {
        super();
    }

    public Material3FormTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Material3 Form Layout";
    }

    @Override
    public String getExtension() {
        return ".xml";
    }

    @Override
    public void setup() {
        setContents("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<ScrollView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"?attr/colorBackground\">\n\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:orientation=\"vertical\"\n" +
                "        android:padding=\"24dp\">\n\n" +
                "        <!-- Text Field -->\n" +
                "        <com.google.android.material.textfield.TextInputLayout\n" +
                "            android:id=\"@+id/name_input_layout\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginBottom=\"16dp\"\n" +
                "            app:hint=\"Name\">\n\n" +
                "            <com.google.android.material.textfield.TextInputEditText\n" +
                "                android:id=\"@+id/name_input\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:inputType=\"text\" />\n\n" +
                "        </com.google.android.material.textfield.TextInputLayout>\n\n" +
                "        <!-- Email Field -->\n" +
                "        <com.google.android.material.textfield.TextInputLayout\n" +
                "            android:id=\"@+id/email_input_layout\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginBottom=\"16dp\"\n" +
                "            app:hint=\"Email\">\n\n" +
                "            <com.google.android.material.textfield.TextInputEditText\n" +
                "                android:id=\"@+id/email_input\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:inputType=\"emailAddress\" />\n\n" +
                "        </com.google.android.material.textfield.TextInputLayout>\n\n" +
                "        <!-- Submit Button -->\n" +
                "        <com.google.android.material.button.MaterialButton\n" +
                "            android:id=\"@+id/submit_button\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginTop=\"16dp\"\n" +
                "            android:text=\"Submit\"\n" +
                "            app:cornerRadius=\"8dp\" />\n\n" +
                "    </LinearLayout>\n\n" +
                "</ScrollView>");
    }
}

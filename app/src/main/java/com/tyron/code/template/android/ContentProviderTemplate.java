package com.tyron.code.template.android;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.java.JavaClassTemplate;

public class ContentProviderTemplate extends JavaClassTemplate {

    public ContentProviderTemplate() {
        super();
    }

    public ContentProviderTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "ContentProvider";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import android.content.ContentProvider;\n" +
                "import android.content.ContentValues;\n" +
                "import android.database.Cursor;\n" +
                "import android.net.Uri;\n" +
                "import androidx.annotation.NonNull;\n" +
                "import androidx.annotation.Nullable;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " extends ContentProvider {\n\n" +
                "   private static final String AUTHORITY = \"" + CodeTemplate.PACKAGE_NAME + ".provider\";\n" +
                "   public static final Uri BASE_URI = Uri.parse(\"content://\" + AUTHORITY);\n\n" +
                "   @Override\n" +
                "   public boolean onCreate() {\n" +
                "       return true;\n" +
                "   }\n\n" +
                "   @Nullable\n" +
                "   @Override\n" +
                "   public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {\n" +
                "       return null;\n" +
                "   }\n\n" +
                "   @Nullable\n" +
                "   @Override\n" +
                "   public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {\n" +
                "       return null;\n" +
                "   }\n\n" +
                "   @Override\n" +
                "   public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {\n" +
                "       return 0;\n" +
                "   }\n\n" +
                "   @Override\n" +
                "   public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {\n" +
                "       return 0;\n" +
                "   }\n\n" +
                "   @Nullable\n" +
                "   @Override\n" +
                "   public String getType(@NonNull Uri uri) {\n" +
                "       return null;\n" +
                "   }\n" +
                "}");
    }
}

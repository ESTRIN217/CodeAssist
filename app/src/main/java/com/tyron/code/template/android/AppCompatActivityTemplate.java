package com.tyron.code.template.android;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.java.JavaClassTemplate;

public class AppCompatActivityTemplate extends JavaClassTemplate {

    public AppCompatActivityTemplate() {
        super();
    }

    public AppCompatActivityTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "AppCompat Activity";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import android.os.Bundle;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.appcompat.widget.Toolbar;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " extends AppCompatActivity {\n\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "       super.onCreate(savedInstanceState);\n" +
                "       setContentView(R.layout.activity_" + CodeTemplate.CLASS_NAME.toLowerCase() + ");\n\n" +
                "       Toolbar toolbar = findViewById(R.id.toolbar);\n" +
                "       setSupportActionBar(toolbar);\n" +
                "   }\n\n" +
                "   @Override\n" +
                "   public boolean onSupportNavigateUp() {\n" +
                "       onBackPressed();\n" +
                "       return true;\n" +
                "   }\n" +
                "}");
    }
}

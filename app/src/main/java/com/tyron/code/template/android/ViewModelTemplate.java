package com.tyron.code.template.android;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.java.JavaClassTemplate;

public class ViewModelTemplate extends JavaClassTemplate {

    public ViewModelTemplate() {
        super();
    }

    public ViewModelTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "ViewModel";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import androidx.lifecycle.LiveData;\n" +
                "import androidx.lifecycle.MutableLiveData;\n" +
                "import androidx.lifecycle.ViewModel;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " extends ViewModel {\n\n" +
                "   private final MutableLiveData<String> mData = new MutableLiveData<>();\n\n" +
                "   public ViewModelTemplate() {\n" +
                "       mData.setValue(\"Welcome\");\n" +
                "   }\n\n" +
                "   public LiveData<String> getData() {\n" +
                "       return mData;\n" +
                "   }\n\n" +
                "   public void updateData(String newValue) {\n" +
                "       mData.setValue(newValue);\n" +
                "   }\n\n" +
                "   @Override\n" +
                "   protected void onCleared() {\n" +
                "       super.onCleared();\n" +
                "   }\n" +
                "}");
    }
}

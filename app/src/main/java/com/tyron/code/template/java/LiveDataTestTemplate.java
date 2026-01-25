package com.tyron.code.template.java;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class LiveDataTestTemplate extends JavaClassTemplate {

    public LiveDataTestTemplate() {
        super();
    }

    public LiveDataTestTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "LiveData Test (ViewModel Testing)";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import androidx.arch.core.executor.testing.InstantTaskExecutorRule;\n" +
                "import androidx.lifecycle.LiveData;\n" +
                "import org.junit.Rule;\n" +
                "import org.junit.Test;\n" +
                "import static org.junit.Assert.*;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " {\n\n" +
                "    @Rule\n" +
                "    public InstantTaskExecutorRule instantExecutorRule = new InstantTaskExecutorRule();\n\n" +
                "    @Test\n" +
                "    public void testLiveDataValue() {\n" +
                "        LiveData<String> liveData = new androidx.lifecycle.MutableLiveData<>(\"Test Value\");\n" +
                "        assertEquals(\"Test Value\", liveData.getValue());\n" +
                "    }\n\n" +
                "    @Test\n" +
                "    public void testLiveDataObserver() {\n" +
                "        androidx.lifecycle.MutableLiveData<String> liveData = \n" +
                "            new androidx.lifecycle.MutableLiveData<>();\n" +
                "        \n" +
                "        java.util.concurrent.atomic.AtomicReference<String> observedValue = \n" +
                "            new java.util.concurrent.atomic.AtomicReference<>();\n" +
                "        \n" +
                "        liveData.observeForever(observedValue::set);\n" +
                "        liveData.setValue(\"New Value\");\n" +
                "        \n" +
                "        assertEquals(\"New Value\", observedValue.get());\n" +
                "    }\n" +
                "}");
    }
}

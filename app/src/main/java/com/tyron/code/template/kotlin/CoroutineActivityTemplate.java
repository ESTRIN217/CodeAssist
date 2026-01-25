package com.tyron.code.template.kotlin;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class CoroutineActivityTemplate extends KotlinClassTemplate {

    public CoroutineActivityTemplate() {
        super();
    }

    public CoroutineActivityTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Coroutine Activity (Kotlin)";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + "\n\n" +
                "import android.os.Bundle\n" +
                "import androidx.activity.ComponentActivity\n" +
                "import androidx.activity.compose.setContent\n" +
                "import androidx.lifecycle.lifecycleScope\n" +
                "import kotlinx.coroutines.launch\n\n" +
                "class " + CodeTemplate.CLASS_NAME + " : ComponentActivity() {\n\n" +
                "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                "        super.onCreate(savedInstanceState)\n" +
                "        lifecycleScope.launch {\n" +
                "            // Perform background operations\n" +
                "        }\n" +
                "    }\n\n" +
                "    private suspend fun performAsync() {\n" +
                "        // Suspend function for async operations\n" +
                "    }\n" +
                "}");
    }
}

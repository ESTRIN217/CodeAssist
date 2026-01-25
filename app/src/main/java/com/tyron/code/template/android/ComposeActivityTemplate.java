package com.tyron.code.template.android;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.java.JavaClassTemplate;

public class ComposeActivityTemplate extends JavaClassTemplate {

    public ComposeActivityTemplate() {
        super();
    }

    public ComposeActivityTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Compose Activity";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import android.os.Bundle;\n" +
                "import androidx.activity.ComponentActivity;\n" +
                "import androidx.activity.compose.setContent;\n" +
                "import androidx.compose.foundation.layout.fillMaxSize;\n" +
                "import androidx.compose.material3.MaterialTheme;\n" +
                "import androidx.compose.material3.Surface;\n" +
                "import androidx.compose.material3.Text;\n" +
                "import androidx.compose.runtime.Composable;\n" +
                "import androidx.compose.ui.Modifier;\n" +
                "import androidx.compose.ui.tooling.preview.Preview;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " extends ComponentActivity {\n\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "       super.onCreate(savedInstanceState);\n" +
                "       setContent(content -> {\n" +
                "           Surface(\n" +
                "               modifier = Modifier.fillMaxSize(),\n" +
                "               color = MaterialTheme.colorScheme.background\n" +
                "           ) {\n" +
                "               Greeting(\"Android\");\n" +
                "           }\n" +
                "       });\n" +
                "   }\n\n" +
                "   @Composable\n" +
                "   public void Greeting(String name) {\n" +
                "       Text(\n" +
                "           text = \"Hello \" + name + \"!\",\n" +
                "           style = MaterialTheme.typography.headlineLarge\n" +
                "       );\n" +
                "   }\n\n" +
                "   @Preview(showBackground = true)\n" +
                "   @Composable\n" +
                "   public void GreetingPreview() {\n" +
                "       Greeting(\"Android\");\n" +
                "   }\n" +
                "}");
    }
}

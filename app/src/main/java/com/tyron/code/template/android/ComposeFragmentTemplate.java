package com.tyron.code.template.android;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.java.JavaClassTemplate;

public class ComposeFragmentTemplate extends JavaClassTemplate {

    public ComposeFragmentTemplate() {
        super();
    }

    public ComposeFragmentTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Compose Fragment";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import android.os.Bundle;\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.ViewGroup;\n" +
                "import androidx.compose.foundation.layout.fillMaxSize;\n" +
                "import androidx.compose.material3.MaterialTheme;\n" +
                "import androidx.compose.material3.Surface;\n" +
                "import androidx.compose.material3.Text;\n" +
                "import androidx.compose.runtime.Composable;\n" +
                "import androidx.compose.ui.Modifier;\n" +
                "import androidx.compose.ui.platform.ComposeView;\n" +
                "import androidx.fragment.app.Fragment;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " extends Fragment {\n\n" +
                "   @Override\n" +
                "   public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {\n" +
                "       return new ComposeView(requireContext()) {{\n" +
                "           setContent(content -> {\n" +
                "               Surface(\n" +
                "                   modifier = Modifier.fillMaxSize(),\n" +
                "                   color = MaterialTheme.colorScheme.background\n" +
                "               ) {\n" +
                "                   FragmentContent();\n" +
                "               }\n" +
                "           });\n" +
                "       }};\n" +
                "   }\n\n" +
                "   @Composable\n" +
                "   public void FragmentContent() {\n" +
                "       Text(\n" +
                "           text = \"Fragment with Compose\",\n" +
                "           style = MaterialTheme.typography.headlineLarge\n" +
                "       );\n" +
                "   }\n" +
                "}");
    }
}

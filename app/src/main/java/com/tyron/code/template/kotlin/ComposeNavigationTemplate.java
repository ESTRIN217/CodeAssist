package com.tyron.code.template.kotlin;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.kotlin.KotlinClassTemplate;

public class ComposeNavigationTemplate extends KotlinClassTemplate {

    public ComposeNavigationTemplate() {
        super();
    }

    public ComposeNavigationTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Compose Navigation Graph";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + "\n\n" +
                "import androidx.compose.runtime.Composable\n" +
                "import androidx.navigation.NavController\n" +
                "import androidx.navigation.compose.NavHost\n" +
                "import androidx.navigation.compose.composable\n" +
                "import androidx.navigation.compose.rememberNavController\n\n" +
                "@Composable\n" +
                "fun " + CodeTemplate.CLASS_NAME + "() {\n" +
                "    val navController = rememberNavController()\n\n" +
                "    NavHost(navController = navController, startDestination = \"home\") {\n" +
                "        composable(\"home\") {\n" +
                "            HomeScreen(navController)\n" +
                "        }\n\n" +
                "        composable(\"details/{itemId}\") { backStackEntry ->\n" +
                "            val itemId = backStackEntry.arguments?.getString(\"itemId\")\n" +
                "            DetailsScreen(itemId, navController)\n" +
                "        }\n\n" +
                "        composable(\"settings\") {\n" +
                "            SettingsScreen(navController)\n" +
                "        }\n" +
                "    }\n" +
                "}\n\n" +
                "@Composable\n" +
                "private fun HomeScreen(navController: NavController) {\n" +
                "    // Home screen content\n" +
                "}\n\n" +
                "@Composable\n" +
                "private fun DetailsScreen(itemId: String?, navController: NavController) {\n" +
                "    // Details screen content\n" +
                "}\n\n" +
                "@Composable\n" +
                "private fun SettingsScreen(navController: NavController) {\n" +
                "    // Settings screen content\n" +
                "}");
    }
}

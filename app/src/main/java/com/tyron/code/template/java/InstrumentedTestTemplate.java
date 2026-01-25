package com.tyron.code.template.java;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class InstrumentedTestTemplate extends JavaClassTemplate {

    public InstrumentedTestTemplate() {
        super();
    }

    public InstrumentedTestTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Instrumented Test (Espresso)";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import androidx.test.espresso.Espresso;\n" +
                "import androidx.test.espresso.matcher.ViewMatchers;\n" +
                "import androidx.test.ext.junit.rules.ActivityScenarioRule;\n" +
                "import androidx.test.ext.junit.runners.AndroidJUnit4;\n" +
                "import org.junit.Rule;\n" +
                "import org.junit.Test;\n" +
                "import org.junit.runner.RunWith;\n\n" +
                "@RunWith(AndroidJUnit4.class)\n" +
                "public class " + CodeTemplate.CLASS_NAME + " {\n\n" +
                "    @Rule\n" +
                "    public ActivityScenarioRule<MainActivity> mActivityRule =\n" +
                "            new ActivityScenarioRule<>(MainActivity.class);\n\n" +
                "    @Test\n" +
                "    public void testViewDisplay() {\n" +
                "        Espresso.onView(ViewMatchers.withId(android.R.id.action_bar))\n" +
                "                .check((view, noViewFoundException) -> {\n" +
                "                    // Assert view is displayed\n" +
                "                });\n" +
                "    }\n\n" +
                "    @Test\n" +
                "    public void testViewText() {\n" +
                "        Espresso.onView(ViewMatchers.withText(\"Hello World\"))\n" +
                "                .check(androidx.test.espresso.assertion.ViewAssertions.matches(\n" +
                "                        ViewMatchers.isDisplayed()));\n" +
                "    }\n" +
                "}");
    }
}

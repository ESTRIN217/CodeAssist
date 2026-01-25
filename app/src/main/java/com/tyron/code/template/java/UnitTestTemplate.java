package com.tyron.code.template.java;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class UnitTestTemplate extends JavaClassTemplate {

    public UnitTestTemplate() {
        super();
    }

    public UnitTestTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Unit Test (JUnit4)";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import org.junit.Before;\n" +
                "import org.junit.Test;\n" +
                "import static org.junit.Assert.*;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " {\n\n" +
                "    private String mClassUnderTest;\n\n" +
                "    @Before\n" +
                "    public void setUp() {\n" +
                "        // Initialize test objects\n" +
                "        mClassUnderTest = \"Test\";\n" +
                "    }\n\n" +
                "    @Test\n" +
                "    public void testExample() {\n" +
                "        assertEquals(\"Test\", mClassUnderTest);\n" +
                "    }\n\n" +
                "    @Test\n" +
                "    public void testNotNull() {\n" +
                "        assertNotNull(mClassUnderTest);\n" +
                "    }\n" +
                "}");
    }
}

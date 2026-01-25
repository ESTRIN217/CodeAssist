package com.tyron.code.template.java;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;

public class MockitoTestTemplate extends JavaClassTemplate {

    public MockitoTestTemplate() {
        super();
    }

    public MockitoTestTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Mockito Test (Mocking)";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import org.junit.Before;\n" +
                "import org.junit.Test;\n" +
                "import org.mockito.Mock;\n" +
                "import org.mockito.MockitoAnnotations;\n" +
                "import static org.mockito.Mockito.*;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " {\n\n" +
                "    @Mock\n" +
                "    private String mMockString;\n\n" +
                "    @Before\n" +
                "    public void setUp() {\n" +
                "        MockitoAnnotations.openMocks(this);\n" +
                "    }\n\n" +
                "    @Test\n" +
                "    public void testMockMethodCall() {\n" +
                "        // Arrange\n" +
                "        when(mMockString.toString()).thenReturn(\"Mocked Value\");\n\n" +
                "        // Act\n" +
                "        String result = mMockString.toString();\n\n" +
                "        // Assert\n" +
                "        assert result.equals(\"Mocked Value\");\n" +
                "        verify(mMockString).toString();\n" +
                "    }\n\n" +
                "    @Test\n" +
                "    public void testMockVerification() {\n" +
                "        mMockString.toString();\n" +
                "        verify(mMockString, times(1)).toString();\n" +
                "    }\n" +
                "}");
    }
}

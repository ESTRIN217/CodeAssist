package com.tyron.code.template.kotlin;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.kotlin.KotlinClassTemplate;

public class DataClassTemplate extends KotlinClassTemplate {

    public DataClassTemplate() {
        super();
    }

    public DataClassTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Kotlin Data Class";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + "\n\n" +
                "import kotlinx.serialization.Serializable\n\n" +
                "@Serializable\n" +
                "data class " + CodeTemplate.CLASS_NAME + "(\n" +
                "    val id: Int,\n" +
                "    val name: String,\n" +
                "    val email: String,\n" +
                "    val age: Int? = null,\n" +
                "    val isActive: Boolean = true,\n" +
                "    val createdAt: Long = System.currentTimeMillis()\n" +
                ") {\n" +
                "    override fun toString(): String {\n" +
                "        return \"" + CodeTemplate.CLASS_NAME + "(id=$id, name='$name', email='$email')\"\n" +
                "    }\n" +
                "}");
    }
}

package com.tyron.code.template.kotlin;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.kotlin.KotlinClassTemplate;

public class RoomEntityTemplate extends KotlinClassTemplate {

    public RoomEntityTemplate() {
        super();
    }

    public RoomEntityTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Room Entity";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + "\n\n" +
                "import androidx.room.ColumnInfo\n" +
                "import androidx.room.Entity\n" +
                "import androidx.room.PrimaryKey\n\n" +
                "@Entity(tableName = \"${simpleName.toLowerCase()}_table\")\n" +
                "data class " + CodeTemplate.CLASS_NAME + "(\n" +
                "    @PrimaryKey(autoGenerate = true)\n" +
                "    val id: Int = 0,\n\n" +
                "    @ColumnInfo(name = \"name\")\n" +
                "    val name: String,\n\n" +
                "    @ColumnInfo(name = \"description\")\n" +
                "    val description: String,\n\n" +
                "    @ColumnInfo(name = \"created_at\")\n" +
                "    val createdAt: Long = System.currentTimeMillis()\n" +
                ")");
    }
}

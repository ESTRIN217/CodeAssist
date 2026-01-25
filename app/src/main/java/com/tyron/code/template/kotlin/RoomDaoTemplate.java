package com.tyron.code.template.kotlin;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.kotlin.KotlinClassTemplate;

public class RoomDaoTemplate extends KotlinClassTemplate {

    public RoomDaoTemplate() {
        super();
    }

    public RoomDaoTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Room DAO (Data Access Object)";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + "\n\n" +
                "import androidx.room.*\n" +
                "import kotlinx.coroutines.flow.Flow\n\n" +
                "@Dao\n" +
                "interface " + CodeTemplate.CLASS_NAME + " {\n\n" +
                "    @Insert\n" +
                "    suspend fun insert(item: String)\n\n" +
                "    @Update\n" +
                "    suspend fun update(item: String)\n\n" +
                "    @Delete\n" +
                "    suspend fun delete(item: String)\n\n" +
                "    @Query(\"SELECT * FROM item_table\")\n" +
                "    fun getAllItems(): Flow<List<String>>\n\n" +
                "    @Query(\"SELECT * FROM item_table WHERE id = :id\")\n" +
                "    suspend fun getItemById(id: Int): String?\n\n" +
                "    @Query(\"DELETE FROM item_table\")\n" +
                "    suspend fun deleteAll()\n" +
                "}");
    }
}

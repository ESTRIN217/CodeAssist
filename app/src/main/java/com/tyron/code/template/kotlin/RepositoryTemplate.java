package com.tyron.code.template.kotlin;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.kotlin.KotlinClassTemplate;

public class RepositoryTemplate extends KotlinClassTemplate {

    public RepositoryTemplate() {
        super();
    }

    public RepositoryTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Repository Pattern";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + "\n\n" +
                "import kotlinx.coroutines.Dispatchers\n" +
                "import kotlinx.coroutines.flow.Flow\n" +
                "import kotlinx.coroutines.withContext\n\n" +
                "class " + CodeTemplate.CLASS_NAME + "(\n" +
                "    private val dao: ItemDao\n" +
                ") {\n\n" +
                "    fun getAllItems(): Flow<List<String>> = dao.getAllItems()\n\n" +
                "    suspend fun getItemById(id: Int): String? = withContext(Dispatchers.IO) {\n" +
                "        dao.getItemById(id)\n" +
                "    }\n\n" +
                "    suspend fun insertItem(item: String) = withContext(Dispatchers.IO) {\n" +
                "        dao.insert(item)\n" +
                "    }\n\n" +
                "    suspend fun updateItem(item: String) = withContext(Dispatchers.IO) {\n" +
                "        dao.update(item)\n" +
                "    }\n\n" +
                "    suspend fun deleteItem(item: String) = withContext(Dispatchers.IO) {\n" +
                "        dao.delete(item)\n" +
                "    }\n\n" +
                "    suspend fun deleteAllItems() = withContext(Dispatchers.IO) {\n" +
                "        dao.deleteAll()\n" +
                "    }\n" +
                "}");
    }
}

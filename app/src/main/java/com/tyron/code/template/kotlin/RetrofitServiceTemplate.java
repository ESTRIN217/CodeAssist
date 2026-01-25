package com.tyron.code.template.kotlin;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.kotlin.KotlinClassTemplate;

public class RetrofitServiceTemplate extends KotlinClassTemplate {

    public RetrofitServiceTemplate() {
        super();
    }

    public RetrofitServiceTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Retrofit API Service";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + "\n\n" +
                "import retrofit2.http.*\n\n" +
                "interface " + CodeTemplate.CLASS_NAME + " {\n\n" +
                "    @GET(\"/api/items\")\n" +
                "    suspend fun getItems(): List<ItemResponse>\n\n" +
                "    @GET(\"/api/items/{id}\")\n" +
                "    suspend fun getItemById(@Path(\"id\") id: Int): ItemResponse\n\n" +
                "    @POST(\"/api/items\")\n" +
                "    suspend fun createItem(@Body item: ItemRequest): ItemResponse\n\n" +
                "    @PUT(\"/api/items/{id}\")\n" +
                "    suspend fun updateItem(\n" +
                "        @Path(\"id\") id: Int,\n" +
                "        @Body item: ItemRequest\n" +
                "    ): ItemResponse\n\n" +
                "    @DELETE(\"/api/items/{id}\")\n" +
                "    suspend fun deleteItem(@Path(\"id\") id: Int): ApiResponse\n" +
                "}");
    }
}

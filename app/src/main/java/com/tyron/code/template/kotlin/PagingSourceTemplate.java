package com.tyron.code.template.kotlin;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.kotlin.KotlinClassTemplate;

public class PagingSourceTemplate extends KotlinClassTemplate {

    public PagingSourceTemplate() {
        super();
    }

    public PagingSourceTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Paging 3 Source";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + "\n\n" +
                "import androidx.paging.PagingSource\n" +
                "import androidx.paging.PagingState\n\n" +
                "class " + CodeTemplate.CLASS_NAME + "(\n" +
                "    private val apiService: ItemApiService\n" +
                ") : PagingSource<Int, ItemResponse>() {\n\n" +
                "    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ItemResponse> {\n" +
                "        return try {\n" +
                "            val page = params.key ?: 1\n" +
                "            val response = apiService.getItems(page, params.loadSize)\n\n" +
                "            LoadResult.Page(\n" +
                "                data = response.data,\n" +
                "                prevKey = if (page == 1) null else page - 1,\n" +
                "                nextKey = if (response.data.isEmpty()) null else page + 1\n" +
                "            )\n" +
                "        } catch (e: Exception) {\n" +
                "            LoadResult.Error(e)\n" +
                "        }\n" +
                "    }\n\n" +
                "    override fun getRefreshKey(state: PagingState<Int, ItemResponse>): Int? {\n" +
                "        return state.anchorPosition?.let { anchorPosition ->\n" +
                "            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)\n" +
                "                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)\n" +
                "        }\n" +
                "    }\n" +
                "}");
    }
}

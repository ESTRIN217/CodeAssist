package com.tyron.code.template.android;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.java.JavaClassTemplate;

public class RecyclerViewAdapterTemplate extends JavaClassTemplate {

    public RecyclerViewAdapterTemplate() {
        super();
    }

    public RecyclerViewAdapterTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "RecyclerView Adapter";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.ViewGroup;\n" +
                "import androidx.annotation.NonNull;\n" +
                "import androidx.recyclerview.widget.RecyclerView;\n\n" +
                "import java.util.List;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " extends RecyclerView.Adapter<" + CodeTemplate.CLASS_NAME + ".ViewHolder> {\n\n" +
                "   private List<String> items;\n\n" +
                "   public " + CodeTemplate.CLASS_NAME + "(List<String> items) {\n" +
                "       this.items = items;\n" +
                "   }\n\n" +
                "   @NonNull\n" +
                "   @Override\n" +
                "   public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {\n" +
                "       return new ViewHolder(LayoutInflater.from(parent.getContext())\n" +
                "           .inflate(android.R.layout.simple_list_item_1, parent, false));\n" +
                "   }\n\n" +
                "   @Override\n" +
                "   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {\n" +
                "       holder.bind(items.get(position));\n" +
                "   }\n\n" +
                "   @Override\n" +
                "   public int getItemCount() {\n" +
                "       return items.size();\n" +
                "   }\n\n" +
                "   public static class ViewHolder extends RecyclerView.ViewHolder {\n" +
                "       public ViewHolder(@NonNull android.view.View itemView) {\n" +
                "           super(itemView);\n" +
                "       }\n\n" +
                "       public void bind(String item) {\n" +
                "           // Bind item data to views\n" +
                "       }\n" +
                "   }\n" +
                "}");
    }
}

package com.tyron.layout.editor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.View;

/**
 * Representa un componente editable en el layout editor
 */
public interface LayoutComponent {
    
    /**
     * Obtiene el ID del componente
     */
    @NonNull
    String getId();
    
    /**
     * Obtiene la clase del componente (ej: androidx.appcompat.widget.AppCompatButton)
     */
    @NonNull
    String getClassName();
    
    /**
     * Obtiene el ancho del componente (en dp o match_parent/wrap_content)
     */
    @NonNull
    String getWidth();
    
    /**
     * Obtiene el alto del componente
     */
    @NonNull
    String getHeight();
    
    /**
     * Obtiene el valor de un atributo
     */
    @Nullable
    String getAttribute(@NonNull String name);
    
    /**
     * Establece un atributo
     */
    void setAttribute(@NonNull String name, @NonNull String value);
    
    /**
     * Obtiene el View renderizado
     */
    @Nullable
    View getRenderedView();
    
    /**
     * Obtiene los componentes hijos
     */
    @NonNull
    LayoutComponent[] getChildren();
    
    /**
     * Obtiene el componente padre
     */
    @Nullable
    LayoutComponent getParent();
}

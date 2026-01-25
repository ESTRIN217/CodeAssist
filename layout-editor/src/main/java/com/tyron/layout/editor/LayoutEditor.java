package com.tyron.layout.editor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.View;

/**
 * Editor visual para layouts Android
 */
public interface LayoutEditor {
    
    /**
     * Carga un layout XML
     */
    void loadLayout(@NonNull String xmlContent);
    
    /**
     * Obtiene el XML del layout actual
     */
    @NonNull
    String getLayoutXML();
    
    /**
     * Obtiene el componente raíz
     */
    @Nullable
    LayoutComponent getRootComponent();
    
    /**
     * Busca un componente por ID
     */
    @Nullable
    LayoutComponent findComponentById(@NonNull String id);
    
    /**
     * Obtiene la vista renderizada
     */
    @Nullable
    View getPreviewView();
    
    /**
     * Agrega un componente nuevo
     */
    void addComponent(@NonNull String className, @Nullable String parentId);
    
    /**
     * Remueve un componente
     */
    void removeComponent(@NonNull String componentId);
    
    /**
     * Mueve un componente
     */
    void moveComponent(@NonNull String componentId, @Nullable String newParentId);
    
    /**
     * Deshace la última acción
     */
    void undo();
    
    /**
     * Rehace una acción
     */
    void redo();
    
    /**
     * Guarda los cambios
     */
    void save();
    
    /**
     * Agrega un listener para cambios
     */
    void addEditorListener(@NonNull LayoutEditorListener listener);
}

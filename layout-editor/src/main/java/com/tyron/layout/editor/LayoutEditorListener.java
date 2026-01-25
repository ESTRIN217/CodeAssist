package com.tyron.layout.editor;

import androidx.annotation.NonNull;

/**
 * Listener para eventos del layout editor
 */
public interface LayoutEditorListener {
    
    /**
     * Se llama cuando el layout cambia
     */
    void onLayoutChanged(@NonNull String newXml);
    
    /**
     * Se llama cuando se selecciona un componente
     */
    void onComponentSelected(@NonNull LayoutComponent component);
    
    /**
     * Se llama cuando se deselecciona un componente
     */
    void onComponentDeselected();
    
    /**
     * Se llama cuando hay un error en el layout
     */
    void onError(@NonNull String errorMessage);
}

package com.tyron.debugger.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Interface para puntos de interrupción en debugging
 */
public interface Breakpoint {
    
    /**
     * Obtiene el archivo donde está el breakpoint
     */
    @NonNull
    String getFilePath();
    
    /**
     * Obtiene la línea del breakpoint (1-indexed)
     */
    int getLineNumber();
    
    /**
     * Verifica si el breakpoint está habilitado
     */
    boolean isEnabled();
    
    /**
     * Habilita/deshabilita el breakpoint
     */
    void setEnabled(boolean enabled);
    
    /**
     * Obtiene la condición del breakpoint (si existe)
     */
    @Nullable
    String getCondition();
    
    /**
     * Establece una condición para el breakpoint
     */
    void setCondition(@Nullable String condition);
}

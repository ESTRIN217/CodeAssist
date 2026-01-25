package com.tyron.debugger.api;

import androidx.annotation.NonNull;

/**
 * Representa un frame en el stack trace
 */
public interface StackFrame {
    
    /**
     * Obtiene el nombre de la clase
     */
    @NonNull
    String getClassName();
    
    /**
     * Obtiene el nombre del método
     */
    @NonNull
    String getMethodName();
    
    /**
     * Obtiene el archivo fuente
     */
    @NonNull
    String getFileName();
    
    /**
     * Obtiene el número de línea
     */
    int getLineNumber();
    
    /**
     * Obtiene el número de frame en el stack (0 = topmost)
     */
    int getFrameIndex();
}

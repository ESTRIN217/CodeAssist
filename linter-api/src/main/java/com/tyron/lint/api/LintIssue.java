package com.tyron.lint.api;

import androidx.annotation.NonNull;

/**
 * Representa un problema encontrado por el linter
 */
public interface LintIssue {
    
    enum Severity {
        NOTE,      // Información
        WARNING,   // Advertencia
        ERROR      // Error
    }
    
    /**
     * Obtiene el mensaje del problema
     */
    @NonNull
    String getMessage();
    
    /**
     * Obtiene la severidad del problema
     */
    @NonNull
    Severity getSeverity();
    
    /**
     * Obtiene el archivo donde está el problema
     */
    @NonNull
    String getFilePath();
    
    /**
     * Obtiene la línea donde está el problema
     */
    int getLineNumber();
    
    /**
     * Obtiene el inicio de la columna
     */
    int getStartColumn();
    
    /**
     * Obtiene el final de la columna
     */
    int getEndColumn();
    
    /**
     * Obtiene el código del problema
     */
    @NonNull
    String getCode();
    
    /**
     * Obtiene sugerencias para resolver el problema
     */
    @NonNull
    String[] getSuggestions();
}

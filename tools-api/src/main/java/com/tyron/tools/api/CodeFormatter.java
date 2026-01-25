package com.tyron.tools.api;

import androidx.annotation.NonNull;

/**
 * Herramienta para formatear código
 */
public interface CodeFormatter {
    
    /**
     * Formatea código Java
     */
    @NonNull
    String formatJava(@NonNull String code);
    
    /**
     * Formatea código Kotlin
     */
    @NonNull
    String formatKotlin(@NonNull String code);
    
    /**
     * Formatea XML
     */
    @NonNull
    String formatXML(@NonNull String xml);
    
    /**
     * Formatea JSON
     */
    @NonNull
    String formatJSON(@NonNull String json);
    
    /**
     * Obtiene el nombre del formateador
     */
    @NonNull
    String getName();
}

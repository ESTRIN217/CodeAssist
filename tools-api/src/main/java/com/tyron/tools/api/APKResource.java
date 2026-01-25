package com.tyron.tools.api;

import androidx.annotation.NonNull;

/**
 * Representa un recurso dentro de un APK
 */
public interface APKResource {
    
    /**
     * Tipo de recurso (drawable, layout, string, etc)
     */
    @NonNull
    String getType();
    
    /**
     * Nombre del recurso
     */
    @NonNull
    String getName();
    
    /**
     * Ruta del recurso dentro del APK
     */
    @NonNull
    String getPath();
    
    /**
     * Tamaño del recurso en bytes
     */
    long getSize();
}

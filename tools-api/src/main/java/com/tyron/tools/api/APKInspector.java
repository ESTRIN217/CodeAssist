package com.tyron.tools.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Herramienta para inspeccionar y modificar APKs
 */
public interface APKInspector {
    
    /**
     * Abre un APK para inspección
     */
    void openAPK(@NonNull String apkPath);
    
    /**
     * Obtiene información del APK (versión, min SDK, etc)
     */
    @NonNull
    APKInfo getAPKInfo();
    
    /**
     * Obtiene la lista de permisos requeridos
     */
    @NonNull
    String[] getPermissions();
    
    /**
     * Obtiene la lista de actividades
     */
    @NonNull
    String[] getActivities();
    
    /**
     * Obtiene la lista de servicios
     */
    @NonNull
    String[] getServices();
    
    /**
     * Obtiene los recursos del APK
     */
    @NonNull
    APKResource[] getResources();
    
    /**
     * Extrae un archivo del APK
     */
    @Nullable
    byte[] extractFile(@NonNull String filePath);
    
    /**
     * Obtiene el tamaño del APK en bytes
     */
    long getAPKSize();
}

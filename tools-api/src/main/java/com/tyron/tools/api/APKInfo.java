package com.tyron.tools.api;

import androidx.annotation.NonNull;

/**
 * Información del APK
 */
public interface APKInfo {
    
    /**
     * Nombre del paquete
     */
    @NonNull
    String getPackageName();
    
    /**
     * Versión del código
     */
    int getVersionCode();
    
    /**
     * Nombre de la versión
     */
    @NonNull
    String getVersionName();
    
    /**
     * SDK mínimo requerido
     */
    int getMinSdkVersion();
    
    /**
     * SDK objetivo
     */
    int getTargetSdkVersion();
    
    /**
     * Actividad principal
     */
    @NonNull
    String getMainActivity();
}

package com.tyron.profiler;

import androidx.annotation.NonNull;

/**
 * Profiler para monitorear memoria, CPU y performance de la aplicación
 */
public interface AppProfiler {
    
    /**
     * Inicia el profiling
     */
    void start();
    
    /**
     * Detiene el profiling
     */
    void stop();
    
    /**
     * Obtiene el uso actual de memoria en MB
     */
    long getMemoryUsageMB();
    
    /**
     * Obtiene el uso máximo de memoria en MB
     */
    long getMaxMemoryMB();
    
    /**
     * Obtiene el uso de CPU actual (0-100)
     */
    int getCpuUsage();
    
    /**
     * Obtiene el número de threads activos
     */
    int getThreadCount();
    
    /**
     * Obtiene información de FPS (fotogramas por segundo)
     */
    float getFPS();
    
    /**
     * Obtiene el estado de batería estimado
     */
    int getBatteryPercentage();
    
    /**
     * Inicia grabación de trace de ANR (Application Not Responding)
     */
    void startANRTrace();
    
    /**
     * Detiene la grabación de trace
     */
    byte[] stopANRTrace();
    
    /**
     * Obtiene reporte de profiling
     */
    @NonNull
    String getProfilingReport();
}

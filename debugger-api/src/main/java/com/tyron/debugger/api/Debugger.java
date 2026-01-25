package com.tyron.debugger.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

/**
 * Interface principal para debugging de apps Android
 */
public interface Debugger {
    
    /**
     * Inicia una sesión de debugging
     */
    void startDebug(@NonNull String packageName);
    
    /**
     * Detiene la sesión de debugging
     */
    void stopDebug();
    
    /**
     * Establece un breakpoint
     */
    void setBreakpoint(@NonNull String filePath, int lineNumber);
    
    /**
     * Remueve un breakpoint
     */
    void removeBreakpoint(@NonNull String filePath, int lineNumber);
    
    /**
     * Obtiene todos los breakpoints
     */
    @NonNull
    List<Breakpoint> getBreakpoints();
    
    /**
     * Continúa la ejecución
     */
    void resume();
    
    /**
     * Pausa la ejecución
     */
    void pause();
    
    /**
     * Step over la línea actual
     */
    void stepOver();
    
    /**
     * Step into una función
     */
    void stepInto();
    
    /**
     * Step out de la función actual
     */
    void stepOut();
    
    /**
     * Obtiene el inspector de variables
     */
    @Nullable
    VariableInspector getVariableInspector();
    
    /**
     * Verifica si el debugger está activo
     */
    boolean isDebugging();
    
    /**
     * Verifica si la ejecución está pausada
     */
    boolean isPaused();
    
    /**
     * Agrega un listener para eventos de debugging
     */
    void addDebugListener(@NonNull DebugListener listener);
    
    /**
     * Remueve un listener de debugging
     */
    void removeDebugListener(@NonNull DebugListener listener);
}

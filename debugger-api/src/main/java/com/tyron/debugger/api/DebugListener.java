package com.tyron.debugger.api;

import androidx.annotation.NonNull;

/**
 * Listener para eventos de debugging
 */
public interface DebugListener {
    
    /**
     * Se llama cuando el debugger se conecta a la aplicación
     */
    void onDebuggerConnected();
    
    /**
     * Se llama cuando el debugger se desconecta
     */
    void onDebuggerDisconnected();
    
    /**
     * Se llama cuando la ejecución se pausa en un breakpoint
     */
    void onBreakpointHit(@NonNull StackFrame frame);
    
    /**
     * Se llama cuando la ejecución se pausa por un error/excepción
     */
    void onException(@NonNull String exceptionMessage, @NonNull StackFrame frame);
    
    /**
     * Se llama cuando la ejecución se reanuda
     */
    void onResumed();
    
    /**
     * Se llama cuando hay un error en el debugging
     */
    void onError(@NonNull String errorMessage);
}

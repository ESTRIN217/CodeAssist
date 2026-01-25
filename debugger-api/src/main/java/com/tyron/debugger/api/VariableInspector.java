package com.tyron.debugger.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Interfaz para inspeccionar variables durante debugging
 */
public interface VariableInspector {
    
    /**
     * Obtiene el valor de una variable en el scope actual
     */
    @Nullable
    Object getValue(@NonNull String variableName);
    
    /**
     * Obtiene todas las variables locales en el stack frame actual
     */
    @NonNull
    Map<String, Object> getLocalVariables();
    
    /**
     * Obtiene todas las variables de instancia (campos)
     */
    @NonNull
    Map<String, Object> getInstanceVariables();
    
    /**
     * Obtiene el valor de un campo específico
     */
    @Nullable
    Object getFieldValue(@NonNull String fieldName);
    
    /**
     * Evalúa una expresión en el contexto actual
     */
    @Nullable
    Object evaluateExpression(@NonNull String expression);
    
    /**
     * Obtiene el stack trace actual
     */
    @NonNull
    List<StackFrame> getStackTrace();
}

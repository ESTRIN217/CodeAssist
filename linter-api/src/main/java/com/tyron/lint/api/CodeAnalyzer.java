package com.tyron.lint.api;

import androidx.annotation.NonNull;

import java.util.List;

/**
 * API para ejecutar análisis de código estático (Linting)
 */
public interface CodeAnalyzer {
    
    /**
     * Analiza un archivo Kotlin
     */
    @NonNull
    List<LintIssue> analyzKotlin(@NonNull String filePath, @NonNull String contents);
    
    /**
     * Analiza un archivo Java
     */
    @NonNull
    List<LintIssue> analyzeJava(@NonNull String filePath, @NonNull String contents);
    
    /**
     * Analiza un archivo XML (layouts, resources, etc)
     */
    @NonNull
    List<LintIssue> analyzeXML(@NonNull String filePath, @NonNull String contents);
    
    /**
     * Analiza un archivo Gradle
     */
    @NonNull
    List<LintIssue> analyzeGradle(@NonNull String filePath, @NonNull String contents);
    
    /**
     * Obtiene el nombre del analizador
     */
    @NonNull
    String getName();
    
    /**
     * Obtiene la versión del analizador
     */
    @NonNull
    String getVersion();
}

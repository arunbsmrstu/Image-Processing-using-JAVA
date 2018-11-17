/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.opencv.library;

import org.opencv.core.Core;

/**
 *
 * @author Arun
 */
public class Library {
    
    public static void loadLibrary(){
        try {
            System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        } catch (Exception e) {
            System.err.println("Native code library failed to load.\n" + e);
        }
    }
}

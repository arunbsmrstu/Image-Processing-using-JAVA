/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.linearfilters;

import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Arun
 * 
 * 
 */
public class Filter {
    int DELAY_CAPTION = 1500;
    int DELAY_BLUR = 100;
    int MAX_KERNEL_LENGTH = 31;
    Mat dst= new Mat();
    //Normalized Block Filter:
    
    public Mat gettingBlurFilter(Mat mat){
        for (int i = 1; i < MAX_KERNEL_LENGTH; i = i + 2) {
            Imgproc.blur(mat, dst, new Size(i, i), new Point(-1, -1));
        }
        return dst;
    }
    
    public Mat gettingGaussianBlurFilter(Mat mat){
        for (int i = 1; i < MAX_KERNEL_LENGTH; i = i + 2) {
            Imgproc.GaussianBlur(mat, dst, new Size(i, i), 0, 0);
        }
        return dst;
    }
    
    public Mat gettingMedianBlurFilter(Mat mat){
         for (int i = 1; i < MAX_KERNEL_LENGTH; i = i + 2) {
            Imgproc.medianBlur(mat, dst, i);
         }
        return dst;
    }
    
    public Mat gettingBilateralFilterFilter(Mat mat){
        for (int i = 1; i < MAX_KERNEL_LENGTH; i = i + 2) {
            Imgproc.bilateralFilter(mat, dst, i, i * 2, i / 2);
        }
        return dst;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.image;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author Arun
 */
public class OpenCVImage {
    
    public Mat getMatfromFile(String path){
        Mat img = Imgcodecs.imread(path);
        return img;
    }
    
    public Mat getMatfromGrayScaleIMage(String path){
        Mat img = Imgcodecs.imread(path, Imgcodecs.IMREAD_GRAYSCALE);
        return img;
    }
    
    public Mat getMatfromANYCOLOR(String path){
        Mat img = Imgcodecs.imread(path, Imgcodecs.IMREAD_ANYCOLOR);
        return img;
    }
    
    public void saveImage(String path,Mat mat){
        Imgcodecs.imwrite(path,mat);
    }
    
}

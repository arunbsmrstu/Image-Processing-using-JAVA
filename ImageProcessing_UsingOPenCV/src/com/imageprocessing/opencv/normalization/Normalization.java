/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.opencv.normalization;

import static com.imageprocessing.opencv.masking.Mask.saturate;
import org.opencv.core.Mat;

/**
 *
 * @author Arun
 */
public class Normalization {
    //double alpha = 1.0; /*< Simple contrast control */
    //int beta = 0;       /*< Simple brightness control */
//    * Enter the alpha value [1.0-3.0]: 2.2
//* Enter the beta value [0-100]: 50
    public Mat applyNormalization(Mat image,double alpha,int beta){
        Mat newImage = Mat.zeros(image.size(), image.type());
        byte[] imageData = new byte[(int) (image.total()*image.channels())];
        image.get(0, 0, imageData);
        byte[] newImageData = new byte[(int) (newImage.total()*newImage.channels())];
        for (int y = 0; y < image.rows(); y++) {
            for (int x = 0; x < image.cols(); x++) {
                for (int c = 0; c < image.channels(); c++) {
                    double pixelValue = imageData[(y * image.cols() + x) * image.channels() + c];
                    pixelValue = pixelValue < 0 ? pixelValue + 256 : pixelValue;
                    newImageData[(y * image.cols() + x) * image.channels() + c]= 
                            (byte) saturate(alpha * pixelValue + beta);
                }
            }
        }
        newImage.put(0, 0, newImageData);
        
        
        return newImage;
    }
    
}

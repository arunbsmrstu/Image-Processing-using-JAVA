
import com.imageprocessing.linearfilters.Filter;
import com.imageprocessing.opencv.image.OpenCVImage;
import com.imageprocessing.opencv.library.Library;
import org.opencv.core.Mat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun
 */
public class Test {
    
    public static void main(String arg[]){
        Library.loadLibrary();
        Filter f= new Filter();
        OpenCVImage opencvIMage= new OpenCVImage();
        Mat mat= opencvIMage.getMatfromANYCOLOR("image/input.JPG");
        opencvIMage.saveImage("output/Blur.JPG",f.gettingBlurFilter(mat));
        opencvIMage.saveImage("output/GaussianBlur.JPG",f.gettingGaussianBlurFilter(mat));
        opencvIMage.saveImage("output/MedianBlur.JPG",f.gettingMedianBlurFilter(mat));
        opencvIMage.saveImage("output/Bilateral.JPG",f.gettingBilateralFilterFilter(mat));
        System.out.println("Done>>>>");
    }
    
}

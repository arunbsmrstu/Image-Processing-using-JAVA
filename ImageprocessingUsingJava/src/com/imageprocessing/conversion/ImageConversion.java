package com.imageprocessing.conversion;

import java.awt.image.BufferedImage;

/**
 *
 * @author Arun
 */
public class ImageConversion {
    
    public BufferedImage gettingGrayscaleImage(BufferedImage image){
        // get image's width and height 
        int width = image.getWidth(); 
        int height = image.getHeight();
        
        // convert to greyscale 
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                // Here (x,y)denotes the coordinate of image  
                // for modifying the pixel value. 
                int p = image.getRGB(x,y); 
  
                int a = (p>>24)&0xff; 
                int r = (p>>16)&0xff; 
                int g = (p>>8)&0xff; 
                int b = p&0xff; 
  
                // calculate average 
                int avg = (r+g+b)/3; 
  
                // replace RGB value with avg 
                p = (a<<24) | (avg<<16) | (avg<<8) | avg; 
  
                image.setRGB(x, y, p); 
            } 
        }
        
        return image;
    }
    
    public BufferedImage gettingNegative(BufferedImage image){
        // Get image width and height 
        int width = image.getWidth(); 
        int height=image.getHeight(); 
  
        // Convert to negative 
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int p = image.getRGB(x,y); 
                int a = (p>>24)&0xff; 
                int r = (p>>16)&0xff; 
                int g = (p>>8)&0xff; 
                int b = p&0xff; 
  
                //subtract RGB from 255 
                r = 255 - r; 
                g = 255 - g; 
                b = 255 - b; 
  
                //set new RGB value 
                p = (a<<24) | (r<<16) | (g<<8) | b; 
                image.setRGB(x, y, p); 
            } 
        } 
        return image;
    }
    
    public BufferedImage gettingRedImage(BufferedImage image){
        // get width and height 
        int width = image.getWidth(); 
        int height = image.getHeight(); 
  
        // convert to red image 
        for (int y = 0; y < height; y++){ 
            for (int x = 0; x < width; x++){
                int p = image.getRGB(x,y); 
  
                int a = (p>>24)&0xff; 
                int r = (p>>16)&0xff; 
  
                // set new RGB 
                // keeping the r value same as in original 
                // image and setting g and b as 0. 
                p = (a<<24) | (r<<16) | (0<<8) | 0; 
  
                image.setRGB(x, y, p); 
            } 
        }
        return image;
    }
    
    public BufferedImage gettingGreenImage(BufferedImage image){
        // get width and height 
        int width = image.getWidth(); 
        int height = image.getHeight(); 
  
        // convert to green image 
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int p = image.getRGB(x,y); 
  
                int a = (p>>24)&0xff; 
                int g = (p>>8)&0xff; 
  
                // set new RGB 
                // keeping the g value same as in original 
                // image and setting r and b as 0. 
                p = (a<<24) | (0<<16) | (g<<8) | 0; 
  
                image.setRGB(x, y, p); 
            } 
        } 
        return image;
    }
    
    public BufferedImage gettingBlueImage(BufferedImage image){
        // get width and height 
        int width = image.getWidth(); 
        int height = image.getHeight(); 
  
        // convert to blue image 
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int p = image.getRGB(x,y); 
  
                int a = (p>>24)&0xff; 
                int b = p&0xff; 
  
                // set new RGB 
                // keeping the b value same as in original 
                // image and setting r and g as 0. 
                p = (a<<24) | (0<<16) | (0<<8) | b; 
  
                image.setRGB(x, y, p); 
            } 
        } 
        return image;
    }
    
    public BufferedImage gettingSepiaImage(BufferedImage image){
        // get width and height of the image 
        int width = image.getWidth(); 
        int height = image.getHeight(); 
  
        //convert to sepia 
        for(int y = 0; y < height; y++) 
        { 
            for(int x = 0; x < width; x++) 
            { 
                int p = image.getRGB(x,y); 
  
                int a = (p>>24)&0xff; 
                int R = (p>>16)&0xff; 
                int G = (p>>8)&0xff; 
                int B = p&0xff; 
  
                //calculate newRed, newGreen, newBlue 
                int newRed = (int)(0.393*R + 0.769*G + 0.189*B); 
                int newGreen = (int)(0.349*R + 0.686*G + 0.168*B); 
                int newBlue = (int)(0.272*R + 0.534*G + 0.131*B); 
  
                //check condition 
                if (newRed > 255) 
                    R = 255; 
                else
                    R = newRed; 
  
                if (newGreen > 255) 
                    G = 255; 
                else
                    G = newGreen; 
  
                if (newBlue > 255) 
                    B = 255; 
                else
                    B = newBlue; 
  
                //set new RGB value 
                p = (a<<24) | (R<<16) | (G<<8) | B; 
  
                image.setRGB(x, y, p); 
            } 
        }
        return image;
    }
    
}

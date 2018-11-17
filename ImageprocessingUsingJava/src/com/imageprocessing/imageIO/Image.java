package com.imageprocessing.imageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author Arun
 */
public class Image {
    
    public BufferedImage readImageFromFile(String path) throws IOException{
        File file=new File(path);
        BufferedImage image=ImageIO.read(file);
        return image;
    }
    
    public BufferedImage readImageFromImageInputStream(ImageInputStream stream) throws IOException{
        BufferedImage image=ImageIO.read(stream);
        return image;
    }
    
    public BufferedImage readImageFromInputStream(InputStream input) throws IOException{
        BufferedImage image=ImageIO.read(input);
        return image;
    }
    
    public BufferedImage readImageFrom(URL input) throws IOException{
        BufferedImage image=ImageIO.read(input);
        return image;
    }
    
    public void saveImage(String path,BufferedImage image,String extention) throws IOException{
        File file=new File(path);
        ImageIO.write(image,extention, file);
    }
    
    
    
}

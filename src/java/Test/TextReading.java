/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.aspose.ocr.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TextReading {

    public static String myDir = "c:/temp/";

    static void Main(String[] args) {
        try {
            // Set the paths
            String imagePath = "./samples/Sample.bmp";
            String resourcesFolderPath = "./resources/resource.zip";
            
// Create an instance of OcrEngine
            OcrEngine ocr = new OcrEngine();
// Set Resources for OcrEngine
            ocr.setResource(new FileInputStream(resourcesFolderPath));
// Set NeedRotationCorrection property to false
            ocr.getConfig().setNeedRotationCorrection(false);
            
// Set image file
            ocr.setImage(ImageStream.fromFile(imagePath));
            
// Add language
            ILanguage language = Language.load("english");
            ocr.getLanguages().addLanguage(language);
            
// Perform OCR and get extracted text
            try {
                if (ocr.process()) {
                    System.out.println("\ranswer -> " + ocr.getText());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextReading.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

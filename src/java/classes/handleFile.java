/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class handleFile {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        // copy content of source to dest
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    public static void doCopy(String fileName) throws IOException{
        // make copy of profile_pic and profile_background with the new username
        File source = new File("D:\\magdy\\Projects\\QuestionsAndAnswers\\web\\images\\profile_pic.jpg");
        File source2 = new File("D:\\magdy\\Projects\\QuestionsAndAnswers\\web\\images\\profile_background.jpg");
        
        File dest = new File("D:\\magdy\\Projects\\QuestionsAndAnswers\\web\\images\\" + fileName + "_pic.jpg");
        File dest2 = new File("D:\\magdy\\Projects\\QuestionsAndAnswers\\web\\images\\" + fileName + "_bg.jpg");
        copyFileUsingStream(source, dest);
        copyFileUsingStream(source2, dest2);
    }
    
    public static void deleteIMG(String fileName){
        File file  = new File("D:\\magdy\\Projects\\QuestionsAndAnswers\\web\\images\\" + fileName);
        file.delete();
    }
    
    public static void updateIMG(String imageName, InputStream fileContent){
        File uploads = new File("D:\\magdy\\Projects\\QuestionsAndAnswers\\web\\images\\");
        File file = new File(uploads, imageName);
        try {
            System.out.println("\n\n in copy" + file.toPath());
            Files.copy(fileContent, file.toPath());
        } catch (IOException ex) {
            Logger.getLogger(handleFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

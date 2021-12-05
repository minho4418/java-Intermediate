package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("src/javaIO/exam/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readDate = -1;
            while((readDate = fis.read()) != -1){
                fos.write(readDate);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
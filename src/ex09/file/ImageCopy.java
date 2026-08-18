package ex09.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

    public void copy(){
        try (// 파일을 읽어서 저장
            FileInputStream fis = new FileInputStream("sample.png");
            FileOutputStream fos = new FileOutputStream("sample_copy.png");) {


            // 1kb = 1024byte
            byte[] buffer = new byte[1024];
            int len;

            while((len = fis.read(buffer)) != -1){

                fos.write(buffer);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ImageCopy ic = new ImageCopy();
        ic.copy();
    }

}

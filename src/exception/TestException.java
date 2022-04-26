package exception;

import java.io.File;
import java.io.FileInputStream;

public class TestException {

    public static void main(String[] args) {

        File f = new File("d:/LOL.exe");

        try {
            new FileInputStream(f);
            //使用Throwable进行异常捕捉
        } catch (Throwable t) {
            // TODO Auto-generated catch block
            t.printStackTrace();
        }

    }
}
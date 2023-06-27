package test_file;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * @author Uyenne
 */
public class FileIO {
    public static boolean luuFile(ArrayList<Student> stdList, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            for (Student t : stdList) {
                String line = t.getName() + ";" + t.getAddress() + ";" + t.getAverage();
                bw.write(line);
                bw.newLine();
            }

            bw.close();
            osw.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
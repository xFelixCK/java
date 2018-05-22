package classpath;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Poem {
    public void getFile(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        //getResource()方法会去classpath下找这个文件，获取到url resource, 得到这个资源后，调用url.getFile获取到 文件 的绝对路径
        URL url = classLoader.getResource(fileName);
        //url.getFile() 得到这个文件的绝对路径
        System.out.println(url.getFile());
        File file = new File(url.getFile());
        System.out.println(file.length());

        try {
            StringBuilder sb = new StringBuilder();
            char[] temp = new char[1024];
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(inputStream);
            while (reader.read(temp) != -1) {
                sb.append(new String(temp));
                temp = new char[1024];
            }
            inputStream.close();
            reader.close();
            System.out.println(sb.toString());
        } catch (Exception e) {

        }
    }
}

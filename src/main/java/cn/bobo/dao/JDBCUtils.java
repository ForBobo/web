package cn.bobo.dao;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class JDBCUtils {
    public static void main(String[] args) {

//        Map map=new HashMap();
//        List<String> li=new ArrayList<>();

        InputStream is = null;
        OutputStream os = null;
        if (!new File("E:\\Alltools\\testIO.doc").exists()) {
            System.out.println("文件不存在");
            return;
        }
        try {
            is = new FileInputStream(new File("E:\\Alltools\\testIO.doc"));
            os = new FileOutputStream(new File("E:\\Alltools\\testIO2.doc"));

            byte[] b = new byte[1024];
            int num = 0;
            System.out.println("start");
            while ((num = is.read(b)) != -1) {
                os.write(b, 0, num);
            }
            Date dt = new Date();
            System.out.println("over " + dt);
        } catch (IOException i) {
            i.printStackTrace();
        }


    }

    public static void connect() {

    }

}

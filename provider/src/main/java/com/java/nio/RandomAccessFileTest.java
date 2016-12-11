package com.java.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;

/**
 * Created by zhangxingxing on 2016/12/9.
 */
public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile(RandomAccessFileTest.class.getClassLoader().getResource("emp.log").getPath(), "r");

        raf.seek(1);
//        System.out.println(raf.readChar());
        byte[] bytes =  new byte[(int) raf.length()-1];
        System.err.println(raf.read(bytes));
        System.err.println(new String(bytes));





    }

}

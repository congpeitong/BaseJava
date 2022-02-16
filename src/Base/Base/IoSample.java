package Base.Base;

import java.io.*;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/16
 * @describe：
 */
public class IoSample {
    /**
     * 1. InputStream
     *      : abstract int read()  // 读入一个字节，并返回读入的字节，在遇到输入源结尾时返回-1；
     * 2. OutputStream
     *      : abstract int write()
     */
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("target.txt");
        byte[] bytes = new byte[1024];
        int length;
        System.out.println(fileInputStream.read(bytes));
        while ((length = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes,0,length);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}

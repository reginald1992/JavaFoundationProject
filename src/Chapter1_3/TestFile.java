package Chapter1_3; /**
 * Created by Shulin Liu on 2017/7/12 0012.
 */

import java.io.File;

/**
 * java.io.File类
 * 1、凡是和输入输出有关的类、接口等都定义在java.io包下
 * 2、File是一个类，可以有构造器创建其对象。此对象对应着一个文件（.jpg.txt.ppt.doc......）或者文件目录
 *3、File类对象是与平台无关的。
 *4、Flie中的方法，仅涉及到如何创建、删除、重命名等等，只要涉及文件内容的，File类是无能为力的，只能用io流来完成
 * 5、File类的对象常作为io流的具体类的构造器的形参
 */

public class TestFile {
    /**
     * 路径：绝对路径和相对路径
     * 绝对路径：包括盘符在内的完整的文件路径
     * 相对路径：在当前文件目录下的文件的路径

     *访问文件名：
     getName()
     getPath()
     getAbsoluteFile()
     getAbsolutePath()
     getParent()
     renameTo(File newName)：重命名
     file1.renameTo(file2):file1重命名为file2，必须保证file2不存在，file1存在，返回的Boolean类型值

     *文件检测
     exists()
     canWrite()
     canRead()
     isFile()
     isDirectory()

     *获取常规文件信息
     lastModified()
     length()

     *文件操作相关
     createNewFile()
     delete()

     *目录操作相关
     mkDir()
     mkDirs()
     list()
     listFiles()

     *
     *
     *
     *
     *
     * */
    public void test1(){
        File file1= new File("D:\\GitHub\\JavaFoundationProject\\helloworld.txt");
        File file2=new File("Chapter1_3/hello.txt");

        File file3=new File("D:\\GitHub\\JavaFoundationProject");

        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getParent());
        System.out.println();

        System.out.println(file1.exists());
        System.out.println(file2.canWrite());
        System.out.println(file1.canRead());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.lastModified());
        System.out.println();
    }
}

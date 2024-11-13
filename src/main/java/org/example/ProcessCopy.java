package org.example;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProcessCopy extends Thread {
    @Override
    public void run() {
        super.run();
        while (true) {

            try {
                Thread.sleep(1000);
                String str = "virus";
                File myObj = new File(FileSystemView.getFileSystemView().getHomeDirectory() + File.separator, str + ".java");
                if (myObj.createNewFile()) System.out.println("File created: " + myObj.getName());
                FileWriter myWriter = new FileWriter(myObj.getPath());
                myWriter.write("public class " + str + " {" +
                        "    public static void main(String[] args) {" +
                        "        System.out.println(\"Hello from HelloWorld!\");" +
                        "    }" +
                        "}");
                myWriter.close();
                ProcessBuilder compileBuilder = new ProcessBuilder("javac", myObj.getPath());
                compileBuilder.inheritIO(); // Для вывода в консоль
                Process compileProcess = compileBuilder.start();
                compileProcess.waitFor(); // Ждем завершения компиляции
                ProcessBuilder runBuilder = new ProcessBuilder("java", "HelloWorld");
                Process runProcess = runBuilder.start();
                runBuilder.inheritIO(); // Для вывода в консоль
                runProcess.waitFor(); // Ждем завершения выполнения
            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        try {
//            FileWriter myWriter = new FileWriter(myObj.getPath());
//            myWriter.write("import javax.swing.filechooser.FileSystemView;import java.io.File;" +
//                    "import java.io.FileWriter;" +
//                    "import java.io.IOException;" +
//                    "public class virus {" +
//                    "public static void main(String[] args) throws IOException {" +
//                    "File myObj = new File(FileSystemView.getFileSystemView().getHomeDirectory()+File.separator,\"new.txt\");" +
//                    "myObj.createNewFile();" +
//                    "FileWriter myWriter = new FileWriter(myObj.getPath());" +
//                    "myWriter.write(\"virus\");" +
//                    "myWriter.close();" +
//                    "}}");
//            myWriter.close();
//
//            ProcessBuilder pb = new ProcessBuilder();
//            pb.command("javac " + myObj).start();
//            pb.command("java -classpath" + FileSystemView.getFileSystemView().getHomeDirectory() + " virus").start();
//
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
    }
}

package com.Andrii;

import java.io.*;

class FilePractice {
    public static void writeToFile(String str, String filename) throws IOException {
        File filePath = new File(filename).getAbsoluteFile();
        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(filePath)))) {
            out.write(str);
        }
    }

    public static void fileLocator(String fileName) throws IOException {
        File file = new File(System.getProperty("user.dir"));
        typeChecker(file, fileName);
    }

    public static void typeChecker(File file, String filename) throws IOException {
        if (file.isDirectory() && !file.getName().equals("target")) {

            for (File listFile : file.listFiles()) {
                typeChecker(listFile, filename);
            }
        } else if (file.getName().equals(filename)) {
            writeToFile("new test", file.getAbsolutePath());
        }
    }

}

class Main {
    public static void main(String[] args) throws IOException {
//        FilePractice.writeToFile("test", "src/main/resources/files/test.txt");
        FilePractice.fileLocator("test.txt");
    }
}
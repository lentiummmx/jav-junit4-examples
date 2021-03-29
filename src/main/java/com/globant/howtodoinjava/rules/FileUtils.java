package com.globant.howtodoinjava.rules;

import java.io.*;

public class FileUtils {

    public static void writeStringToFile_v1(File tempFile, String fileContent) {
        try(FileWriter fileWriter = new FileWriter(tempFile)) {
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeStringToFile(File tempFile, String fileContent) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile))) {
            bufferedWriter.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileToString_v1(File tempFile) {
        try(FileReader fileReader = new FileReader(tempFile)) {
            int ch = fileReader.read();
            while (ch != -1) {
                System.out.println((char) ch);
                fileReader.close();
            }
            return "" + ch;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String readFileToString(File tempFile) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(tempFile))) {
            String line = bufferedReader.readLine();
            String rLine = null;
            while (line != null) {
                System.out.println(line);
                rLine = line;
                line = bufferedReader.readLine();
            }
            return rLine;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

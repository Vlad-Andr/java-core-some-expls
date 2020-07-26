package com.company.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadAtFile {
public void ds() throws IOException {
    File myObj = new File("filename.txt");// Specify the filename
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
    }
    myReader.close();
    }
}

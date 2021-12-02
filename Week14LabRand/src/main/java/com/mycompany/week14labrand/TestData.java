package com.mycompany.week14labrand;

/**
 *
 * @author itlabs
 */
import java.util.Random;
import java.io.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TestData {
//-----------------------------------------------------------------
// Creates a file of test data that consists of ten lines each
// containing ten integer values in the range 10 to 99.
//-----------------------------------------------------------------

    public static void main(String[] args) throws IOException {
        try {

            final int MAX = 10;
            int value;
            String fileName = "test.txt";
            PrintWriter outFile = new PrintWriter(fileName);

            Random rand = new Random();
            for (int line = 1; line <= MAX; line++) {
                for (int num = 1; num <= MAX; num++) {
                    value = rand.nextInt(90) + 10;
                    outFile.print(value + " ");
                }
                outFile.println();
            }
            outFile.close();
            System.out.println("Output file has been created: " + fileName);
        }// end of try
        catch (FileNotFoundException e) {
            System.err.println("FIle not found and " + e.getMessage());
        } catch (IOException e) {
            System.err.println("FIle not found and " + e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}

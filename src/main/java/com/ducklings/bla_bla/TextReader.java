package com.ducklings.bla_bla;

import java.io.FileReader;
import java.io.IOException;//хз, добавился через Alt+Enter для FileReader и close()
import java.util.Scanner;

public class TextReader {
    public String getText() throws IOException {

        FileReader fr = new FileReader("TextFile.txt");
        Scanner scan = new Scanner(fr);
        String text = scan.nextLine();

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        fr.close();
        return text;
    }
}

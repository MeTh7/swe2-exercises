package ch.juventus.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter {
    public void write() throws IOException {
        Writer writer = new FileWriter("c:\\Software_Engineering\\Projekte_SoE2\\TextDatei_SWE2_EX.txt");
        StringBuffer outputText = new StringBuffer();
        outputText.append("Hello World!");
        outputText.append("\n");
        outputText.append("I am writing to an output file");
        writer.write(outputText.toString());
        writer.close();
    }

}

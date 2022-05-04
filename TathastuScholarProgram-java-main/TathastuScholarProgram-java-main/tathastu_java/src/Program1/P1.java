package Program1;

//Write a Java program to perform basic Calculator operations.

import jdk.jshell.JShell;
//import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) throws IOException {
          
    	try(JShell js = JShell.create(); BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            js.onSnippetEvent(snip -> {
                if (snip.status() == jdk.jshell.Snippet.Status.VALID) {
                    System.out.println("Ans➜ " + snip.value());
                    
                }
            });

            System.out.print("Input> ");
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                js.eval(js.sourceCodeAnalysis().analyzeCompletion(line).source());
                System.out.print("Input> ");
            }
        }
    }
}
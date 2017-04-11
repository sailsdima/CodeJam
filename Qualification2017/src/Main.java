import java.io.*;
import java.util.Scanner;

public class Main {

    private static void solveB() {
        ProblemB problemB = new ProblemB();

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader("B-large.in"));
            try {
                String s;
                int i = 1;
                boolean b = false;
                while ((s = in.readLine()) != null) {
                    if (!b) {
                        b = true;
                        continue;
                    }

                    System.out.println("Case #" + i++ + ": " + problemB.solve(Long.valueOf(s)));
                }
            } finally {

                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        problemB.solve(new Long(1111111110));
        problemB.solve(132);
    }

    private static void solveC() {
        ProblemC problemC = new ProblemC();
        problemC.solve(1, 35, 10);

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader("C-large.in"));
            try {
                String s;
                int i = 1;
                boolean b = false;
                while ((s = in.readLine()) != null) {
                    if (!b) {
                        b = true;
                        continue;
                    }
                    Scanner scanner = new Scanner(s);

                    problemC.solve(i++, scanner.nextLong(), scanner.nextLong());
                }
            } finally {

                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void solveA() {

        ProblemA problemA = new ProblemA();
//        problemA.solve("++++-".toCharArray(), 4);
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader("A-large.in"));
            try {
                String s;
                int i = 1;
                boolean b = false;
                while ((s = in.readLine()) != null) {
                    if (!b) {
                        b = true;
                        continue;
                    }
                    Scanner scanner = new Scanner(s.substring(s.indexOf(" "), s.length()));
                    int res = problemA.solve(s.substring(0, s.indexOf(" ")).toCharArray(), scanner.nextInt());
                    if (res == -1)
                        System.out.println("Case #" + i++ + ": IMPOSSIBLE");
                    else
                        System.out.println("Case #" + i++ + ": " + res);
                }
            } finally {

                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        solveC();
//        solveA();
    }

}

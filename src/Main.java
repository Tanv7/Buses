import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

}public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input_file = new BufferedReader(new FileReader("input.txt"));
        PrintWriter output_file = new PrintWriter("output.txt");
        String line = input_file.readLine();
        String[] split = line.split(" ");
        int n = Integer.parseInt(split[0]);
        int max = 0;
        int[] a = new int[n];
        line = input_file.readLine();
        split = line.split(" ");
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(split[i]) - 1;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(a[j + 1] - a[j] > max) {
                    max = a[j + 1] - a[j];
                }
            }
        }
        System.out.println(max);
        output_file.println(max);
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        input_file.close();
        output_file.close();
    }
}

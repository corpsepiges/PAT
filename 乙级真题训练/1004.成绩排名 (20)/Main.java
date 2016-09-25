import java.util.Scanner;

public class Main {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int n=in.nextInt();
        int min=101;
        String minInfo="";
        int max=-1;
        String maxInfo="";
        for (int t = 0; t < n; t++) {
            String name=in.next();
            String id=in.next();
            int value=in.nextInt();
            if (value>max) {
                maxInfo=name+" "+id;
                max=value;
            }
            if (value<min) {
                minInfo=name+" "+id;
                min=value;
            }
        }
        System.out.println(maxInfo);
        System.out.println(minInfo);
    }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int n=in.nextInt();
        Set<Integer> testSet=new HashSet<Integer>();
        Set<Integer> testAns=new HashSet<Integer>();
        Set<Integer> finalAns=new HashSet<Integer>();
        for (int t = 0; t < n; t++) {
            int test=in.nextInt();
            if (!testSet.contains(test)) {
                testAns.add(test);
                while (test!=1) {
                    if ((test&1)==1) {
                        test=3*test+1;
                    }
                    test/=2;
                    testSet.add(test);
                }
            }
        }
        for (Integer test : testAns) {
            if (!testSet.contains(test)) {
                finalAns.add(test);
            }
        }
        int[] ans=new int[finalAns.size()];
        int index=0;
        for (Integer test : finalAns) {
            ans[index++]=test;
        }
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[ans.length-i-1]);
            if (i<ans.length-1) {
                System.out.print(" "); 
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int n=in.nextInt();
        for (int t = 0; t < n; t++) {
            String str=in.next();
            char[] cs=str.toCharArray();
            int[] test=new int[3];
            int index=0;
            boolean flag=true;
            for (int i = 0; i < cs.length; i++) {
                if (cs[i]=='A') {
                    test[index]++;
                }else if (cs[i]=='P') {
                    if (index==0) {
                        index=1;
                    }else{
                        flag=false;
                        break;
                    }
                }else if (cs[i]=='T') {
                    if (index==1) {
                        index=2;
                    }else{
                        flag=false;
                        break;
                    }
                }else{
                    flag=false;
                    break;
                }
            }
            while (flag) {
                if (test[1]==1&&test[0]==test[2]) {
                    break;
                }
                if (test[0]<0||test[1]<=0||test[2]<0) {
                    flag=false;
                    break;
                }
                test[1]--;
                test[2]-=test[0];
            }
            System.out.println(flag&&cs.length>=3?"YES":"NO");
        }
    }
}

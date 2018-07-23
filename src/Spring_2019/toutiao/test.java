package Spring_2019.toutiao;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        int n=cs.nextInt();
        int r=0;
        for(int i=0;n>=1;i++){
            if (n%2==1) {
                r=n-1+i;
                System.out.print(r);
                break;
            }
            else{
                n=n/2;
            }
        }
    }
}

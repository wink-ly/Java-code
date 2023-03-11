package test2;

import java.util.Scanner;

public class feibo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int []fei = new int[100001];
        fei[0]=1;
        fei[1]=1;
        for(int i=2;i<100001;i++){
        	fei[i] = (fei[i-1]+fei[i-2])%1000000;
        }
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.printf("%d\n",fei[n]);
        }
    }
}

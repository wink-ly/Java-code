package test5;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		while(sc.hasNext()) {
			for (int i = 0; i < 10; i++) {
				a[i] = sc.nextInt();
			}
			int os = 0, js = 0,temp=0;
			for (int i = 0; i < 10; i++) {
				if (a[i] % 2 == 0) {
					os++;
				}
				else
					js++;
			}
			int[] b=new int[os];
			int[] c=new int[js];
			for(int i=0,o=0,j=0;i<10;i++) {
				if (a[i] % 2 == 0) 
					b[o++]=a[i];
				else 
					c[j++]=a[i];
			}
			for(int i=os-1;i>=0;i--){
	            for(int j=0;j<i;j++){
	                if(b[j]>b[j+1]){
	                    temp=b[j];
	                    b[j]=b[j+1];
	                    b[j+1]=temp;
	                }
	            }
	        }
			for(int i=js-1;i>=0;i--){
	            for(int j=0;j<i;j++){
	                if(c[j]<c[j+1]){
	                    temp=c[j];
	                    c[j]=c[j+1];
	                    c[j+1]=temp;
	                }
	            }
	        }
			for(int i=0;i<c.length;i++) {
				System.out.printf("%d ",c[i]);
			}
			for(int i=0;i<b.length;i++) {
				System.out.printf("%d ",b[i]);
			}
		}	
	}
}

package codechef;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class third {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int flag = 1;
			if(y>n){
			      System.out.println("NO");
			  } else {
				  for(int j = 1; j <= n; j++) {
						if((x+(k*j))%n == y) {
							System.out.println("YES");
		                    flag=0;
		                    break;
						}
		            } 
			  }
            if(flag==1) {
            	System.out.println("NO");
            }
	    }
		
		
		
		
//		for(int i = 0; i < t; i++) {
//			long n = sc.nextLong();
//			long k = sc.nextLong();
//			long x = sc.nextLong();
//			long y = sc.nextLong();
//			long affected = 0;
//			boolean isAffected = false;
//			long no = 0;
//			for(int j = 0; j <= n; j++) {
//				for(long p = x; p <= n;) {
//					affected = p + k;
//					if(affected == y) {
//						System.out.println("YES");
//						isAffected = true;
//						break;
//					}
//                    if(affected > n) {
//						x = affected - x - 1;
//						no += 1;
//					} else if(affected < n) {
//						x = affected;
//					} else {
//						x = 1;
//						no += 1;
//					}
//                    if(no == 2) {
//                    	if(!isAffected) {
//                    		System.out.println("NO");
//                    		break;
//                    	}
//                    }
//                    if(no == 1) {
//                     	break;
//                     }
//				}
//				if(isAffected) {
//					break;
//				}
//			}
//			isAffected = false;
//		}
		
		
		
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(br.readLine());
//		while(t-->0)
//		{
//		    String s = br.readLine();
//		    String str[] = s.split(" ");
//		    int n = Integer.parseInt(str[0]);
//		    int k = Integer.parseInt(str[1]);
//		    int x = Integer.parseInt(str[2]);
//		    int y = Integer.parseInt(str[3]);
//		    int flag = 1;
//		    for(int i=1;i<=n;i++)
//    		{
//                if ((x+(k*i))%n == y)
//    			{
//                    System.out.println("YES");
//                    flag=0;
//                    break;
//                }
//            }
//            if (flag==1)
//            {
//                System.out.println("NO");
//            }
//
//		    
//		}
		
		
		}

	}



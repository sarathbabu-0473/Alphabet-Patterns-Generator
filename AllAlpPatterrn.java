package home;
import java.util.Scanner;
public class AllAlpPatterrn {

	public static void main(String[] args)  throws InterruptedException
	{
		int n = 6;
		Scanner s = new Scanner(System.in);
		boolean ss =true;
		do {
//Enter Pattern KEY :
			System.out.println(":::::****Enter Pattern ****::::");
			char alphaa = s.next().charAt(0);
			switch(alphaa) {

			case'A':

				for (int i = 0; i <=10; i++) {

					for (int j = 0, a = 10; j <=a; j++) {

						if(i+j==a&&i>4||i==8&&j==6||i==8&&j==5||i==8&&j==4||i==8&&j==3||i==8&&j==7||i==j&&i>4		){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("----------------------------------------------------------------------------------------------------------------------");

				break;	












			case 'B':
				//B 
				//i==0||j==1||i==5&&j>=n/3||i==n||j==n
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {
						// i==0||i==n/4||j==0&&i<=n/2
						if(i==0||j==1||i==3&&j>=n/2||i==n||j==n){  // j==0&&i<4
							System.out.print("*"+"");
							Thread.sleep(50);
						}
						else
							System.out.print(" ");	
					}
					System.out.println("");  // separator	 
				}
				System.out.println("----------------------------------------------------------------------------------------------------------------------");
				break;
				// 	System.out.println("Next: ");
				// char  next = s.next().charAt(0);
			case 'C':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {
						// i==0||i==n/2||j==0&&i<=n/2
						if(j==0||i==0||i==n){  // j==0&&i<4
							System.out.print("*"+"");
							Thread.sleep(50);
						}
						else
							System.out.print(" ");	
					}
					System.out.println("");  // separator

				}
System.out.println("-------------------------------------------------------"
		+ "---------------------------------------------------------------");				
break;
				// D
				//System.out.println("Next: ");
				//char  next1 = s.next().charAt(0);
			case 'D':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(j==1||i==0||i==n||j==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;
				//System.out.println("Next: ");
				//char  next2 = s.next().charAt(0);

				// E	
			case 'E':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(j==0||i==0||i==3||i==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;

				// F				
				//	System.out.println("Next: ");
				//	char  next3 = s.next().charAt(0);
			case 'F':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(j==0||i==0||i==3){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;

				// H
				//System.out.println("Next: ");
				//	char  next4 = s.next().charAt(0);
			case 'H':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(j==0||i==3||j==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;
				// I
				//System.out.println("Next: ");
				//char  next5 = s.next().charAt(0);
			case 'I':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||j==3||i==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;

				//System.out.println("Next: ");
				//char  next6 = s.next().charAt(0);
			case 'J':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||j==3||i==n&&j<=n/2||j==0&&i>=n/2){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;

				// k
			case 'K':
				int k = 6;
				for (int i = 0; i <=k; i++) {
					for (int j = 0; j <=k; j++) {

						if(i+j==k&&i<5||i==j&&j>2||j==1){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.err.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;			
				// L

				//System.out.println("Next: ");
				//char  next7 = s.next().charAt(0);
			case 'L':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(j==0||i==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;

				// M
			case 'M':
				int m = 10;
				for (int i = 0; i <=m; i++) {
					for (int j = 0; j <=m; j++) {

						if(j==0&&i<m||j==m&&i<m||i==j&&i<6||i+j==m&&i<6){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;			
				//N 
			case 'N':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(j==0||i==j||j==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");
				break;	
				// O					
			case 'O':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||i==n||j==0||j==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");
				break;	
				// P					
			case 'P':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(j==0||i==0||i==2||j==n&&i<=n/3){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.err.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");
				break;	

				// Q	
			case 'Q':
				for(int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||j==0||i==n||j==n||i==j&&i>2){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");
				break;

				// R 	
			case 'R':

				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {
						//j==1||i==0||i==j&&j>2||j==n&&i<4||i==3&&j>3	
						if(j==1||i==0||i==j&&j>2||j==n&&i<4||i==3&&j>3){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;							
				// S					
			case 'S':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

			if(i==0||j==0&&i<=n/2||i==3||j==n&&i>=n/2||i==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.err.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");
				break;	
				// T					
			case 'T':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||j==2){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator
				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");

				break;	
				// U					
			case 'U':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(j==0||j==n||i==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;
				// V
			case 'V':
				int v = 13;
				for (int i = 0; i <=v; i++) {
					for (int j = 0; j <=v; j++) {

						if(i==j&&i<7||i+j==v&&i<7){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;


				// W 

			case 'W':						
				int w = 10;
				for (int i = 0; i <=w; i++) {
					for (int j = 0; j <=w; j++) {

						if(i==j&&i>4||i+j==w&&i>4||j==0&&i>0||j==w&&i>0){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;	
				// X					
			case 'X':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==j||i+j==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;
				// Y   
			case 'Y':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==j&&i<4||i+j==n&&i<3||j==3&&i>2){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;
				// 			Z
			case 'Z':
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||i==n||i+j==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");
				break;	
				//2
			case '2' :
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||j==0&&i>=n/2||i==2||j==n&&i<=n/2||i==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");				break;		
			case '3' :
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||i==3||i==n||j==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");
				break;	


			case '0' :
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {

						if(i==0||j==0||i==n||j==n){  
							System.out.print("*");
							Thread.sleep(50); 
						}
						else
							System.out.print(" ");	
					}
					System.out.println(" "+"|");  // separator

				}
				System.out.println("-------------------------------------------------------"
						+ "---------------------------------------------------------------");
				break;	


			}
		}while(ss);

	}

}

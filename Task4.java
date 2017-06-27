import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] month ={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[]    days={31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Enter the month name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String[] split =name.split("/");
		
		int monthno=Integer.parseInt(split[0]);
		int Day=Integer.parseInt(split[1]);
		
		int sumOfDays=0;
		for(int i=0;i<monthno-1;i++){
			sumOfDays=sumOfDays+days[i];
		}
		sumOfDays=sumOfDays + Day;
		System.out.println("Nod of Days From 1st Jan");
		System.out.println(sumOfDays);
		
		
		
		
		
			
		
		
	}

}

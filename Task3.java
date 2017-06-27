import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] month ={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[]    days={31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Enter the month name:");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
			for(int i=0;i<month.length;i++){
				if(month[i].equals(name)){
					System.out.println("Day in the month"+name);
					System.out.println(days[i]);
				}
			}
		
		
	}

}

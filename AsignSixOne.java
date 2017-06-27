
public class AsignSixOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the array with size 10
		int[] array= new int[10];
		
		//initializing the array bylooping through the array to its size and
		//inserting the values to each index of the arraay as array index starts form 0-9
		for(int i =1 ;i<=array.length;i++){
			array[i-1]=i;
			if(i%2==0){
				System.out.println(array[i-1]);
			}
		}
		
	}
}

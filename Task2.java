
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare the array with size 10
				int[] array= new int[10];
				
				//initializing the array by looping through the array to its size and
				//inserting the values to each index of the arraay as array index starts form 0-9
				for(int i =0 ;i<array.length;i++){
					if (i ==0)			
						array[i]=2;			//initialy known that the first prime no=2
					
					else{
					int num=3;
					int status=1;
					//always correct loop
					for(int k =2;k< 10;){
						
						//index should not be out of bound
						if(i<10){
						 for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )//looping till the square root of the no and checking for its primw nature
				         {
				            if ( num%j == 0 )
				            {
				               status = 0;
				               break;
				            }
				           
				         }
						 if ( status != 0 )
				         {
				            array[i]=num;	//numis prime insert into the array
				            
				            i++;
				         }
				         status = 1;
				         num++;
				      }       
						else break;			//else break the loop is index is out of bound
					}
						
					
					}
					
					
					}
					//print the original array
					System.out.print("original array");
					System.out.println();
					for(int i=0; i<10;i++){
						
						System.out.print(array[i]+" ");
						
					}
					//create a different array and putting the values in reverse order in it from the origianl array
					int[] rev=new int[10];
					for(int i=0; i<10;i++){
						rev[9-i]=array[i];
					
					}
					
					//printing the reverse array
					System.out.println();
					System.out.println("reversed array");
					for(int i=0; i<10;i++){
						
						System.out.print(rev[i]+" ");
						
					}
					
				}
				
	}



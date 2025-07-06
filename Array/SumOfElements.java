package Demo_Array;
//Total Sum of Arrya Elements 
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {20,55,60,64,23,99};
		
		int sum = 0;
		for(int i = 0 ; i<marks.length;i++) {
		    sum += marks[i];
		}
		System.out.println("Sum Of Marks is : "+sum);
		

	}

}

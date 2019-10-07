package lab05;

public class StaticEx {
	
	public static void main(String [] args){
		
		int [] array1 = { 1, 5, 7, 9 };
		int [] array2 = { 3, 6, -1, 100, 77 };
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}

class ArrayUtil {
	
		static int[] concat(int []array1, int []array2) {
			
			int [] con1 = new int[9]; 
			
			for(int i = 0; i < array1.length; i++) {
				con1[i] = array1[i];
			}
			
			for(int j = 0; j < array2.length; j++) {
				con1[array1.length + j] = array2[j];
			}
			
			return con1;
		}
		
		static void print(int []array) {
			
			System.out.print("[");
			
			for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
			
			System.out.print("]");
		}
}


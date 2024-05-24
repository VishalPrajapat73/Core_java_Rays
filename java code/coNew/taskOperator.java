package in.coNew;

import java.time.LocalDate;
public class taskOperator {
	
//	public static int search (int set[], int key) {
//		for(int i=0; i<set.length; i++) {
//			if(set[i]==key) {
//				return i;
//			}
//		} return -1;
//	}
//	
	
	
	public static void main(String[] args) {
//		int i=2;
//		System.out.println(i++ + ++i + i++ + ++i);
//		
//		int j=0;
//		System.out.println(j-- + ++j + ++j + j++);
//		
//		int k=10;
//		System.out.println(k++ + k++ + k++ + k++ + ++k + ++k);
		
		
//		int arr[] = {100,200,300,400,500,600,700,800,900};
//		for(int i=0; i<arr.length;i++) {
//			arr[i]=arr[i]+1;
//			System.out.println(arr[i]);
//		}
		
//		int set[] = {100,200,300,400,500,600,700,1000};
//		int key=1000;
//		int index = search(set, key);
////		taskOperator.search(set, key);
//		if(index==-1) {
//			System.out.println("Key not found "+key);
//		}else {
//			System.out.println("Key will be found "+key);
//		}
		
		
		
		
		int birth = 2004;
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		
		int age = currentYear-birth;
		
		System.out.println(age);
		
		
		
		
	}
	
}

import java.util.Arrays;
import java.util.* ;
public class SecondLargest{
	public static int findSecondLargest(int n, int[] arr) {
		Arrays.sort(arr);
		int index=0;
		int[] newArray=new int[n];
		for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
               newArray[index++]=arr[i];
			}
		}
		newArray[index++]=arr[n-1];
		if(index<2){
			return -1;
		}
		newArray=Arrays.copyOf(newArray, index);
		return newArray[index-2];
	}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter array elements : ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Second Largest Element: "+findSecondLargest(n,arr));
    sc.close();
}
}


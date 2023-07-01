import java.util.Arrays;

public class RemoveDuplicateEliment {
	public static void main(String[] args) {
		int[] a= {24,12,12,12,7,7,9,8,9,8,15,15};
		a=MargeSort.msort(a);
		System.out.println(Arrays.toString( removeAndCountDuplicate(a)));
	}
	
	
	public static int[]  removeAndCountDuplicate(int arr[]) {
	
		int j=1;
		int k=0;
	
		while(j<arr.length) {
			if(arr[k]!=arr[j]){
			
				k++;
				arr[k]=arr[j];
				
			}
			j++;
		}
		
        return Arrays.copyOfRange(arr, 0, k+1);

	}
	

}












//public static int removeDuplicates(int[] arr) {
//Arrays.sort(arr);
//int i=0;
//for(int j=1;j<arr.length;j++){
//    if(arr[i]!=arr[j]){
//        i++;
//        arr[i]=arr[j];
//    }
//}
//return i+1;
//
//}
//

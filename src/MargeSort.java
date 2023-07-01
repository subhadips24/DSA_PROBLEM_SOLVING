import java.util.Arrays;

public class MargeSort {
	
			public static void main(String[] args) {
				int[] a= {24,12,7,7,9,8,9,8,15,15};
				a=msort(a);
				System.out.println(Arrays.toString(a));
			}
			
			
			static public int[] msort(int [] arr) {
				
				if(arr.length==1) {
					return arr;
				}
				
				int mid=arr.length/2;
				int leftArray[]=msort(Arrays.copyOfRange(arr,0,mid));
				int rightArray[]=msort(Arrays.copyOfRange(arr,mid,arr.length));
				
				return marge(leftArray,rightArray);
				
			}


			private static int[] marge(int[] f, int[] s) {
				
				int i=0,j=0,k=0;
				int mix[]=new int[f.length+s.length];
					while(i<f.length &&  j<s.length) {
						if(f[i]<s[j]) {
							mix[k]=f[i];
							i++;
							k++;
						}else {
							mix[k]=s[j];
							j++;
							k++;
						}
					}
					while(i< f.length) {
						mix[k]=f[i];
						i++;
						k++;
					}
					while(j<s.length) {
						mix[k]=s[j];
						j++;
						k++;
					}
					
					return mix;
		
		}

}

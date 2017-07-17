/**
 * 插入排序
 * 
 *  最好的情况是 n
 *  最坏是 n 方
 */
package sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] test= {1,23,32,2,31,2,23,1,2,3};
		fun(test);
		for(int i : test)
			System.out.print(i+" ");
		System.out.println("\n");
	}
	
	public static int[] fun(int[] A){
		for(int i = 1;i<A.length;i++){
			int key = A[i];
			int k = i-1;
			while(k>0 && key<A[k]){
				A[k+1] = A[k]; 
				k--;
			}
			A[k+1] = key;
		}
		return A;
	} 
}

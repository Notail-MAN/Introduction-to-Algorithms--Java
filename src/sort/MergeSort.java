/**
 * 归并排序
 * */
package sort;


public class MergeSort {
	public static void main(String[] args) {
		int[] A = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };  
        fun(A, 0,A.length-1 );   
        for (int i = 0; i < A.length; i++) {  
            System.out.print(A[i] + "\t");  
        }
	}

		public static int[] fun(int[] A, int start,int end){
			if(start==end)
				return A;
			int mid = (start + end)/2;
			fun(A, start, mid);
			fun(A, mid+1, end);
			 merge(A, start, mid, end);
			return null;
		}
		 public static void merge(int[] data, int left, int center, int right) {  
		        // 临时数组  
		        int[] tmpArr = new int[data.length];  
		        // 右数组第一个元素索引  
		        int mid = center + 1;  
		        // third 记录临时数组的索引  
		        int third = left;  
		        // 缓存左数组第一个元素的索引  
		        int tmp = left;  
		        while (left <= center && mid <= right) {  
		            // 从两个数组中取出最小的放入临时数组   
		            if (data[left] <= data[mid]) {  
		                tmpArr[third++] = data[left++];  
		            } else {  
		                tmpArr[third++] = data[mid++];  
		            }  
		        }  
		        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）  
		        while (mid <= right) {  
		            tmpArr[third++] = data[mid++];  
		        }  
		        while (left <= center) {  
		            tmpArr[third++] = data[left++];  
		        }  
		        // 将临时数组中的内容拷贝回原数组中  
		        // （原left-right范围的内容被复制回原数组）  
		        while (tmp <= right) {  
		            data[tmp] = tmpArr[tmp++];  
		        }  
		    }  
}

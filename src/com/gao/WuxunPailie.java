package com.gao;

import java.util.Arrays;

public class WuxunPailie {
	public static void main(String[] args) {
		int  a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println("原数组是:"+Arrays.toString(a));
		int k=(int) (Math.random()*10);
		System.out.println(k);
		k-=5;
		int count=1;
		while(k<5) {
		for(int i=a.length-1; i>=1; i--)  
	    {  
		   int j=(int) (Math.random()*10)%(i+1);
//		   System.out.println(i+":"+j);
	       int temp=a[i];
	       a[i]=a[j];
	       a[j]=temp;
	    }  
		System.out.println(count+"次洗牌后是:"+Arrays.toString(a));
		count++;
		k++;
		}
		System.out.println();
		binaryInsertSort(a);
		System.out.println("二分法排序组是:"+Arrays.toString(a));

	}
	
	

/**
 * 二分法排序<br>
 * 根据排序原则，每次我们都是在一个有序序列中插入一个新的数字<br>
 * 那么我们可以将这个有序序列进行二分。<br>
 * 左游标left为0，右游标right为i-1(i是这个数字在原数组中的位置)<br>
 * middle初始为。<br>
 * 当left<=right时<br>
 * middle是left和right的中值。<br>
 * 我们作如下操作。如果array[i]的值比array[middle]值大。<br>
 * 那么我们就移动左游标令值为middle+1<br>
 * 负责就移动右游标为middle-1<br>
 * 移动完成后,我们需要将i-1到left之间的值进行依次向后移动给array[i]空出一个位置然后将array[i]插入
 * <p style="color:red">时间复杂度n</p>
 */
	public static int[] binaryInsertSort(int[] array){
		for(int i = 0;i<array.length;i++){
			int temp = array[i];//待插入到前面有序序列的值
			int left = 0;//有序序列的左侧
			int right = i-1;//有序序列的右侧
			int middle = 0;//有序序列的中间
			while(left <= right){
				middle = (left + right)/2;//赋值
				if(temp<array[middle]){
					right = middle-1;
				}else{
					left = middle + 1;
				}
			}
			for(int j = i-1;j>=left;j--){
				//从i-1到left依次向后移动一位,等待temp值插入
				array[j+1] = array[j];
			}
			if(left != i ){
				array[left] = temp;
			}
		}
		return array;
	}
}

//Rebecca Yuste-Golob
//APCS2 pd 8
//2014-05-21
//HW42

/* approach:
   we first created a heapify method to heapify a region of the array. we then used that method with the sorting algorithm, moving the partition along at each step*/

import java.util.*;

public class HeapSort{
    
    public static void sort(int[] data){
	heapify(data, 0, data.length);
	int temp;
	int partition;
	int left;
	int right;
	for(int i = data.length - 1; i >=0; i--){
	    temp = data[0];
	    data[0] = data[i];
	    partition = i;
	    heapify(data, 0, i);
	    data[partition] = temp;
	}

	
    }


    public static void heapify(int[] data, int start, int end){

	for(int i = start+1; i < end ; i++){
	    int temp;
	    int parInd = (i-1)/2;
	    int childInd = i;
	    while(data[parInd] < data[childInd]){
		temp = data[childInd];
		data[childInd] = data[parInd];
		data[parInd] = temp;
		childInd = parInd;
		parInd = (childInd-1)/2;
	    }
	}
    }


    public static void main(String[] args) {
	int[] arr = {6,8,3,5,1,7};
	System.out.println(Arrays.toString(arr));
	heapify(arr, 0, 6);
	System.out.println(Arrays.toString(arr));

	sort(arr);
	System.out.println(Arrays.toString(arr));


    }
}



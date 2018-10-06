public class MergeSort implements SortingAlgorithm
{
	public void sort(int [] a) 
	{

        doMergeSort(0, length - 1);
		
	}

	 private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) 
        {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        for (int i = lowerIndex; i <= higherIndex; i++) 
        {
            tempMergArr[i] = arr[i];
        }
     
        while (i <= middle && j <= higherIndex) 
        {
            if (tempMergArr[i] <= tempMergArr[j]) 
            {
                arr[k] = tempMergArr[i];
                i++;
            } 
            else 
            {
                arr[k] = tempMergArr[j];
                j++;
            }
            
            k++;
        }
        while (i <= middle) 
        {
            arr[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
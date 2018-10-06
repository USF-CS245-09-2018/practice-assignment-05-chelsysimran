public class InsertionSort implements SortingAlgorithm
{
	public void sort(int [] a) //insertion sort is considered half more efficient that bubble sort or selection sort
	{
		for (int i = 1; i<a.length; i++)
		{
			double temp = a[i];
			int k = i - 1;

			while (k >= 0 && a[k] > temp)
			{
				a[k+1] = a[k];
				--k;
			}
		}
		
	}
}
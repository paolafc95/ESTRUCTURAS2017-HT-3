import java.util.ArrayList;

/**
 * Esta clase tiene los 4 metodos de sort.
 
 */
public class Sorts {


	/**
    mergeSort se encarga ordenar numeros. 
    Codigo inspirado en: Carnegie mellon university
    @param a tipo Comparable.
	 */
	public static void mergeSort(Comparable [ ] a){
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}

	/**
    mergeSort se encarga ordenar numeros. 
    Codigo inspirado en: Carnegie mellon university
    @param a,tmp tipo Comparable. left y right tipo int.
	 */
	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}
	/**
    mergeSort se encarga ordenar numeros. 
    Codigo inspirado en: Carnegie mellon university
    @param a,tmp tipo Comparable. left,right y rightEnd tipo int.
	 */
	private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd ){

		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;

		while(left <= leftEnd && right <= rightEnd)
			if(a[left].compareTo(a[right]) <= 0)
				tmp[k++] = a[left++];
			else
				tmp[k++] = a[right++];

		while(left <= leftEnd)    // Copy rest of first half
			tmp[k++] = a[left++];

		while(right <= rightEnd)  // Copy rest of right half
			tmp[k++] = a[right++];

		// Copy tmp back
		for(int i = 0; i < num; i++, rightEnd--)
			a[rightEnd] = tmp[rightEnd];
	}

	/**
    quickSort se encarga ordenar numeros. De forma recursiva.
    Codigo inspirado en: 
    @param arr tipo Comparable. a,b tipo int.
	 */
	public static void qSort(Comparable[] arr, int a, int b) {
		if (a < b) {
			int i = a, j = b;
			Comparable x = arr[(i + j) / 2];

			do {
				while (arr[i].compareTo(x) < 0) i++;
				while (x.compareTo(arr[j]) < 0) j--;

				if ( i <= j) {
					Comparable tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					i++;
					j--;
				}

			} while (i <= j);

			qSort(arr, a, j);
			qSort(arr, i, b);
		}
	}


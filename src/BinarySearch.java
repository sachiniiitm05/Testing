
public class BinarySearch {

	public static void main(String[] args) {
		Integer[] integerList = {2,4,6,10,12,14,16,18,20,22,24,26,30,26,72,100};
		
		int x = 18;
		int index = binarSearch(integerList, x);
		
		System.out.println("Index of " + x + " is " + index);

	}

	private static int binarSearch(Integer[] integerList, int x) {
		
		int start  = 0;
		int end = integerList.length - 1 ;		
		if (end > 0){			
			while (start <= end) {
				int mid = (start+end)/2;
				if (integerList[mid] == x) {
					return mid;
				} else if(integerList[mid] > x) {
					end = mid - 1;					
				} else { 
					 start = mid + 1;
				}
				mid = end/2;
			}
		}
		return 0;
	}

}

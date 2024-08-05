package comp.Aurionpro.fileinputstreamtest;

public class SortedArraySquareConverter {
	public static void main(String[] args) {

		int array1[] = { 4, 7, 2, 6, 9, 11 };
		int array2[] = new int[array1.length];
		int ele1;
		int ele2;
		for (int i = 0; i < array1.length; i++) {
			for (int n = i + 1; n < array1.length; n++) {
				ele1 = array1[i];
				ele2 = array1[n];

				if (ele1 > ele2) {
					array1[i] = ele2;
					array1[n] = ele1;
					i--;
					break;
				}
			}
		}
		System.out.println("Sorted Array :");
		for (int i = 0; i < array1.length; i++) {
			ele1 = array1[i];
			array2[i] = (int) (Math.pow(ele1, 2));
			System.out.print(" " + array1[i] + " ");
		}

		System.out.println();
		System.out.println("Sorted square Array :");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array2[i] + " ");
		}
	}
}

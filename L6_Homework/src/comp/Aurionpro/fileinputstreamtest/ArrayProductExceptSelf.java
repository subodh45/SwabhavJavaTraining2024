package comp.Aurionpro.fileinputstreamtest;

public class ArrayProductExceptSelf {
	public static void main(String[] args) {

		int array[] = { 0, 3 ,0, 9 };
		int productArray[] = new int[array.length];
		int productRight = 1;
		int productleft = 1;
		int product;
		for (int n = 0; n < array.length; n++) {
			productRight = rightProduct(array, productRight, n);
			productleft = leftproduct(array, productleft, n);

			productArray[n] = productRight * productleft;
			productleft = 1;
			productRight = 1;
		}
		System.out.println("Product array is ");
		for (int number : productArray) {
			System.out.print(number + " ");
		}
	}

	private static int leftproduct(int[] array, int productleft, int n) {
		for (int j = n - 1; j >= 0; j--) {
			productleft = productleft * array[j];
		}
		return productleft;
	}

	private static int rightProduct(int[] array, int productRight, int n) {
		for (int i = n + 1; i < array.length; i++) {
			productRight = productRight * array[i];
		}
		return productRight;
	}
}

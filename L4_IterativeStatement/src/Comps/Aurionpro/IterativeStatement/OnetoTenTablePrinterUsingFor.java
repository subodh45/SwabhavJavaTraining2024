package Comps.Aurionpro.IterativeStatement;

public class OnetoTenTablePrinterUsingFor {

	public static void main(String[] args) {

		for (int n = 1; n <= 10; n++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(n * i + "\t");
			}
			System.out.println();
		}

	}
}

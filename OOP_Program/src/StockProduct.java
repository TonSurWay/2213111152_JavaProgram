import java.util.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] prod = new Product[4];

		for (int i = 0; i < prod.length; i++) {

			prod[i] = new Product();
			System.out.print("Input product Id : ");
			prod[i].setId(sc.next());
			System.out.print("Input product Unit : ");
			prod[i].setUnit(sc.nextInt());
			while (!prod[i].checkUnit()) {
				System.out.print("Input product Unit, again : ");
				prod[i].setUnit(sc.nextInt());
			}
		}
	}
}

package curso_programacao;

public class escopo_e_inicializacao {

	public static void main(String[] args) {

		double price = 400.00;
		double discount;

		if (price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}

		System.out.println(price);

	}

}

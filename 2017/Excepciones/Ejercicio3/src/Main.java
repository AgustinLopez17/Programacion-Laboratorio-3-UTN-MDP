
public class Main {

	public static void main(String[] args) {
		ExcepcionEnArray ea = new ExcepcionEnArray();
		try {
			ea.getValor(6);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepci�n: indice de array fuera de limites " + e.getMessage());
		}
	}

}

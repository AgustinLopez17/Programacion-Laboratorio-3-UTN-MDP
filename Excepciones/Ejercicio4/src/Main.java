
public class Main {
	public static void main(String[] args) {
		try {
			throw new MiExcepcion("mi propia Excepci�n");
		} catch (MiExcepcion e) {
			System.out.println("excepci�n: " + e.getMensaje());
		}
	}
}

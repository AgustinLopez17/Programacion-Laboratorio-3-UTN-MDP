
public class Main {
	public static void main(String[] args) {
		ExcepcionNull en = null;
		try {
			en.getString();
		} catch (Exception e) {
			System.out.println("Se produjo una expci�n. " + e.getMessage());
		}
	}
}

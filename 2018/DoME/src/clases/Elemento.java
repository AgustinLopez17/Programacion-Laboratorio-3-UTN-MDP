package clases;

public class Elemento {
	private String titulo;
	private int duracion;
	private boolean loTengo;
	private String comentario;

	/**
	 * Inicializa los campos del elemento.
	 * 
	 * @param elTitulo
	 *            el t�tulo de este elemento.
	 * @param tiempo
	 *            La duraci�n de este elemento.
	 */
	public Elemento(String elTitulo, int tiempo) {
		titulo = elTitulo;
		duracion = tiempo;
		loTengo = false;
		comentario = "";
	}
	
	
	public void imprimir()
	{
		
	}

}

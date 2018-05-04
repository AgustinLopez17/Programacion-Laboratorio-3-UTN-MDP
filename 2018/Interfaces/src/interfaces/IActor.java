package interfaces;

/**
* La interfaz que ser� implementada por cualquier clase
*/
public interface IActor
{
		
	/**
	* Determina el comportamiento diario del actor. Traslada
	al actor al campoActualizado si es que participa en otros pasos
	de la simulaci�n.
	* @param campoActual El estado actual del campo
	* @param ubicacion La ubicaci�n del actor en el campo actual
	* @param campoActualizado El estado actualizado del campo
	*/
	void actuar();
	

}


public class Futbolista extends Persona 
{

	private String posicion;
	private int numero;
	
	public Futbolista(String nombre, int edad, String pais, String posicion, int numero) 
	{
		super(nombre, edad, pais);
		this.posicion = posicion;
		this.numero = numero;
		
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() 
	{
	    return super.toString() + ", futbolista en la posición " + posicion + ", número " + numero;
	}


}

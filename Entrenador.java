
public class Entrenador extends Persona {

	private String nacionalidad;
	private int experiencia;
	
	
	public Entrenador(String nombre, int edad, String pais, String nacionalidad, int experiencia) 
	{
		super(nombre, edad, pais);
		this.nacionalidad = nacionalidad;
		this.experiencia = experiencia;
		
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	@Override
	public String toString() 
	{
		
		return super.toString() + "Es de nacionalidad " + nacionalidad + "Experiencia " + experiencia;
	}

	
}


public class Masajista extends Persona 
{
	private String profesion;
	
	public Masajista(String nombre, int edad, String pais, String profesion) 
	{
		super(nombre, edad, pais);
		this.profesion = profesion;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	@Override
	public String toString() {
		return super.toString() + "Profesion " + profesion;
	}

	
}

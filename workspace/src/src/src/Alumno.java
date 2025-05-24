package src;

public class Alumno {
	
	private int codigo,nota1, nota2;
	private String nombre;
	public Alumno(int codigo,int nota1, int nota2, String nombre) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Alumno() {
		
	}
	public Alumno(int codigo) {
		this.codigo=codigo;
	}
}

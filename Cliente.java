
public class Cliente {
	private String nombre, direccion, dni;
	public Cliente(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
	}
	
	
	public String dameNombre() {
		return this.nombre;
	}
	public String dameDireccion() {
		return this.direccion;
	}
	public String dameDNI() {
		return this.dni;
	}
	
	
	@Override
	public boolean equals(Object otro) {
		boolean resultado = false;
		if(otro instanceof String) {
			String dniC = (String) otro;
		return  resultado = this.dameDNI().equals(dniC);
		}
		return resultado;
	}

}


public abstract class ServicioSimple extends Servicio{
	protected double costoBase;
	protected String fechaInicio;
	protected int cantidad;
	
	public ServicioSimple(double costoBase, String fechaInicio, int cantidad) {
		super();
		this.costoBase = costoBase;
		this.fechaInicio = fechaInicio;
		this.cantidad = cantidad;
	}
	
	protected abstract double calcularCostoTotal();

}

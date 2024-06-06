
public abstract class Servicio {
	protected int codUnico;
	protected double costoTotal;
	
	
	protected abstract double calcularCostoTotal();
	
	protected int generarCodigoUnico() {
		return codUnico;
	}
}

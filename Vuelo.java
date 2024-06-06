
public class Vuelo extends ServicioSimple{
	private String pais, ciudad;
	private String fechaLlegada;
	private double tasa;
	
	public Vuelo(double costoBase, String fechaInicio, int cantidad, String pais,
			String ciudad, String fechaLlegada, double tasa) {
		super(costoBase, fechaInicio, cantidad);
		this.pais = pais;
		this.ciudad = ciudad;
		this.fechaLlegada = fechaLlegada;
		this.tasa = tasa;
		
	}

	@Override //La tasa esta calculada si se pasa un porcentaje, ejemplo 10% u otro
	protected double calcularCostoTotal() {
		return costoBase + (costoBase*(tasa / 100)) ;
	}
	

}

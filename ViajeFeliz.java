import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ViajeFeliz implements IViajeFeliz{
	private int nroCuit;
	private HashMap<Integer, Servicio> serviciosOfrecidos = new HashMap <>();
	private HashMap<String, Cliente> clientes = new HashMap<>();
	
	//getters
	public int dameCuit() {
		return this.nroCuit;
	}
	
	
	// 1 CONSTRUCTOR 
	public ViajeFeliz(int nroCuit) {
		this.nroCuit = nroCuit;
		this.serviciosOfrecidos = new HashMap<>();
		this.clientes = new HashMap<>();
	}
	

	
	@Override //2 REGISTRA CLIENTE
	public void registrarCliente(String dni, String nombre, String direccion) {
		for(String key : clientes.keySet()) {
			if(key.equals(dni)){
				throw new RuntimeException("El cliente ya está registrado");
			}
			Cliente nuevo = new Cliente(dni, nombre, direccion);
			clientes.put(dni, nuevo);
		}
	}

	@Override //3 CREA UN SERVICIO DE TIPO VUELO
	public int crearServicio(double costoBase, String fechaInicio, int cantidad, String pais, String ciudad,
			String fechaLlegada, double tasa) {
		Servicio nuevo = new Vuelo(costoBase, fechaInicio, cantidad, pais, ciudad, fechaLlegada, tasa);
		int codUnico = nuevo.generarCodigoUnico();
		serviciosOfrecidos.put(codUnico, nuevo);
		System.out.println("Se creo un nuevo servicio con el codigo: " + codUnico);
		return codUnico;
	}

	@Override
	public int crearServicio(double costoBase, String fechaInicio, int cantidad, String pais, String ciudad,
			String fechaSalida, String hotel, double costoTraslado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int crearServicio(double costoBase, String fechaInicio, int cantidad, String pais, String ciudad,
			double garantia, String fechaDevolucion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int crearServicio(double costoBase, String fechaInicio, int cantidad, String lugarSalida,
			boolean esDiaCompleto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] crearPaquetesPredefinidos(int cantPaquetes, int[] codigosDeServicios) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int iniciarContratacion(String dni, int codServicio) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregarServicioAContratacion(String dni, int codServicio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitarServicioDeContratacion(String dni, int codServicio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularCostoDePaquetePersonalizado(String dni, int codPaquetePersonalizado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pagarContratacion(String dni, String fechaPago) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> historialDeContrataciones(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String contratacionesSinIniciar(String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> contratacionesQueInicianEnFecha(String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Integer> obtenerCodigosCatalogo() {
		// TODO Auto-generated method stub
		return null;
	}

}

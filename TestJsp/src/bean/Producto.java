package bean;


public class Producto {

	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private Inventario invet;
	
	

	public Producto() {
		super();
		invet=new Inventario();
		
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public Inventario getInvet() {
		return invet;
	}



	public void setInvet(Inventario invet) {
		this.invet = invet;
	}






	
	
	
	
}

package modelo_entities;
 
public class Producto {
	private String codigo_EAN;
	private String codigo_SAP;
	private String descripcion;
 
	
	public Producto(){}
	public Producto( String codigo_SAP, String codigo_EAN , String descripcion) {
		super();
		this.codigo_EAN = codigo_EAN;
		this.codigo_SAP = codigo_SAP;
		this.descripcion = descripcion;
	}
 
	public String getcodigo_EAN() {
		return codigo_EAN;
	}
 
	public void setCodigo_EAN(String Codigo_EAN) {
		this.codigo_EAN = Codigo_EAN;
	}
 
	public String getCodigo_SAP() {
		return codigo_SAP;
	}
 
	public void setcodigo_SAP(String codigo_SAP) {
		this.codigo_SAP = codigo_SAP;
	}
 
	public String getDescription() {
		return descripcion;
	}
 
	public void setDescription(String descripcion) {
		this.descripcion = descripcion;
	}
 
 
}
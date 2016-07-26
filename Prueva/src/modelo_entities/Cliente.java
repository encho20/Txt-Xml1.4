package modelo_entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String NombreCadena;
	private String NombreTienda;
	private String Address;
	private String Codigo_EAN_Cadena;
	private String Codigo_EAN_Tienda;
	private String Codigo_SAP_Cadena;
	private String Codigo_SAP_Tienda;
	private String ProjectCode;
	private String codigo1;
	private String codigo2;

 
	public Cliente () {}
 
	public Cliente (String Version,String Object,String NombreCadena, String NombreTienda, String DireccionTienda,String Codigo_EAN_Tienda, String
			    Codigo_EAN_Cadena,String Codigo_SAP_Tienda,String CodigoSAP_Cadena,String Ciudad,String codigo1,String codigo2) 
	
	{		
	
		super();
		this.NombreCadena = NombreCadena;
		this.NombreTienda = NombreTienda;
		this.Address = DireccionTienda;
		this.Codigo_EAN_Cadena =Codigo_EAN_Cadena;
		this.Codigo_EAN_Tienda =Codigo_EAN_Tienda;
		this.Codigo_SAP_Cadena =CodigoSAP_Cadena ;
		this.Codigo_SAP_Tienda =Codigo_SAP_Tienda ;
		this.ProjectCode = Ciudad;
		this.codigo1 = codigo1;
		this.codigo2 = codigo2;
	}
	Date now = new Date(System.currentTimeMillis());
	SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	public String getNombreCadena() {
		return NombreCadena;
	}
 
	public void setNombreCadena(String NombreCadena) {
		this.NombreCadena = NombreCadena;
	}
 
	public String getNombreTienda() {
		return NombreTienda;
	}
 
	public void setNombreTienda(String NombreTienda) {
		this.NombreTienda = NombreTienda;
	}
 
	public String getDireccionTienda() {
		return Address;
	}
 
	public void set(String DireccionTienda) {
		this.Address = DireccionTienda;
	}
 
	public String getCodigo_EAN_Cadena() {
		return Codigo_EAN_Cadena;
	}
 
	public void setCodigo_EAN_Cadena(String Codigo_EAN_Cadena) {
		this.Codigo_EAN_Cadena= Codigo_EAN_Cadena;
	}
 
	public String getCodigo_EAN_Tienda () {
		return Codigo_EAN_Tienda;
	}
 
	public void setCodigo_EAN_Tienda(String Codigo_EAN_Tienda) {
		this.Codigo_EAN_Tienda= Codigo_EAN_Tienda;
	}

 
	public void setCodigoSAP_Cadena(String CodigoSAP_Cadena) {
		this.Codigo_SAP_Cadena= CodigoSAP_Cadena;
	}
		public String getCodigoSAP_Cadena () {
			return Codigo_SAP_Cadena;
		}
	 
	public void setCodigo_SAP_Tienda(String Codigo_SAP_Tienda) {
			this.Codigo_SAP_Tienda= Codigo_SAP_Tienda;
	}
		
	public String getCodigo_SAP_Tienda() {
				return Codigo_SAP_Tienda;
	}
	
		
   public void setCiudad(String Ciudad) {
	       this.ProjectCode= Ciudad;
	}
   
   
	public String getCiudada() {
	    return ProjectCode;
	}
	
	
	  public void setcodigo1(String codigo1) {
	       this.codigo1= codigo1;
	}
	  
	  
	public String getcodigo1() {
	    return codigo1;
	}
	
	
	  public void setcodigo2(String codigo2) {
	       this.codigo2= codigo2;
	}
	  
	  
	public String getcodigo2() {
	    return codigo2;
	}
	
 
}
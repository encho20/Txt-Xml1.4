package modelo_entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String NombreCadena;
	private String NombreTienda;
	private String DireccionTienda;
	private Long Codigo_EAN_Cadena;
	private Long Codigo_EAN_Tienda;
	private String Codigo_SAP_Cadena;
	private String Codigo_SAP_Tienda;
	private String Ciudad;
	private Integer codigo1;
	private Integer codigo2;

 
	public Cliente () {}
 
	public Cliente (String NombreCadena,String NombreTienda,String DireccionTienda,Long Codigo_EAN_Tienda, Long
			    Codigo_EAN_Cadena,String Codigo_SAP_Tienda,String CodigoSAP_Cadena,String Ciudad,Integer codigo1,Integer codigo2) 
	
	{		
	
		super();
		this.NombreCadena = NombreCadena;
		this.NombreTienda = NombreTienda;
		this.DireccionTienda = DireccionTienda;
		this.Codigo_EAN_Cadena =Codigo_EAN_Cadena;
		this.Codigo_EAN_Tienda =Codigo_EAN_Tienda;
		this.Codigo_SAP_Cadena =CodigoSAP_Cadena ;
		this.Codigo_SAP_Tienda =Codigo_SAP_Tienda ;
		this.Ciudad = Ciudad;
		this.codigo1 = codigo1;
		this.codigo1 = codigo2;
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
		return DireccionTienda;
	}
 
	public void set(String DireccionTienda) {
		this.DireccionTienda = DireccionTienda;
	}
 
	public Long getCodigo_EAN_Cadena() {
		return Codigo_EAN_Cadena;
	}
 
	public void setCodigo_EAN_Cadena(Long Codigo_EAN_Cadena) {
		this.Codigo_EAN_Cadena= Codigo_EAN_Cadena;
	}
 
	public Long getCodigo_EAN_Tienda () {
		return Codigo_EAN_Tienda;
	}
 
	public void setCodigo_EAN_Tienda(Long Codigo_EAN_Tienda) {
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
	       this.Ciudad= Ciudad;
			}
	public String getCiudada() {
	    return Ciudad;
				}
	  public void setcodigo1(Integer codigo1) {
	       this.codigo1= codigo1;
			}
	public Integer getcodigo1() {
	    return codigo1;
				}
	  public void setcodigo2(Integer codigo2) {
	       this.codigo2= codigo2;
			}
	public Integer getcodigo2() {
	    return codigo2;
				}
}
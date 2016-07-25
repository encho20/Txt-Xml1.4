package modelo_entities;
 
import java.util.List;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name="BO")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reporte {
	
	@XmlElement(name="AdmiInfo")
	private List<AdmiInfo> AdmiInfo;
	
	@XmlElement(name="Documents")
	private List<Cliente> BO;
	
	@XmlElement(name="producto")
	private List<Producto> producto;
 
	public List<AdmiInfo> getAdmiInfo() {
		return AdmiInfo;
	}
 
	public void setAdmiInfo(List<AdmiInfo> AdmiInfo) {
		this.AdmiInfo = AdmiInfo;
	}

	
	public Reporte() {}
 
	public List<Cliente> getCliente() {
		return BO;
	}
 
	public void setCliente(List<Cliente> Cliente) {
		this.BO = Cliente;
	}
 
	public List<Producto> getProducto() {
		return producto;
	}
 
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	
	
 
 
}
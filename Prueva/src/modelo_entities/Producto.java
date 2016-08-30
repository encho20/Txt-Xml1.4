package modelo_entities;
 
public class Producto {
	private String LineNum;
	private String ItemCode;
	private String Quantity;
	private String U_VIcoCadena;
	private String WarehouseCode; 
	private String ProjectCode;
	private String U_VuCadena;
	
	public Producto(){}
	public Producto(String LineNum,String ItemCode,String Quantity,String U_VIcoCadena,
			        String WarehouseCode, String U_VuCadena,String ProjectCode) {
		super();
	   this.LineNum=LineNum;
	   this.ItemCode=ItemCode;
	   this.Quantity=Quantity;
	   this.U_VIcoCadena=U_VIcoCadena;
	   this.U_VuCadena=U_VuCadena;
	   this.U_VIcoCadena=U_VIcoCadena;
	   this.WarehouseCode=WarehouseCode;
	   this.ProjectCode=ProjectCode; 
	}
	public String getLineNum() {
		return LineNum;
	}
	public void setLineNum(String lineNum) {
		LineNum = lineNum;
	}
	public String getItemCode() {
		return ItemCode;
	}
	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getU_VIcoCadena() {
		return U_VIcoCadena;
	}
	public void setU_VIcoCadena(String u_VIcoCadena) {
		U_VIcoCadena = u_VIcoCadena;
	}
	public String getWarehouseCode() {
		return WarehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		WarehouseCode = warehouseCode;
	}
	public String getProjectCode() {
		return ProjectCode;
	}
	public void setProjectCode(String projectCode) {
		ProjectCode = projectCode;
	}
	public String getU_VuCadena() {
		return U_VuCadena;
	}
	public void setU_VuCadena(String u_VuCadena) {
		U_VuCadena = u_VuCadena;
	}
 
	
 
}
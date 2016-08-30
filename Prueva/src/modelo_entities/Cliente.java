package modelo_entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String DocNum;
	private String DocDate;
	private String DocDueDate;
	private String CardCode;
	private String Series;
	private String TaxDate;
	private String NumAtCard;
	private String Address2;
	private String Address;
	private String Comments;
	private String PickRemark;
	private String U_BKV_UID;
	private String U_GW_Fecha1;
	private String U_GW_Fecha2;
 
	public Cliente (){} 
	
	
	public Cliente (String comentarios ,String DocNum,String DocDate, 
			String DocDueDate, String CardCode,String TaxDate,String Address2,String NumAtCard,String
			    Address,String Comments,String codigo2,String U_BKV_UID,
			    String U_GW_Fecha2,String U_GW_Fecha1,String Series) 
	
	{		
	
		super();
		this.DocNum = DocNum;
		this.DocDate = DocDate;
		this.DocDueDate = DocDueDate;
		this.CardCode = CardCode;
		this.TaxDate =TaxDate;
		this.NumAtCard =NumAtCard ;
		this.Address2 =Address2 ;
		this.Address = Address;
		this.Comments = Comments;
		this.PickRemark = codigo2;
		this.U_BKV_UID = comentarios;
		this.U_GW_Fecha1=U_GW_Fecha1;
		this.U_GW_Fecha2=U_GW_Fecha2;
		this.Series=Series;
		
	}


	public String getDocNum() {
		return DocNum;
	}


	public void setDocNum(String docNum) {
		DocNum = docNum;
	}


	public String getDocDate() {
		return DocDate;
	}


	public void setDocDate(String docDate) {
		DocDate = docDate;
	}


	public String getDocDueDate() {
		return DocDueDate;
	}


	public void setDocDueDate(String docDueDate) {
		DocDueDate = docDueDate;
	}


	public String getCardCode() {
		return CardCode;
	}


	public void setCardCode(String cardCode) {
		CardCode = cardCode;
	}


	public String getSeries() {
		return Series;
	}


	public void setSeries(String series) {
		Series = series;
	}


	public String getTaxDate() {
		return TaxDate;
	}


	public void setTaxDate(String taxDate) {
		TaxDate = taxDate;
	}


	public String getNumAtCard() {
		return NumAtCard;
	}


	public void setNumAtCard(String numAtCard) {
		NumAtCard = numAtCard;
	}


	public String getAddress2() {
		return Address2;
	}


	public void setAddress2(String address2) {
		Address2 = address2;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getComments() {
		return Comments;
	}


	public void setComments(String comments) {
		Comments = comments;
	}


	public String getPickRemark() {
		return PickRemark;
	}


	public void setPickRemark(String pickRemark) {
		PickRemark = pickRemark;
	}


	public String getU_BKV_UID() {
		return U_BKV_UID;
	}


	public void setU_BKV_UID(String u_BKV_UID) {
		U_BKV_UID = u_BKV_UID;
	}


	public String getU_GW_Fecha1() {
		return U_GW_Fecha1;
	}


	public void setU_GW_Fecha1(String u_GW_Fecha1) {
		U_GW_Fecha1 = u_GW_Fecha1;
	}


	public String getU_GW_Fecha2() {
		return U_GW_Fecha2;
	}


	public void setU_GW_Fecha2(String u_GW_Fecha2) {
		U_GW_Fecha2 = u_GW_Fecha2;
	}

	}

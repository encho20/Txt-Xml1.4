package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class prueba_2 {

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
 
	
	public  void LeerTexto (String direccion){ 
		try {
			File Abrir_archivo = new File("C:\\testeo\\l2.txt");
			FileReader lector = new FileReader(Abrir_archivo);
			BufferedReader bufferedReader = new BufferedReader(lector);
			StringBuffer stringBuffer = new StringBuffer();
			String linea;
	
			
			while ((linea = bufferedReader.readLine()) != null) {		
	
				
				stringBuffer.append(linea);
				stringBuffer.append("\n");
		
					  String [] arreglo = cortarCadenaPorEspacios(linea);
					  
						
					
		             
			  for(int i = 0; i < arreglo.length ; i++) {
				  System.out.println(arreglo [i]);           
				  if (i==13){
					  System.out.println(" \n");
				  }
				             
					//  System.out.println( arreglo[i]);
					    	//System.out.println(arreglo.length);
					
				  
				  
		   
		        
					    }
					    	
					 		  
					 }
			   
				
			lector.close();

				
			//System.out.println("Contenido");
	      //System.out.println(stringBuffer.toString());
			//System.out.println("\n");

		} catch (IOException e) {
			e.printStackTrace();
			
			
				  
						
			}

		}
			
	private static String[] cortarCadenaPorEspacios(String linea) {
		// TODO Auto-generated method stub
		return linea.split("	");  }
	         
		}



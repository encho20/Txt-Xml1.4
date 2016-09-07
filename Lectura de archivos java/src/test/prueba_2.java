package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class prueba_2 {

	public static void main(String[] args) {
		try {
			File Abrir_archivo = new File("C:\\Users\\practicantesistemas\\Desktop\\Edison Dearmas\\testeo.txt");
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

				
			System.out.println("Contenido");
	      System.out.println(stringBuffer.toString());
			System.out.println("\n");

		} catch (IOException e) {
			e.printStackTrace();
		
			
	            }
	         
		}

	private static String[] cortarCadenaPorEspacios(String linea) {
		// TODO Auto-generated method stub
		return linea.split(" ");
		  
				
	}

}

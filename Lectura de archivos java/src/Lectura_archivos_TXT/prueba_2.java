package Lectura_archivos_TXT;

import java.io.File;
import java.io.FileReader;
public class prueba_2 {
	public static void main (String [] args){
		

	String Object, version,DocNum,DocDate,DocDueDate,CardCode,Series,TaxDate,NumAtCard,Address2
    ,Address,Comments,PickRemark,U_BKV_UID,U_GW_Fecha1,U_GW_Fecha2;
    
	
    
	{
		
	try
	{
	   File abrir_archivo= new File("C:\\Users\\practicantesistemas\\Desktop\\Archivos de prueba TXT");	
	   //Abrir el fichero indicado en la variable nombreFichero
	   FileReader lector = new FileReader("C:\\Users\\practicantesistemas\\Desktop\\Edison Dearmas\\testeo.txt");
	   
	   //Leer el primer carácter
	   //Se debe almacenar en una variable de tipo int
	   int caracter_Numero = lector.read();
	   
	   //Se recorre el fichero hasta encontrar el carácter -1
	   //   que marca el final del fichero
	 

	 
	   while(caracter_Numero != -1)
	   {	   
		   if(caracter_Numero==-7){
			
			   //System.out.println(" ");
		   }
		   
		   else{
			   
			   //System.out.print("\n");
		   }
		   
		 System.out.print((char)caracter_Numero);
	     caracter_Numero = lector.read();
	   }
	   //Cerrar el fichero
	 lector.close();
	}
	
	
	
	
	catch (Exception e)
	{
	   System.out.println("Error de lectura del fichero");
	}
	
        }
	  }
	}

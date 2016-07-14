package Lectura_archivos_TXT;

import java.io.File;
import java.io.FileReader;
public class prueba_2 {
	public static void main (String [] args){


	{
		
		
		
	try
	{
	   File lector= new File("C:\\Users\\practicantesistemas\\Desktop\\Archivos de prueba TXT");	
	   //Abrir el fichero indicado en la variable nombreFichero
	   FileReader fr = new FileReader("C:\\Users\\practicantesistemas\\Desktop\\Archivos de prueba TXT\\Pendientes medellin.txt");
	   
	   //Leer el primer carácter
	   //Se debe almacenar en una variable de tipo int
	   int caracter_Numero = fr.read();
	   
	   //Se recorre el fichero hasta encontrar el carácter -1
	   //   que marca el final del fichero
	 
	 
	   while(caracter_Numero != -1)
	   {	   
		   if (String.valueOf(caracter_Numero).equals(null)){
			
			  System.out.println("\n"); 
		   }
		   else {
  
			 
		   }
			   
		   System.out.print((char)caracter_Numero);
	       caracter_Numero = fr.read();
	   }
	   //Cerrar el fichero
	   fr.close();
	}
	catch (Exception e)
	{
	   System.out.println("Error de lectura del fichero");
	}
	
        }
	  }
	}

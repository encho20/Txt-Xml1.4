package Lectura_archivos_TXT;

import java.io.*;
import javax.swing.JOptionPane;

public class Clase_incioTexteo_de_lectura {
	public static void main (String [] args){
	
	try{
 		
	FileReader ObjetoFile  = new FileReader("C:\\Users\\practicantesistemas\\Desktop\\Edison Dearmas\\testeo.txt");
	@SuppressWarnings("resource")
	BufferedReader ObjetoBuffer = new BufferedReader(ObjetoFile);
	String Texto;
   
	while ((Texto=ObjetoBuffer.readLine())!= null){
    	if (Texto==" "){
    		System.out.println("\n");
    	}
    	
    	else {
    		System.out.println("hay problema "+Texto);	
    	}
    	
   
    }

}
catch (Exception ex){
	JOptionPane.showMessageDialog(null,"Error En lectura de datos");
      }
   }
}


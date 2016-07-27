package ejecutar_main;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.JAXBException;
import dao_model.jaxb.ReportMarshaller;
import modelo_entities.AdmiInfo;
import modelo_entities.Cliente;
import modelo_entities.DocNum;
import modelo_entities.Producto;
import modelo_entities.Reporte;
public class Main {
 
	public static void main(String[] args) {
		List<AdmiInfo> AdmiInfo = new ArrayList<>();
		List<DocNum> DocNum = new ArrayList<>();
		List<Cliente> Cliente = new ArrayList<>();
		List<Producto> producto = new ArrayList<>();
		Reporte Reporte = new Reporte();
		ReportMarshaller<Reporte> marshaller = null;
 
		Collections.addAll(AdmiInfo,
				new AdmiInfo("17","2")
		);
    	Collections.addAll(Cliente,
			new Cliente("fsdf", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")
		
			
		);
		Collections.addAll(producto,
				new Producto("10", "12345678912134", "jack Daniel's")
				
		);
		
		Collections.addAll(DocNum,
				new DocNum("\n","\n")
	
		);
	
		Reporte.setAdmiInfo(AdmiInfo);
		Reporte.setCliente(Cliente);
		Reporte.setProducto (producto);
		Reporte.setDocNum(DocNum);
		 
		try {
			marshaller = new ReportMarshaller<Reporte>();
			marshaller.marshal(Reporte, new File("C:\\Testeo\\l" ));
			System.out.println("Leyendo el XML...");
			System.out.println();
			Reporte = null;
			Reporte = marshaller.unmarshal(new File("C:\\Testeo\\l"));
			

                  System.out.println("\n:AdmiInfo\n");
                for(AdmiInfo Adm  : Reporte.getAdmiInfo()) {
	            System.out.println(Adm.getObject());
	            System.out.println(Adm.getVersion()+"\n");
}
			
			System.out.println("Usuarios:\n");
			for(Cliente user : Reporte.getCliente()) {
				System.out.println(user.getNombreCadena());
				System.out.println(user.getNombreTienda());
				System.out.println(user.getCodigo_EAN_Cadena());
				System.out.println(user.getCodigo_EAN_Tienda());
				System.out.println(user.getCodigo_SAP_Tienda());
				System.out.println(user.getCiudada());
				System.out.println(user.getCodigoSAP_Cadena()+"\n");
			}
                        System.out.println("\nProductos:\n");
			for(Producto product : Reporte.getProducto()) {
				System.out.println(product.getcodigo_EAN());
				System.out.println(product.getCodigo_SAP());
				System.out.println(product.getDescription()+"\n");
			}
		}   catch (JAXBException e) {
			e.printStackTrace();
		}
 
	}
 
}
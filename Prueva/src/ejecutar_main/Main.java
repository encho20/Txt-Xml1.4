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
		List<Cliente> Cliente = new ArrayList<>();
		List<Producto> producto = new ArrayList<>();
		Reporte Reporte = new Reporte();
		ReportMarshaller<Reporte> marshaller = null;
 
		Collections.addAll(AdmiInfo,
				new AdmiInfo("17","2")
		);
    	Collections.addAll(Cliente,
			new Cliente("1", "\n", " 3", "4", "5", "6",
					"7", "8", "9", "10", "20160822", "12"," 11"
							 ,"13","14")
		);

    			
		Collections.addAll(producto,
			 	new Producto("0", "101097", "12","45865","136596","101","BOGOTA")
				
		);
		
		
	
		Reporte.setAdmiInfo(AdmiInfo);
	    Reporte.setCliente(Cliente);
		Reporte.setProducto (producto);

		 
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
				System.out.println(user.getDocNum());
				System.out.println(user.getCardCode());
				System.out.println(user.getAddress2());
				System.out.println(user.getAddress());
				System.out.println(user.getComments());
				System.out.println(user.getDocDueDate());
				System.out.println(user.getNumAtCard());
				System.out.println(user.getPickRemark());
				System.out.println(user.getSeries()+"\n");
			}
                        System.out.println("\nProductos:\n");
			for(Producto product : Reporte.getProducto()) {
				System.out.println(product.getLineNum());
				System.out.println(product.getProjectCode());
				System.out.println(product.getU_VIcoCadena());
				System.out.println(product.getProjectCode());
				System.out.println(product.getWarehouseCode());
				System.out.println(product.getItemCode());
				System.out.println(product.getU_VuCadena()+"\n");
			}
		}   catch (JAXBException e) {
			e.printStackTrace();
		}
 
	}
 
}
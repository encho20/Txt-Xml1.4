package ejecutar_main;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.JAXBException;
import dao_model.jaxb.ReportMarshaller;
import modelo_entities.Adminfo;
import modelo_entities.Producto;
import modelo_entities.Reporte;
public class Main {
 
	public static void main(String[] args) {
		List<Adminfo> Cliente = new ArrayList<>();
		List<Producto> producto = new ArrayList<>();
		Reporte Reporte = new Reporte();
		ReportMarshaller<Reporte> marshaller = null;
 
		Collections.addAll(Cliente,
			new Adminfo("Exito","carvajal","calle falsa 123","1234567","13258468L","csd465654d","csd465653d"," ","125","546","2", "17"),
			new Adminfo("Exito","Arican","calle falsa 1234","12345654","13258479L","csd465654d","csd465653d","Bogota","125","546","2", "17")
			
		);
		Collections.addAll(producto,
				new Producto("10", 123456789121347867L, "jack Daniel's"),
				new Producto("reytul", 987654321987654321L, "jack Daniel's")
		);
		Reporte.setCliente(Cliente);
		Reporte.setProducto (producto);
		try {
			marshaller = new ReportMarshaller<Reporte>();
			marshaller.marshal(Reporte, new File("C:\\Testeo\\l" ));
			System.out.println("Leyendo el XML...");
			System.out.println();
			Reporte = null;
			Reporte = marshaller.unmarshal(new File("C:\\Testeo\\l"));
			System.out.println("Usuarios:\n");
			for(Adminfo user : Reporte.getCliente()) {
				System.out.println(user.getNombreCadena());
				System.out.println(user.getNombreTienda());
				System.out.println(user.getCodigo_EAN_Cadena());
				System.out.println(user.getCodigo_EAN_Tienda());
				System.out.println(user.getCodigo_SAP_Tienda());
				System.out.println(user.getObject());
				System.out.println(user.getVersion());
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
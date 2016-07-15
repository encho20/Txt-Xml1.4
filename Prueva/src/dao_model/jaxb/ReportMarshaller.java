package dao_model.jaxb;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import modelo_entities.Reporte;
 
 
public class ReportMarshaller<T> {
	private static JAXBContext jaxbContext;
 
	public ReportMarshaller() throws JAXBException {
		jaxbContext = JAXBContext.newInstance(Reporte.class);
	}
 
	public void marshal(Reporte report, File output) throws JAXBException {
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(report, output);
	}
 
	public Reporte unmarshal(File input) throws JAXBException {
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Reporte report = (Reporte) unmarshaller.unmarshal(input);
		return report;
	}
 
}
package jaxb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.models.Employees;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class EmployeesJAXB {

    private static final Logger LOGGER = LogManager.getLogger(EmployeesJAXB.class);



    ///CREATE XML

    public static void marshal(Employees employee, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Employees.class);
        LOGGER.info("Created context");
        Marshaller marshaller = context.createMarshaller();
        LOGGER.info("Created marshaller");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        LOGGER.info("Marshalled object");
        marshaller.marshal(employee, new FileWriter(filePath));
    }


    /// GET FROM XML
    public static Employees unmarshal(String filePath) throws JAXBException, IOException {
        Employees employee = new Employees();
        JAXBContext context = JAXBContext.newInstance(Employees.class);
        LOGGER.info("Created context");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        LOGGER.info("Created unmarshaller");
        employee =(Employees) unmarshaller.unmarshal(new File(filePath));
        LOGGER.info("Unmarshalled and assigned employee value");
        return employee;
    }




}

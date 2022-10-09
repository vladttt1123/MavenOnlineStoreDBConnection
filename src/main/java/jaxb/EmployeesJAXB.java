package jaxb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.models.Employees;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.List;

public class EmployeesJAXB {

    private static final Logger LOGGER = LogManager.getLogger(EmployeesJAXB.class);



    ///CREATE XML

    public static void marshal(Employees employee, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Employees.class);
        LOGGER.info("context created");
        Marshaller marshaller = context.createMarshaller();
        LOGGER.info("marshaller Created");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        LOGGER.info("object Marshalled");
        marshaller.marshal(employee, new FileWriter(filePath));
    }

    public static void marshal(List<Employees> employees, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(EmployeesHolder.class);
        LOGGER.info("context created ");
        Marshaller marshaller = context.createMarshaller();
        LOGGER.info("marshaller created");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        EmployeesHolder employeesHolder = new EmployeesHolder(employees);
        marshaller.marshal(employeesHolder, new File(filePath));
        LOGGER.info("object marshalled");
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
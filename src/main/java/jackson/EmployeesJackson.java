package jackson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import persistence.models.Employees;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesJackson {
    private static final Logger LOGGER = LogManager.getLogger(EmployeesJackson.class);

    //marshall
    public static void marshal(Employees employee, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), employee);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
    public static void marshal(List<Employees> employee, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), employee);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }


    //unmarshall
    public static Employees unmarshal(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        Employees employee = null;
        try {
            employee = mapper.readValue(new File(filePath), Employees.class);
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return employee;
    }



    public static List<Employees> unmarshalList(String filePath){
        ObjectMapper mapper = new ObjectMapper();
        List<Employees> listEmployees = new ArrayList<>();
        try {
            listEmployees = mapper.readValue(new File(filePath),
                    mapper.getTypeFactory().constructCollectionType(List.class, Employees.class));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return listEmployees;
    }

}

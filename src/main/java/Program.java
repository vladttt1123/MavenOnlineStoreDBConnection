import jackson.EmployeesJackson;
import jaxb.EmployeesJAXB;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.dao.*;

import persistence.models.*;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class Program {

    private static final Logger LOGGER = LogManager.getLogger(Program.class);
    public static void main(String[] args) throws IOException, JAXBException {



        Reader reader = Resources.getResourceAsReader("mybatis/mybatis-configuration.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);


//        Employees employee = new Employees(9,"Vladosik", "Gordishok",4,2);
//        Customers customer1 = new Customers(6,"TEST","TEST","1234","Lviv",3);
//
//
        try(SqlSession session = factory.openSession()){

            IEmployeesRepo EmployeesMapper = session.getMapper(IEmployeesRepo.class);
//            Employees empl2 = EmployeesMapper.findById(2);



            List<Employees> allEmployees = EmployeesMapper.findAll();
//            allEmployees.forEach(LOGGER::info);


            //JACKSON
            //writing JSON Objects ( ALL EMPLOYEES )  to result.json file in Resources JACKSON
           EmployeesJackson.marshal(allEmployees, "./src/main/resources/jackson/allEmployees.json");



            //JAXB
            //writinh XML Objects
            EmployeesJAXB.marshal(allEmployees,"./src/main/resources/jaxb/allEmployees.xml");

//            //Customers
//
//
//            ICustomersRepo CustomersMapper = session.getMapper(ICustomersRepo.class);
//
//            List<Customers> allCustomers = CustomersMapper.findAll();
//            method below creates customer
//            CustomersMapper.createCustomer(customer1);
//             session.commit();
//             session.close();

            //method below updates existing customer
//            CustomersMapper.updateCustomer(customer1);
//            session.commit();
//            session.close();

            //method below deletes existing customer
//            CustomersMapper.deleteById(6);
//            session.commit();
//            session.close();
//
//
//
//
//            allCustomers.forEach(LOGGER::info);

            //method below adds new object to database




            //Employees




//            IEmployeesRepo EmployeesMapper = session.getMapper(IEmployeesRepo.class);
//
//            List<Employees> allEmployees = EmployeesMapper.findAll();
//            allEmployees.forEach(LOGGER::info);
//
            //method below adds new object to database
//            EmployeesMapper.createEmployee(employee);
//            session.commit();
//            session.close();


            //method below modified the employee record in the database
//            EmployeesMapper.updateEmployees(employee);
//            session.commit();
//            session.close();

            //method below deleted the employee from the data base by ID
//            EmployeesMapper.deleteById(12);
//            session.commit();
//            session.close();
//
//
//
//            allEmployees.forEach(LOGGER::info);




            // Customer account types


            ICustomer_account_typeRepo Customer_account_typeMapper = session.getMapper(ICustomer_account_typeRepo.class);


            Customer_account_type accType = Customer_account_typeMapper.findById(2);
            LOGGER.info(accType);

//
//            List<Customer_account_type> allAccTypes = Customer_account_typeMapper.findAll();
//            allAccTypes.forEach(LOGGER::info);


            // Customers
//
//            ICustomersRepo CustomersMapper = session.getMapper(ICustomersRepo.class);
//////
//            Сustomers customer = CustomersMapper.findById(3);
//            LOGGER.info(customer);
//
//            List<Customers> allCustomers = CustomersMapper.findAll();
//            allCustomers.forEach(LOGGER::info);


//            DeliveryProviders
//            IDeliveryProviderRepo DeliveryProvMapper = session.getMapper(IDeliveryProviderRepo.class);
//
//            Сustomers customer = CustomersMapper.findById(3);
//            LOGGER.info(customer);
//
//            List<DeliveryProvider> allDeliveryProviders = DeliveryProvMapper.findAll();
//            allDeliveryProviders.forEach(LOGGER::info);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

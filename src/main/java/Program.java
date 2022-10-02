import connection.ConnectionPool;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.dao.ICustomer_account_typeRepo;
import persistence.dao.ICustomersRepo;
import persistence.dao.IDeliveryProviderRepo;
import persistence.models.Customer_account_type;

import persistence.models.DeliveryProvider;
import persistence.models.Сustomers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class Program {

    private static final Logger LOGGER = LogManager.getLogger(Program.class);
    public static void main(String[] args) throws IOException {



        Reader reader = Resources.getResourceAsReader("mybatis/mybatis-configuration.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        try(SqlSession session = factory.openSession()){
            // Customer account types


            ICustomer_account_typeRepo Customer_account_typeMapper = session.getMapper(ICustomer_account_typeRepo.class);


//            Customer_account_type accType = Customer_account_typeMapper.findById(2);
//            LOGGER.info(accType);


            List<Customer_account_type> allAccTypes = Customer_account_typeMapper.findAll();
            allAccTypes.forEach(LOGGER::info);


            // Customers

//            ICustomersRepo CustomersMapper = session.getMapper(ICustomersRepo.class);
//
////            Сustomers customer = CustomersMapper.findById(3);
////            LOGGER.info(customer);
//
//            List<Сustomers> allCustomers = CustomersMapper.findAll();
//            allCustomers.forEach(LOGGER::info);


            //DeliveryProviders
//            IDeliveryProviderRepo DeliveryProvMapper = session.getMapper(IDeliveryProviderRepo.class);
//
////            Сustomers customer = CustomersMapper.findById(3);
////            LOGGER.info(customer);
//
//            List<DeliveryProvider> allDeliveryProviders = DeliveryProvMapper.findAll();
//            allDeliveryProviders.forEach(LOGGER::info);








        }


    }
}

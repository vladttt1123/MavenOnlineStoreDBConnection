package persistence.dao.jdbc;

import connection.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.dao.IEmployeesRepo;
import persistence.models.Employees;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesJDBCQueries implements IEmployeesRepo {
    private static final Logger LOGGER = LogManager.getLogger(EmployeesJDBCQueries.class);
    private ConnectionPool connectionPool = ConnectionPool.create("jdbc:mysql://127.0.0.1:3306/sakila",
                                                               "root",
                                                                "123qwe!@#QWE");

    public EmployeesJDBCQueries() throws SQLException {
    }


    @Override
    public Employees findById(int idemployee) throws SQLException {
        Connection connection = ConnectionPool.getInstance().getConnection();
        try (PreparedStatement ps = connection.prepareStatement("select * from sakila.employees+ " +
                "Where id = ?")) {
            ps.setInt(1,idemployee);
            ResultSet rs = ps.executeQuery();
            Employees employee = new Employees();
            while (rs.next()) {
                employee.setIdemployee(rs.getInt("idemployee"));
                employee.setFirstName(rs.getString("firstName"));
                employee.setLastName(rs.getString("lastName"));
                employee.setStoreId(rs.getInt("storeId"));
                employee.setSalaries_idsalary(rs.getInt("salaries_idsalary"));



            }
            rs.close();
            return employee;
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
        return null;

    }

    @Override
    public List<Employees> findAll() throws SQLException {
        List<Employees> employees = new ArrayList<Employees>();
        Connection connection = ConnectionPool.getInstance().getConnection();
        try (PreparedStatement ps = connection.prepareStatement
                ("select * from sakila.employees ")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employees employee1 = new Employees();
                employee1.setIdemployee(rs.getInt("idemployee"));
                employee1.setFirstName(rs.getString("firstName"));
                employee1.setLastName(rs.getString("lastName"));
                employee1.setStoreId(rs.getInt("storeId"));
                employee1.setSalaries_idsalary(rs.getInt("salaries_idsalary"));

                employees.add(employee1);
            }
            rs.close();
            return employees;
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
        return employees;

    }

    @Override
    public void createEmployee(Employees employee) throws SQLException {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "INSERT INTO sakila.employees(firstName, lastName, storeId, surname, salaries_idsalary) " +
                "Values (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,employee.getFirstName());
            ps.setString(2,employee.getLastName());
            ps.setInt(3,employee.getStoreId());
            ps.setInt(4,employee.getSalaries_idsalary());

            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }

    }

    @Override
    public void updateEmployees(Employees employees) throws SQLException {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "update sakila.employees set lastName = ?, storeId = ? Where idemployee = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,employees.getLastName());
            ps.setInt(2,employees.getStoreId());
            ps.setInt(3,employees.getIdemployee());
            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }


    }

    @Override
    public void deleteById(Integer id) throws SQLException {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "delete from sakila.employees where idemployee = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,id);
            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }

    }
}

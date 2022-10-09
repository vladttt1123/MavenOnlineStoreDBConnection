package connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectionPool implements IConnectionPool {

    private String url;
    private String user;
    private String password;
    private List<Connection> connectionPool;
    private List<Connection> usedConnections = new ArrayList<>();
    private final static int INITIAL_POOL_SIZE = 1;
    private final static int MAX_POOL_SIZE = 10;
    private final static int MAX_TIMEOUT = 5;
    private static ConnectionPool instance;

    public static ConnectionPool create(String url, String user, String password) throws SQLException {
        List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            pool.add(createConnection(url, user, password));
        }
        return new ConnectionPool(url, user, password, pool);
    }

    public ConnectionPool(){}
    public ConnectionPool(String url, String user, String password, List<Connection> pool) {}


    @Override
    public Connection getConnection() throws SQLException {
        if (connectionPool.isEmpty()) {
            if (usedConnections.size() < MAX_POOL_SIZE) {
                connectionPool.add(createConnection(url, user, password));
            } else {
                throw new RuntimeException(
                        "Maximum pool size reached, no available connections!");
            }
        }

        Connection connection = connectionPool
                .remove(connectionPool.size() - 1);

        if(!connection.isValid(MAX_TIMEOUT)){
            connection = createConnection(url, user, password);
        }

        usedConnections.add(connection);
        return connection;
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance==null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    @Override
    public boolean releaseConnection(Connection connection) {
        connectionPool.add(connection);
        return usedConnections.remove(connection);
    }
    private static Connection createConnection(
            String url, String user, String password)
            throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    public int getSize() {
        return connectionPool.size() + usedConnections.size();
    }
    @Override
    public String getUrl() {
        return url;
    }
    @Override
    public String getUser() {
        return user;
    }
    @Override
    public String getPassword() {
        return password;
    }
    public List<Connection> getConnectionPool() {
        return connectionPool;
    }
    public List<Connection> getUsedConnections() {
        return usedConnections;
    }
    public static int getInitialPoolSize() {
        return INITIAL_POOL_SIZE;
    }
    public void shutdown() throws SQLException {
        usedConnections.forEach(this::releaseConnection);
        for (Connection c : connectionPool) {
            c.close();
        }
        connectionPool.clear();
    }
}


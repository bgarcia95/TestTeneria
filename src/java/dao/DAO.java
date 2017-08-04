package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    private Connection conn;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void Conectar() throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl12c", "C##teneriatest", "oracle");

        } catch (Exception e) {
            throw e;
        }

    }

    public void Cerrar() throws Exception {
        try {
            if (conn != null) {
                if (conn.isClosed() == false ) {
                    conn.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}

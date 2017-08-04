package PA;

import java.sql.CallableStatement;
import java.sql.Connection;

public class insertarPersona {

    Connection conn;
    public void insertarPersona() {

        try {
            CallableStatement cs = conn.prepareCall("{call insertar_persona(?,?,?,?,?,?,?,?)}");
            
        } catch (Exception ex) {

        }
    }

}

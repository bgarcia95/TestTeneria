package dao;

import java.sql.CallableStatement;
import java.sql.Date;
import model.Persona;

public class PersonaDao extends DAO {

    public void registrarPersona(Persona per) throws Exception {
        try {
            this.Conectar();
            CallableStatement cs = this.getConn().prepareCall("{call insertar_persona (?,?,?,?,?,?,?,?)}");
            cs.setString(1, per.getNombres());
            cs.setString(2, per.getApellidos());
            cs.setDate(3, (Date) per.getFecha_nac());
            cs.setString(4, per.getSexo());
            cs.setString(5, per.getDui());
            cs.setString(6, per.getNit());
            cs.setString(7, per.getTelefono());
            cs.setString(8, per.getDireccion());
            cs.executeQuery();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
}

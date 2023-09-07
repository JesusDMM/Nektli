package nektli;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class bd {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    static LocalDate now = LocalDate.now();
    static String date = now.format(formatter);
    static Connection con;
    static PreparedStatement ps;
    static Statement st;
    static ResultSet rs;
    static boolean bandera = false;
    
    public bd() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nektli", "root", "JESUSdaniel444");
            st = con.createStatement();
            ps = con.prepareStatement("INSERT INTO usuario VALUES (?,?)");
            rs = st.executeQuery("select * from Usuarios");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    /*public static int Id_Usuario(String Nombre, String Contraseña) {
        int cont = 0;
        int id = 0;
        try {
            rs = st.executeQuery("select * from Usuarios");
            while (rs.next()) {
                if (Nombre.equals(rs.getString("Correo")) && Contraseña.equals(rs.getString("Contraseña"))) {
                    id = rs.getInt("id");
                    return id;
                }
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return 0;
    }*/
    
    public static int Buscar_Usuario (String Correo, String Contraseña) {
        try {
            rs = st.executeQuery("select id from Usuarios where Correo = '"+Correo+"' and Contraseña = '"+ Contraseña+"'");
            while (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return 0;
    }
    
    public static boolean Ingresar_Usuario (String Nombre, String Ocupaccion, String Correo, String Contraseña){
        try {
            ps = con.prepareStatement("INSERT INTO Cuentas VALUES (?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, Nombre);
            ps.setString(3, Ocupaccion);
            ps.setString(4, Correo);
            ps.setString(5, Contraseña);
            ps.executeUpdate();
            ps = con.prepareStatement("INSERT INTO Usuarios VALUES (?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, Correo);
            ps.setString(3, Contraseña);
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }
    
    public static boolean Insertar_Colmena (String nombre, int n_alzas, int n_bastidores, String tipo, String suelo, String proteccion, String estado, String fecha
    ,double longitud,double latitud, String ciudad,String descripcion, int id_usuario) {
        try {
            ps = con.prepareStatement("INSERT INTO Colmenas VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, nombre);
            ps.setInt(3, n_alzas);
            ps.setInt(4, n_bastidores);
            ps.setString(5, tipo);
            ps.setString(6, suelo);
            ps.setString(7, proteccion);
            ps.setString(8, estado);
            ps.setString(9, fecha);
            ps.setDouble(10, longitud);
            ps.setDouble(11, latitud);
            ps.setString(12, ciudad);
            ps.setString(13, descripcion);
            ps.setInt(14, id_usuario);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }
}

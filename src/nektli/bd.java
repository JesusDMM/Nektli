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
    
    public static void main (String []args) {
        bd bd = new bd ();
        int id = bd.Id_Usuario("roblesdannya@gmail.com", "JESUS");
        System.out.println(id);
    }
    
    public static int Id_Usuario(String Nombre, String Contraseña) {
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
        System.out.println("chin");
        return 0;
    }

}

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

    public static int Buscar_Usuario(String Correo, String Contraseña) {
        try {
            rs = st.executeQuery("select id from Usuarios where Correo = '" + Correo + "' and Contraseña = '" + Contraseña + "'");
            while (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return 0;
    }

    public static int Buscar_Colmena(String Nombre, int id) {
        try {
            rs = st.executeQuery("select id from Colmenas where Nombre = '" + Nombre + "' and Id_usuario = " + id);
            while (rs.next()) {
                return rs.getInt("Id");
            }
        } catch (Exception e) {

        }
        return 0;
    }

    public static boolean Ingresar_Usuario(String Nombre, String Ocupaccion, String Correo, String Contraseña) {
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

    public static boolean Insertar_Colmena(String nombre, int n_alzas, int n_bastidores, String tipo, String suelo, String proteccion, String estado, String fecha,
            double longitud, double latitud, String ciudad, String descripcion, int id_usuario) {
        try {
            int id_colmena = 0;
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
            //insert into Tareas values (0,1,1,'A1','Producción')
            rs = st.executeQuery("select id from Colmenas where Nombre = '" + nombre + "' and Id_usuario = " + id_usuario);
            while (rs.next()) {
                id_colmena = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Tareas VALUES (?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setInt(2, id_usuario);
            ps.setInt(3, id_colmena);
            ps.setString(4, nombre);
            ps.setString(5, tipo);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public static int Ingresar_Tratamiento(int id_Usuario, int id_Colmena, String fecha_inicial, String fecha_final,
            String enfermedad, String producto, double dosis, int repeticiones, String persona) {
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Tratamientos VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1, id_Tarea);
            ps.setString(2, fecha_inicial);
            ps.setString(3, fecha_final);
            ps.setString(4, enfermedad);
            ps.setString(5, producto);
            ps.setDouble(6, dosis);
            ps.setInt(7, repeticiones);
            ps.setString(8, persona);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int Insertar_Cosecha(int id_Usuario, int id_Colmena, String fecha, String producto, double cantidad, String descripcion) {
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Cosechas VALUES (?,?,?,?,?)");
            ps.setInt(1, id_Tarea);
            ps.setString(2, fecha);
            ps.setString(3, producto);
            ps.setDouble(4, cantidad);
            ps.setString(5, descripcion);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int Insertar_alimentacion(int id_Usuario, int id_Colmena, String fecha, String alimento, String tipo, double cantidad, int cantidad_dias,
             String descripcion) {
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Alimentaciones VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, id_Tarea);
            ps.setString(2, fecha);
            ps.setString(3, tipo);
            ps.setString(4, alimento);
            ps.setDouble(5, cantidad);
            ps.setDouble(6, cantidad_dias);
            ps.setString(7, descripcion);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static DefaultTableModel Tabla_Tareas(DefaultTableModel modelo, int id_usuario, int id_Colmena) {
        String arreglo[] = new String[4];
        try {
            st = con.createStatement();
            rs = st.executeQuery("select tar.Nombre_colmena, count(t.id_tarea) as N_Tratamientos, count(c.id_tarea) as N_Cosechas, count(a.id_tarea) as N_Alimentacion\n"
                    + "from tareas as tar inner join Tratamientos as t on tar.ID = t.id_tarea\n"
                    + "inner join Cosechas as c on tar.ID = c.id_tarea\n"
                    + "inner join Alimentaciones as a on tar.ID = a.id_tarea\n"
                    + "where tar.id_Usuario = "+id_usuario+" and tar.id_Colmena = "+ id_Colmena + " "
                    + "group by tar.Nombre_colmena");
            while (rs.next()) {
                arreglo[0] = rs.getString(1);
                arreglo[1] = rs.getInt(2)+"";
                arreglo[2] = rs.getInt(3)+"";
                arreglo[3] = rs.getInt(4)+"";
                modelo.addRow(arreglo);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
        return modelo;
    }
}
package nektli;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Calendar;
import java.util.Date;

public class api {
    private String Nombre_Ciudad;

    public api () {
        Nombre_Ciudad = "";
    }
    
    public Double[] Obtener_Coordenas (String Nombre_Ciudad){
        String api_Ciudad = "http://api.openweathermap.org/geo/1.0/direct?q="+Nombre_Ciudad+"&limit=1&appid=1a6a4b01018ba8ffe2386c5df48c0433";
        Double Latitud = 0.0;
        Double Longitud = 0.0;
        try {
            URL url = new URL(api_Ciudad);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                JSONArray Contenedor_Info = new JSONArray(response.toString());
                for (int i = 0; i < Contenedor_Info.length(); i++) {
                    JSONObject Info_Total = Contenedor_Info.getJSONObject(i);
                    Longitud = Info_Total.getDouble("lon");
                    Latitud = Info_Total.getDouble("lat");
                }
            } else {
                System.out.println("Error al realizar la solicitud. Código de respuesta: " + responseCode);
            }
            conn.disconnect();
        }catch(Exception Error){
            System.out.println(Error);
        }
        Double Coordenas[] = new Double [2]; 
        Coordenas[0] = Latitud;
        Coordenas[1] = Longitud;
        return Coordenas;
    }

    public void Info_Clima (Double Latitud, Double Longitud){
        String api_Clima = "http://api.openweathermap.org/data/2.5/forecast?lat="+Latitud+"&lon="+Longitud+"&appid=1a6a4b01018ba8ffe2386c5df48c0433&lang=es&units=metric&cnt=40";
        try {
            URL url = new URL(api_Clima);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                JSONObject Contenedor_Info = new JSONObject(response.toString());
                JSONArray lista = Contenedor_Info.getJSONArray("list");
                for (int i = 0; i < lista.length(); i++) {
                    JSONObject pronostico = lista.getJSONObject(i);
                    JSONObject Principal = pronostico.getJSONObject("main");
                    Double Temperatura_maxima = Principal.getDouble("temp_max");
                    System.out.println(Temperatura_maxima);
                }
            } else {
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        api a = new api();
        Double Coordenas[] = a.Obtener_Coordenas ("El Mante");
        a.Info_Clima (Coordenas[0], Coordenas[1]);
    }    
}

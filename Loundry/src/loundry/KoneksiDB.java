package loundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 /*
 * @author Apriandi
 */
public class KoneksiDB {
     //Membuat variabel bertype connection
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        //method ini berfungsi untuk membuat koneksi ke MySQL
        if (koneksi == null) {
            try{
                String url = "jdbc:mysql://localhost:3306/luandry";
                String username = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url, username, password);
            }
            catch(SQLException e){
                System.out.println("Gagal memuat koneksi " +e);
            }
        }
        return koneksi;
    }
}
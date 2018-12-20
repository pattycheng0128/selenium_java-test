package Database_connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class databaseConnect {
	private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/life_ticket?zeroDateTimeBehavior=convertToNull&characterEncoding=utf8";
    private static final String user = "root";
    private static final String password = "1234";
	
    public static Connection getConnection() throws VGBException {
        //�n��import java.sql.*;
        try {
            //1.���JJDBC driver,�ھڤu�㴣�ܥ[�Jtry....catch
            Class.forName(driver);
            try {
                //2.�إ߳s�u��^�ǳo��connection����,�ھڤu�㴣�ܥ[�Jtry....catch
                Connection connection = DriverManager.getConnection(url, user, password);
                return connection;
            } catch (SQLException ex) {
                //Logger.getLogger(RDBConnection.class.getName()).log(Level.SEVERE, null, ex);
                throw new VGBException("�L�k�إ߳s�u", ex);
            }

        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(RDBConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw new VGBException("�L�k���JJDBC Driver" + driver, ex);
        }
    }
    
    public static void main(String[] args) {
        //�����O�o�n����
        try (Connection conn = databaseConnect.getConnection();) {
            System.out.println(conn.getCatalog());//life_ticket   
        } catch (VGBException ex) {
            Logger.getLogger(databaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("�o�ͫD�w�������~");
        }
    }
    
}

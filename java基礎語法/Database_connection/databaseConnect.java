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
        //要先import java.sql.*;
        try {
            //1.載入JDBC driver,根據工具提示加入try....catch
            Class.forName(driver);
            try {
                //2.建立連線後回傳這個connection物件,根據工具提示加入try....catch
                Connection connection = DriverManager.getConnection(url, user, password);
                return connection;
            } catch (SQLException ex) {
                //Logger.getLogger(RDBConnection.class.getName()).log(Level.SEVERE, null, ex);
                throw new VGBException("無法建立連線", ex);
            }

        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(RDBConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw new VGBException("無法載入JDBC Driver" + driver, ex);
        }
    }
    
    public static void main(String[] args) {
        //測完記得要關掉
        try (Connection conn = databaseConnect.getConnection();) {
            System.out.println(conn.getCatalog());//life_ticket   
        } catch (VGBException ex) {
            Logger.getLogger(databaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("發生非預期的錯誤");
        }
    }
    
}

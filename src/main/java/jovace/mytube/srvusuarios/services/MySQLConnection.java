package jovace.mytube.srvusuarios.services;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import java.sql.Connection;

public class MySQLConnection {
	final String driver = "com.mysql.jdbc.Driver";
	final String host = "piedrafita.ls.fi.upm.es";
	final int port = 8000;
	final String db = "srvusuarios";
	final String user = "root";
	final String pass = "prof2018upm";
	
	private Connection con;
	private boolean connected=false;
	
	public MySQLConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://" + host + ":" + port + "/" + db + "?useSSL=false&allowMultiQueries=true&serverTimezone=" + TimeZone.getDefault().getID();
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        this.con=conn;
        this.connected=true;
	}
	
	public Connection getConnection() {
		if(this.connected){
			return this.con;
		}else{return null;}
	}
}

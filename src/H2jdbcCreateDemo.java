import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class H2jdbcCreateDemo {
   //JDBC driver name と URL
   static final String JDBC_DRIVER = "org.h2.Driver";
   static final String DB_URL = "jdbc:h2:~/test";

  // Database User/Password
   static final String USER = "sa";
   static final String PASS = "";

   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try {
        // Register JDBC driver
         Class.forName(JDBC_DRIVER);

        // Open a connection
         System.out.println("Connecting to database...");
         conn = DriverManager.getConnection(DB_URL,USER,PASS);

        // Execute a query
         System.out.println("Creating table in given database...");
         stmt = conn.createStatement();
         String sql =  "CREATE TABLE IF NOT EXISTS SAMPLE_TABLE " +
            "(id INTEGER not NULL, " +
            " name VARCHAR(255), " +
            " memo VARCHAR(255), " +
            " age INTEGER, " +
            " PRIMARY KEY ( id ))";
         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");

        // Clean-up environment
         stmt.close();
         conn.close();
      } catch(SQLException se) {
         se.printStackTrace();
      } catch(Exception e) {
         e.printStackTrace();
      } finally {
         try{
            if(stmt!=null) stmt.close();
         } catch(SQLException se2) {
            // do nothing 
         }
         try {
            if(conn!=null) conn.close();
         } catch(SQLException se){
            se.printStackTrace();
         }
      }
      System.out.println("Goodbye!");
   }
}
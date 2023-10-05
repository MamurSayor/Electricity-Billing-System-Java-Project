package electricity.billing.system;

import java.sql.*;

public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill_system","root","");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



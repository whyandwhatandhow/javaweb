package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public Connection Link = null;

    public Connection ConnectionLink() {
        try {
            Class.forName("utils.ConnectionTest");
            Link = DriverManager.getConnection("jdbc:mysql://localhost:3306/software", "root", "42391523");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Link;
    }
}

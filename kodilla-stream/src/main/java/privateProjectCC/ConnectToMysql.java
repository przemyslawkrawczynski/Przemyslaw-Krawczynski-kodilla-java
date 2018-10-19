package privateProjectCC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToMysql {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        //
        String DBURL = "jdbc:mariadb://sql.pkrawczynski.nazwa.pl:3306/pkrawczynski_javatest";
        String DBUSER = "pkrawczynski_javatest";
        String DBPASS = "12#$qwER";
        String DBDRIVER = "org.mariadb.jdbc.Driver";

        try {
            Class.forName(DBDRIVER);
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM test";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                System.out.println(rs.getString(1) + " ");

            }
            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException exc) {  // brak klasy sterownika
            System.out.println("Brak klasy sterownika");
            System.out.println(exc);
            System.exit(1);
        } catch (SQLException exc) {  // nieudane połączenie
            System.out.println("Nieudane połączenie z " + DBURL);
            System.out.println(exc);
            System.exit(1);
        }
    }
}






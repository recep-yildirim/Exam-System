/**
 * @author Recep YILDIRIM
 */

package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private String databaseName = null;
    private String path = null;

    private Connection connection = null;
    public Statement statement = null;

    public Database(String databaseName, String path) {
        this.databaseName = databaseName;
        this.path = path;

        this.createConnection();
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public String getPath() {
        return this.path;
    }

    private void createConnection() {
        String url = "jdbc:sqlite:" + this.path + "/" + this.databaseName + ".db";

        try {
            Class.forName("org.sqlite.JDBC");

            this.connection = DriverManager.getConnection(url);
            this.statement = this.connection.createStatement();

            this.createTable();
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found.!");
        } catch (SQLException ex) {
            System.out.println("Could not connected to database.!");
        }
    }

    private void createTable() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS questions (" +
                    "QuestionID int PRIMARY KEY," +
                    "Description varchar(250) NOT NULL," +
                    "OptionA varchar(50) NOT NULL," +
                    "OptionB varchar(50) NOT NULL," +
                    "OptionC varchar(50) NOT NULL," +
                    "OptionD varchar(50) NOT NULL," +
                    "OptionE varchar(50) NOT NULL," +
                    "TrueAnswer varchar(1) NOT NULL)";

            this.statement.execute(sql);
            System.out.println("Table was created.");
        } catch (SQLException ex) {
            System.out.println("Table could not created.!");
        }
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            System.out.println("Could not close the database.!");
        } catch (NullPointerException ex) {
            System.out.println("There is no connected database.!");
        }
    }
}
package mySQLdb;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei on 7/10/2017.
 */
public class SQL {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static PreparedStatement preparedStatement;

//    private List<Integer> IDs  =  new ArrayList<Integer>();
//    private List<Integer> ages = new ArrayList<Integer>();
//    private List<String> names = new ArrayList<String>();


    @BeforeClass
    public static void dbSetUp() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://88.198.169.215:3306/wordpress_wantsome", "wantsomeUser", "apxO9$53");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertARecordTest () {
        try {
            String insert = "INSERT INTO AndreiWork(name,age)" +
                            "VALUES(?,?)";

            preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, "Andrei1");
            preparedStatement.setInt(2, 30);
            statement = connection.createStatement();
            preparedStatement.executeUpdate();

            resultSet = statement.executeQuery("select * from AndreiWork");
            while (resultSet.next()) {
                Assert.assertTrue("age is 30",true);
                System.out.println(resultSet);
            }

            statement.close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void deleteFromAndreiHomeDuplicates(){
        try{
            String delete = "ALTER IGNORE TABLE AndreiWork" + "ADD UNIQUE INDEX index_name(id,name,age)";
            preparedStatement = connection.prepareStatement(delete);
            statement = connection.createStatement();
            preparedStatement.executeUpdate();

            while (resultSet.next()){

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
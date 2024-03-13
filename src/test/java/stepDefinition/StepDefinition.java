package stepDefinition;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.JDBCReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class StepDefinition {

    ResultSet resultSet;

/*
    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {

        JDBCReusableMethods.getConnection();
    }

    @Given("Query01 hazirlanir ve execute edilir.")
    public void query01_hazirlanir_ve_execute_edilir() throws SQLException {

        String query01 = "SELECT user_id FROM u168183796_qaloantec.deposits WHERE amount BETWEEN 100 AND 500";
        resultSet= JDBCReusableMethods.getStatement().executeQuery(query01);

    }

    @Given("ResultSet01 sonuclari islenir.")
    public void result_set01_sonuclari_islenir() throws SQLException {

        resultSet.next();
        int actualResult = resultSet.getInt("user_id");
        int expectedResult = 1;

        assertEquals(expectedResult,actualResult);

    }

    @Given("Database baglantisi kapatilir.")
    public void database_baglantisi_kapatilir() {

        JDBCReusableMethods.closeConnection();

    }

*/

    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {
        JDBCReusableMethods.getConnection();
    }

    @Given("Query01 hazirlanir ve execute edilir.")
    public void query01_hazirlanir_ve_execute_edilir() throws SQLException {
        String query01 = "SELECT user_id FROM u168183796_qaloantec.deposits WHERE amount BETWEEN 100 AND 500";
        resultSet = JDBCReusableMethods.getStatement().executeQuery(query01);
    }

    @Given("ResultSet01 sonuclari islenir.")
    public void result_set01_sonuclari_islenir() throws SQLException {
        resultSet.next();
        int actualResult = resultSet.getInt("user_id");
        System.out.println(actualResult);
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }

    @Given("Database baglantisi kapatilir.")
    public void database_baglantisi_kapatilir() {
        JDBCReusableMethods.closeConnection();
    }




}

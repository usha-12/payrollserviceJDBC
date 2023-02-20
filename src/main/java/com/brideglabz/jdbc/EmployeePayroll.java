package com.brideglabz.jdbc;

import java.sql.*;

public class EmployeePayroll {
    public static void preparedStatement(String name, double salary) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root",
                    "Usha@123");
            String s = "update employee_payroll set salary = ? where name=?";
            PreparedStatement ps = conn.prepareStatement(s);
            ps.setDouble(1, salary);
            ps.setString(2, name);
            ps.executeUpdate();
            boolean result = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws SQLException {
        preparedStatement(" LESA",  300000.000);

    }
}

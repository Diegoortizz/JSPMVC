/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jspmvc_exo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Diego
 */
public class DAO {

private final DataSource myDataSource;

    /**
     *
     * @param dataSource la source de données à utiliser
     */
    public DAO(DataSource dataSource) {
        this.myDataSource = dataSource;
    }
    
    
    List<RemiseEntity> AllRemise() throws SQLException {
    List<RemiseEntity> result = new ArrayList<RemiseEntity>();

        String sql = "SELECT * FROM DISCOUNT_CODE" ;
        try (Connection connection = myDataSource.getConnection();
                Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                result.add(new RemiseEntity(rs.getString("DISCOUNT_CODE"), rs.getFloat("RATE")));
            }
        }
    
    return result;
}
    
    
    
    
}












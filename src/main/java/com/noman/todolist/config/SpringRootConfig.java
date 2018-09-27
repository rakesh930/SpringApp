
package com.noman.todolist.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.noman.todolist.dao","com.noman.todolist.service"})
public class SpringRootConfig {
    //TODO: Services, DAO, DataSource, Email Sender or some other business layer beans 
    
    
    // The following bean provide a connection with the database.
    // When we used JDBC we hard coded for connections everytime we need the connection
    // Now we write once for the connection, and SpringRootConfig provides the connection for evrytime we nee this. 
    @Bean
    public BasicDataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/todo_db");
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setMaxTotal(2);
        ds.setInitialSize(1);
        ds.setTestOnBorrow(true);
        ds.setValidationQuery("SELECT 1");
        ds.setDefaultAutoCommit(true);
        return ds;
    }
    
    
}

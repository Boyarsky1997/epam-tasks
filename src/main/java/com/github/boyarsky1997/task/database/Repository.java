package com.github.boyarsky1997.task.database;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Repository {
    private Connection connection;

    public Repository(String URl, String user, String password) throws IOException {
        try {
            this.connection = DriverManager.getConnection(URl + "?useUnicode=true&serverTimezone=UTC",
                    user,
                    password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Repository() throws IOException {
        Properties properties = new Properties();
        properties.load(Repository.class.getResourceAsStream("/database.properties"));
        try {
            this.connection = DriverManager.getConnection(
                    String.format("jdbc:mysql://%s:%s/%s?useUnicode=true&serverTimezone=UTC",
                            properties.getProperty("db.host"),
                            properties.getProperty("db.port"),
                            properties.getProperty("db.name")),
                    properties.getProperty("db.user"),
                    properties.getProperty("db.password"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void add(String name, String owner, char sex) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Resources.load("/sql/add.sql"));
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, owner);
            preparedStatement.setString(3, String.valueOf(sex));
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

package com.gmail.maryanto.dimas.resto.restoapi;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestoApiApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(RestoApiApplication.class, args);
    }
}

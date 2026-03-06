package company.service;

import company.config.DatabaseProperties;

public class DatabaseConnectService {
    private final DatabaseProperties databaseProperties;

    public DatabaseConnectService(DatabaseProperties databaseProperties) {
        this.databaseProperties = databaseProperties;
    }

    public void connectDatabase() {
        System.out.println("Connecting to database with the following properties:");
        System.out.println("URL: " + databaseProperties.getUrl());
        System.out.println("Username: " + databaseProperties.getUsername());
        System.out.println("Password: " + databaseProperties.getPassword());
    }
}

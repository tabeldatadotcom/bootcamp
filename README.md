# Bootcamp 2017 #3 - Java Database Connectivity

## JDBC

JDBC atau Java Database Connectivity adalah teknologi API untuk Java yang digunakan untuk menkomunikasikan dan memberikan fitur akses data ke database dari Java.

## Object JDBC

### Connection Properties

- `java.sql.Connection`
- `java.sql.DriverManager`
- `java.sql.DataSource`

### Processing query

- `java.sql.Statement`
- `java.sql.PreparedStatement`

### Executing query

- `executeQuery(sqlParam)`
- `executeUpdate()`

### Transaction Management

- `connection.commit()`
- `connection.rollback()`
- `connection.rollback(savePoint)`
- `connection.setAutoCommit(true/false);`

### Batch Prosessing

- `addBatch(preparedStatementParam);`
- `executeBatch()`;

### Handling Error

- `java.sql.SQLException`
- `Exception`

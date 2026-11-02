# Java repository modernization

* WawFuel: Jakarta Servlet 6, JSP/JSTL 3, MySQL Connector/J 9.5, Java 21.
* bootsample: Spring Boot 3.5.16, Jakarta Persistence, Spring Data modern repository API, Java 21.
* External configuration: DB_URL, DB_USERNAME, DB_PASSWORD for both applications. For WawFuel, URL should be a full JDBC URL including database.
* WawFuel WAR requires a Servlet 6-compatible container such as Tomcat 10.1; bootsample is an executable WAR.
* Existing database schema is **not** migrated. Back up and validate the database before any deployment.
* Existing built binary files remain historical; new CI builds source modules only.
* Note: previous committed database passwords are present in Git history. Rotate credentials if they were real. Rewriting Git history is a separate operation.

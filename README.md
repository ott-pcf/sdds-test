# sdds-test
Simple driver data source test app

Simple implementation of the standard JDBC DataSource interface, configuring a plain old JDBC Driver via bean properties, and returning a new Connection from every getConnection call.
NOTE: This class is not an actual connection pool; it does not actually pool Connections. It just serves as simple replacement for a full-blown connection pool, implementing the same standard interface, but creating new Connections on every call.

This project tests the above. Connection gets opened and closed for every request. This helped in an environment where app performance would not be a matter and no of connections 4 at the max when having 10+ apps. Project is PCF deployable. Database configuration is kept in the env variables and referred in Connection properties for simple driver data source.

﻿# Basic authentication with Spring boot

## Dependencies used
- Spring Web
- Spring dev tools
- Spring security
- Spring Data JPA
- PostgreSQL Driver
- Lombok
- io.jsonwebtoken (jjwt)

## Steps
1. Configure Database and Data source
   ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/[DB_NAME]
    spring.datasource.username=[DB_USERNAME]
    spring.datasource.password=[DB_PASSWORD]
    spring.datasource.driver-class-name=org.postgresql.Driver
    
    spring.jpa.hibernate.ddl-auto=create-drop
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    spring.jpa.database=postgresql
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
   ```

2. Create User entity and repository
3. Implement UserDetails interface into User
4. Implement JwtAuthenticationFilter + JwtService + Create UserDetailsService bean
5. Configure SecurityConfiguration + Create AuthenticationProvider, AuthenticationManager and PasswordEncore beans
6. Implement AuthenticationController + DTOs
7. Implement AuthenticationService 

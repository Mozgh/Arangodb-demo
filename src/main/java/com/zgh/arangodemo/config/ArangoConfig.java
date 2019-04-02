package com.zgh.arangodemo.config;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.config.AbstractArangoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArangoConfig extends AbstractArangoConfiguration {

    @Value("${spring.arangodb.host}")
    private String host;

    @Value("${spring.arangodb.port}")
    private int port;

    @Value("${spring.arangodb.timeout}")
    private int timeout;

    @Value("${spring.arangodb.user}")
    private String user;

    @Value("${spring.arangodb.password}")
    private String password;

    @Value("${spring.arangodb.userSsl}")
    private boolean userSsl;


    @Override
    protected ArangoDB.Builder arango() {
        return new ArangoDB.Builder().host(host, port).timeout(timeout).user(user).password(password).useSsl(userSsl);
    }

    @Override
    protected String database() {
        // Name of the database to be used
        return "testDB";
    }

}

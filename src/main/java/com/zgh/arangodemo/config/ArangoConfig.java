package com.zgh.arangodemo.config;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.AbstractArangoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.query.QueryLookupStrategy;

@Configuration
@EnableArangoRepositories(queryLookupStrategy = QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND,basePackages = "${spring.arangodb.repositoryPackage}", namedQueriesLocation = "${spring.arangodb.namedQueriesLocation}")
@Slf4j
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

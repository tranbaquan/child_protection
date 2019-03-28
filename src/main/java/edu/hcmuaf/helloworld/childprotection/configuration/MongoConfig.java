package edu.hcmuaf.helloworld.childprotection.configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
    @Value("${spring.data.mongodb.uri}")
    private String uri;

    @Bean
    public MongoTemplate template() {
        MongoTemplate template = new MongoTemplate(mongoClient(), getDatabaseName());
        return template;
    }

    @Override
    public MongoClient mongoClient() {
        MongoClient client = new MongoClient(new MongoClientURI(uri));
        return client;
    }

    @Override
    protected String getDatabaseName() {
        return "child_protection";
    }
}

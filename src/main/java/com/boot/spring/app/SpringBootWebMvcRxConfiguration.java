package com.boot.spring.app;

import com.mongodb.async.client.MongoClient;
import com.mongodb.async.client.MongoClients;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by darlan on 25/01/17.
 */
@Configuration
public class SpringBootWebMvcRxConfiguration {

    @Autowired
    private Environment environment;

    public int httpPort() {
        return environment.getProperty("http.port", Integer.class, 8080);
    }

    @Bean
    MongoClient mongoClient() {
        return MongoClients.create("mongodb://127.0.0.1:27017");
    }

    @Bean
    public JettyEmbeddedServletContainerFactory jettyEmbeddedServletContainerFactory() {
        final JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory(httpPort());
        factory.addServerCustomizers((Server server) -> {
            final QueuedThreadPool threadPool = server.getBean(QueuedThreadPool.class);
            threadPool.setMinThreads(4000);
            threadPool.setMaxThreads(4000);
        });
        return factory;
    }

}
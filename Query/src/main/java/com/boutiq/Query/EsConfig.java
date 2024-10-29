package com.boutiq.Query;

//import org.elasticsearch.client.RestClient;

import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.scheduling.annotation.AbstractAsyncConfiguration;



@Configuration
@EnableElasticsearchRepositories
public class EsConfig extends AbstractAsyncConfiguration
{

    @Bean
    public RestClient elasticsearchClient ()
    {
        final ClientConfiguration clientConfiguration =
                ClientConfiguration.builder().connectedTo("localhost:9200").build();

        return RestClients.create(clientConfiguration).rest();
    }
}
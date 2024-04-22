package com.lotericas.config;

import com.lotericas.repository.ResultadosRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
//@EnableMongoRepositories
@EnableMongoRepositories(basePackageClasses = ResultadosRepository.class)
public class MongoConfig {
}

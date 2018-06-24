package com.bcm.config.mongo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "com.bcm.repository")
public class MongoConfiguration extends AbstractMongoConfiguration {

	@Value("${mongodb.database}")
	private String databaseName;

	@Value("${mongodb.host}")
	private String host;

	@Value("${mongodb.port}")
	private String port;

	@Value("${mongodb.username}")
	private String userName;

	@Value("${mongodb.password}")
	private String password;
	
	

	@Override
	protected String getDatabaseName() {
		return databaseName;
	}

	@Override
	public MongoClient mongoClient() {

		/*MessageFormat mf = new MessageFormat(ApplicationConstants.MONGODB_URI);
		String uriString = mf.format(ApplicationConstants.MONGODB_URI, userName,decrypPwd, host, port);
		MongoClientURI mongoUri = new MongoClientURI(uriString);
		return new MongoClient(mongoUri);*/
		/**
		 * for local setup mongodb
		 */
		ServerAddress serverAddress = new ServerAddress(host, Integer.parseInt(port));
		MongoCredential credential = MongoCredential.createCredential(userName, getDatabaseName(),
				password.toCharArray());

		MongoClient client = new MongoClient(serverAddress, Arrays.asList(credential));
		return client;
	}

}


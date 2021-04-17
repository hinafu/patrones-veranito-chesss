/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 *
 * @author larrysbarretot
 */
public class MongoDB {
	private ConnectionString connectionString;
  private CodecRegistry pojoCodecRegistry;
  private CodecRegistry codecRegistry;
  private MongoClientSettings clientSettings;
  private MongoClient mongoClient;
  private static MongoDB db;

  private MongoDB() {
    this.setConnectionString(
        "mongodb+srv://group2-user:p3Hv4wZvojdLfyYp@group2.lpjlw.mongodb.net/courierdb?retryWrites=true&w=majority");
    this.setPOJOCodecRegistry();
    this.setCodecRegistry();
    this.setClientSettings();
    this.setMongoClient();
  }

  public static MongoDB getConnection() {
    if (db == null) {
      db = new MongoDB();
    }
    return db;
  }

  public MongoDatabase getDB() {
    return this.mongoClient.getDatabase("courier");
  }

  public void closeDB() {
    this.mongoClient.close();
  }

  private void setConnectionString(String uri) {
    this.connectionString = new ConnectionString(uri);
  }

  private void setPOJOCodecRegistry() {
    this.pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
  }

  private void setCodecRegistry() {
    this.codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), this.pojoCodecRegistry);
  }

  private void setClientSettings() {
    this.clientSettings = MongoClientSettings.builder().applyConnectionString(this.connectionString)
        .codecRegistry(this.codecRegistry).build();
  }

  private void setMongoClient() {
    this.mongoClient = MongoClients.create(this.clientSettings);
  }
}

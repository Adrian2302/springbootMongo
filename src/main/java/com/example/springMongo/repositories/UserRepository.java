package com.example.springMongo.repositories;

//import com.sample.springMongo.entities.UserEntity;
import com.example.springMongo.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}

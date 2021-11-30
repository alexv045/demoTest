package com.example.demo2.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userInfoRepository extends MongoRepository<userInfo,String> {


}

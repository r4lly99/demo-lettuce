package com.irsyad.demolettuce.service;

import com.irsyad.demolettuce.model.Programmer;

import java.util.List;
import java.util.Set;

public interface RedisService {
    //region String
    void setObjectAsString(String key, String value);

    String getObjectAsString(String key);

    //region List
    void addToList(String key, Programmer programmer);

    List<Programmer> getListMembers(String key);

    Long getListSize(String key);

    //region Set
    void addToSet(String key, Programmer... programmers);

    Set<Programmer> getSetMembers(String key);

    //region Hash
    void saveHash(String key, Programmer programmer);

    Programmer findInHash(String key, int id);

    void deleteHash(String key, int id);
}

package com.irsyad.demolettuce.service;

import com.irsyad.demolettuce.model.Programmer;

import java.util.List;
import java.util.Set;

public interface ProgrammerService {

    void setObjectsAsString(String key, String programmer);

    String getObjectAsString(String key);

    void AddToProgrammersList(Programmer programmer);

    List<Programmer> getProgrammersListMembers();

    Long getProgrammersListCount();

    void AddToProgrammersSet(Programmer... programmers);

    Set<Programmer> getProgrammersSetMembers();

    void saveHash(Programmer programmer);

    Programmer findInHash(int id);

    void deleteHash(int id);
}

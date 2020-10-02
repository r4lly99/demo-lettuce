package com.irsyad.demolettuce.service;

import com.irsyad.demolettuce.model.Programmer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService {

    private static final String LIST_KEY = "LIST_KEY";
    private static final String SET_KEY = "SET_KEY";
    private static final String HASH_KEY = "HASH_KEY";
    private final RedisService redisService;

    @Override
    public void setObjectsAsString(String key, String programmer) {
        redisService.setObjectAsString(key, programmer);
    }

    @Override
    public String getObjectAsString(String key) {
        return redisService.getObjectAsString(key);
    }

    @Override
    public void AddToProgrammersList(Programmer programmer) {
        redisService.addToList(LIST_KEY, programmer);
    }

    @Override
    public List<Programmer> getProgrammersListMembers() {
        return redisService.getListMembers(LIST_KEY);
    }

    @Override
    public Long getProgrammersListCount() {
        return redisService.getListSize(LIST_KEY);
    }

    @Override
    public void AddToProgrammersSet(Programmer... programmers) {
        redisService.addToSet(SET_KEY, programmers);
    }

    @Override
    public Set<Programmer> getProgrammersSetMembers() {
        return redisService.getSetMembers(SET_KEY);
    }

    @Override
    public void saveHash(Programmer programmer) {
        redisService.saveHash(HASH_KEY, programmer);
    }

    @Override
    public Programmer findInHash(int id) {
        return redisService.findInHash(HASH_KEY, id);
    }

    @Override
    public void deleteHash(int id) {
        redisService.deleteHash(HASH_KEY, id);
    }
}
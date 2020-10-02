package com.irsyad.demolettuce.rest;


import com.irsyad.demolettuce.model.Programmer;
import com.irsyad.demolettuce.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programmer")
public class ProgrammerREST {

    @Autowired
    ProgrammerService programmerService;

    @PostMapping("/hash")
    public ResponseEntity addProgrammerInHash(@RequestBody Programmer programmer) {
        programmerService.saveHash(programmer);
        return ResponseEntity.ok(programmer);
    }

    @PostMapping("/list")
    public ResponseEntity addProgrammerInList(@RequestBody Programmer programmer) {
        programmerService.AddToProgrammersList(programmer);
        return ResponseEntity.ok(programmer);
    }

    @GetMapping("/list")
    public List<Programmer> getAllProgrammer(){
        return programmerService.getProgrammersListMembers();
    }

    @GetMapping("/hash/")
    @RequestMapping(path="/{id}")
    public Programmer findInHash(@PathVariable("id") int id){
        return programmerService.findInHash(id);
    }

}

package com.example.delete.Controller;

import com.example.delete.Repository.Helli;
import com.example.delete.Repository.Repo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Repo repo;

    public Controller(Repo repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public ResponseEntity<Helli> greeting(){
        Helli helli = new Helli("hej meerwaldt");
        repo.save(helli);
        return new ResponseEntity<>(helli, HttpStatus.OK);
    }
}

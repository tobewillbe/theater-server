package com.example.theaterServer.movie.api;

import com.example.theaterServer.movie.entity.Movie;
import com.example.theaterServer.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/movies")
@RequiredArgsConstructor
@CrossOrigin
public class MovieApiController {

    private final MovieService service;

    @GetMapping
    public ResponseEntity<?> movies(){
        log.info("api/movies GetRequest!");
        return ResponseEntity.ok().body(service.listAllServ());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> read(@PathVariable String id){
        log.info("api/movies/{} GetRequest!", id);
        return ResponseEntity.ok().body(service.readServ(id));
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Movie newMovie){
        log.info("api/movies PostRequest!-{}", newMovie);

        try{
            boolean dto = service.createServ(newMovie);
            return ResponseEntity.ok().body(dto);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Movie newMovie){
        log.info("api/movies PutRequest!-{}", newMovie);

        try{
            boolean dto = service.updateServ(newMovie);
            return ResponseEntity.ok().body(dto);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove(@PathVariable String id){
        log.info("api/movies/{} DeleteRequest!", id);

        return ResponseEntity.ok().body(service.deleteServ(id));
    }

}
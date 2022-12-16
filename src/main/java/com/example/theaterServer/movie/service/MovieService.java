package com.example.theaterServer.movie.service;

import com.example.theaterServer.movie.dto.MovieDTO;
import com.example.theaterServer.movie.dto.MovieListDTO;
import com.example.theaterServer.movie.entity.Movie;
import com.example.theaterServer.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    public List<MovieListDTO> listAllServ(){
        return repository.listAll();
    }

    public boolean createServ(final Movie newMovie){

        if(newMovie == null){
            log.warn("new Movie cannot be null!");
            throw new RuntimeException("newMovie cannot be null!");
        }

        boolean flag = repository.create(newMovie);
        if(flag) log.info("새로운 영화 id:{}이 저장되었습니다.", newMovie.getMovieCd());
        return flag;
    }

    public MovieDTO readServ(String sid){
        int id = Integer.parseInt(sid);
        return repository.read(id);
    }

    public boolean updateServ(final Movie newMovie){
        return repository.update(newMovie);
    }

    public boolean deleteServ(String sid) {
        int mvId = Integer.parseInt(sid);
        return repository.delete(mvId);
    }
}

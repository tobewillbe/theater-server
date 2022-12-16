package com.example.theaterServer.movie.repository;

import com.example.theaterServer.movie.dto.MovieDTO;
import com.example.theaterServer.movie.dto.MovieListDTO;
import com.example.theaterServer.movie.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieRepository {

    boolean create(Movie movie);
    MovieDTO read(int mvId);
    List<MovieListDTO> listAll();
    boolean update(Movie movie);
    boolean delete(int mvId);
    int search(Movie movie);
}

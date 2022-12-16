package com.example.theaterServer.movie.entity;
import lombok.*;
import java.sql.Date;

@Setter @Getter @ToString
@AllArgsConstructor
public class Movie {

    private String movieCd; // 영화코드
    private String movieName; // 영화이름
    private String movieNameEn; // 영화이름(영어)
    private int movieLength; //영화길이
    private String moviePy; // 영화 제작일
    private Date movieOd; // 영화 개봉일
    private String movieType; // 영화형태
    private String movieNation; //제작국
    private String genre; //장르
    private String directors; //감독
    private String companies; //회사
    private String actors; //주연배우
    private String sType; // 상영형태
    private String movieThumbnail; //영화 썸네일
}

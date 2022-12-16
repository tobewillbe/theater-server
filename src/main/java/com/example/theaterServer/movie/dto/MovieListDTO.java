package com.example.theaterServer.movie.dto;

import lombok.*;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class MovieListDTO {
    private int MV_Id; // 영화코드
    private String MV_Nm; // 영화이름
    private String MV_Thumbnail; //영화 썸네일
}

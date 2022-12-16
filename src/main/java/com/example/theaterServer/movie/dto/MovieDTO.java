package com.example.theaterServer.movie.dto;

import lombok.*;

import java.sql.Date;

@Setter @Getter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {

    private int MV_Id;
    private String MV_Nm;
    private String MV_NmEn;
    private int ShowT;
    private String ProdY;
    private Date OpenD;
    private String MV_Type;
    private String MV_Nation;
    private String MV_Genre;
    private String Directors;
    private String Companies;
    private String Actors;
    private String S_Type;
    private String MV_Thumbnail;

}

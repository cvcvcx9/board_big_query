package com.cvcvcx9.imgboard.board.dto;

import lombok.Data;

@Data
public class RequestBoardListDto {
    private int page;
    private int size;
    private String search;
    private String searchBy;
    private String sort;
    private String order;
}

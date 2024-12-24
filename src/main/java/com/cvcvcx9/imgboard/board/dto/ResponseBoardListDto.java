package com.cvcvcx9.imgboard.board.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseBoardListDto {
    private List<BoardSummaryDto> boardList;
    private int totalPage;
    private int currentPage;
    private boolean hasNext;
    private boolean hasPrev;
}

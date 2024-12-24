package com.cvcvcx9.imgboard.board.service;

import com.cvcvcx9.imgboard.board.dto.BoardSummaryDto;
import com.cvcvcx9.imgboard.board.dto.ResponseBoardListDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {
    public ResponseBoardListDto getBoardList() {
        BoardSummaryDto board = BoardSummaryDto.builder()
                .id(1L)
                .title("title")
                .author("author")
                .summaryContent("summaryContent")
                .createdAt("createdAt")
                .updatedAt("updatedAt")
                .commentCount(0)
                .viewCount(0)
                .build();
        List<BoardSummaryDto> boards = new ArrayList<>();
        boards.add(board);
        ResponseBoardListDto responseBoardListDto = new ResponseBoardListDto();
        responseBoardListDto.setBoardList(boards);
        responseBoardListDto.setCurrentPage(1);
        responseBoardListDto.setTotalPage(1);
        responseBoardListDto.setHasNext(false);
        responseBoardListDto.setHasPrev(false);
        return responseBoardListDto;
    }
}

package com.cvcvcx9.imgboard.board.controller;

import com.cvcvcx9.imgboard.board.dto.ResponseBoardListDto;
import com.cvcvcx9.imgboard.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/")
    public ResponseEntity<ResponseBoardListDto> home() {
        return ResponseEntity.ok(boardService.getBoardList());
    }
}

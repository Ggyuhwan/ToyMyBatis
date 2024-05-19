package org.example.mybatis.board.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis.board.dto.BoardDTO;
import org.example.mybatis.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board")
    public String boardList() {
        return "board/list";
    }

    @GetMapping("/board/save")
    public String boardSave() {

        return "board/add";
    }

    @PostMapping("/board/save")
    public String boardSave(BoardDTO boardDTO) {
        boardService.save(boardDTO);
        System.out.println("boardDTO = " + boardDTO);
        return "board/list";
    }

}

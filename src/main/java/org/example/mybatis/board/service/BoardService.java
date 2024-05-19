package org.example.mybatis.board.service;

import lombok.RequiredArgsConstructor;
import org.example.mybatis.board.dto.BoardDTO;
import org.example.mybatis.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);

    }
}

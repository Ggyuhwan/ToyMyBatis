package org.example.mybatis.board.repository;

import lombok.RequiredArgsConstructor;
import org.example.mybatis.board.dto.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSessionTemplate sql;

    public void save(BoardDTO boardDTO) {
        sql.insert("Board.save", boardDTO);
    }
}

package org.example.mybatis.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {

    private Long id;

    private String boardWriter;

    private String boardTitle;

    private String boardContents;

    private String delYn;

    private int boardHits;

    private String createdAt;

}

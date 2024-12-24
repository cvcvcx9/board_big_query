package com.cvcvcx9.imgboard.board.dto;

import com.fasterxml.jackson.core.JsonToken;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class BoardSummaryDto {
    private Long id;
    private String title;
    private String author;
    private String summaryContent;
    private String createdAt;
    private String updatedAt;
    private int commentCount;
    private int viewCount;

}

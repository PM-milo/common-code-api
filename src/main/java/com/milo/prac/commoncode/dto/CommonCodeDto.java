package com.milo.prac.commoncode.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonCodeDto {

    private String groupCode;
    private String commonCode;
    private String codeName;
    private String useYn;
    private String delYn;
    private Integer sortOrder;
    private String description;

    private LocalDateTime createdAt;
    private String createdBy;

    private LocalDateTime updatedAt;
    private String updatedBy;

}

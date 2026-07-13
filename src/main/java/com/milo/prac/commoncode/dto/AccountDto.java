package com.milo.prac.commoncode.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {

    private String accountNumber;
    private String accountOwner;
    private String accountTypeGroupCode;
    private String accountTypeCode;
    private String accountTypeName;

    private String bankGroupCode;
    private String bankCode;
    private String bankName;
    private String useYn;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

}

package com.milo.prac.commoncode.mapper;

import com.milo.prac.commoncode.dto.AccountDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    List<AccountDto> findAll();

    int insert (AccountDto accountDto);

    int update (AccountDto accountDto);

    int delete (String accountNumber);


}

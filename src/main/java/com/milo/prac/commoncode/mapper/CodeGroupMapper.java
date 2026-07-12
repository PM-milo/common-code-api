package com.milo.prac.commoncode.mapper;

import com.milo.prac.commoncode.dto.CodeGroupDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CodeGroupMapper {

    List<CodeGroupDto> findAll();

}

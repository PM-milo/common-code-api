package com.milo.prac.commoncode.mapper;

import com.milo.prac.commoncode.dto.CommonCodeDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonCodeMapper {

    List<CommonCodeDto> findByGroupCode (String groupCode);

}

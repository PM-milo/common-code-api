package com.milo.prac.commoncode.mapper;

import com.milo.prac.commoncode.dto.CommonCodeDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommonCodeMapper {

    List<CommonCodeDto> findByGroupCode (String groupCode);

    int countByGroupCodeAndCommonCode (
            @Param("groupCode") String groupCode,
            @Param("commonCode") String commonCode
    );

    int countByGroupCode (
            @Param("groupCode") String groupCode
    );

    int insert(CommonCodeDto commonCodeDto);

    int update(CommonCodeDto commonCodeDto);

    int delete(CommonCodeDto commonCodeDto);

}

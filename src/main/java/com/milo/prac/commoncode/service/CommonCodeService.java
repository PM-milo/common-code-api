package com.milo.prac.commoncode.service;

import com.milo.prac.commoncode.dto.CommonCodeDto;
import com.milo.prac.commoncode.mapper.CommonCodeMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommonCodeService {

    private final CommonCodeMapper commonCodeMapper;

    public List<CommonCodeDto> findByGroupCode(String groupCode) {
        return commonCodeMapper.findByGroupCode(groupCode);
    }

}

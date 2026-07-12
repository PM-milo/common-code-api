package com.milo.prac.commoncode.service;

import com.milo.prac.commoncode.dto.CodeGroupDto;
import com.milo.prac.commoncode.mapper.CodeGroupMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CodeGroupService {

    private final CodeGroupMapper codeGroupMapper;

    public List<CodeGroupDto> findAll() {
        return codeGroupMapper.findAll();
    }

}

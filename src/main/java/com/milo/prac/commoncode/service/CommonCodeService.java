package com.milo.prac.commoncode.service;

import com.milo.prac.commoncode.dto.CommonCodeDto;
import com.milo.prac.commoncode.exception.CommonCodeNotFoundException;
import com.milo.prac.commoncode.exception.DuplicateCommentCodeException;
import com.milo.prac.commoncode.exception.GroupCodeNotFoundException;
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

    public void createCommonCode (CommonCodeDto commonCodeDto) {

        validateGroupCode(commonCodeDto.getGroupCode());

        int count = commonCodeMapper.countByGroupCodeAndCommonCode(
                commonCodeDto.getGroupCode(),
                commonCodeDto.getCommonCode()
        );

        if (count > 0) {
            throw new DuplicateCommentCodeException("이미 존재하는 공통 코드입니다.");
        }

        commonCodeMapper.insert(commonCodeDto);
    }

    public void updateCommonCode (CommonCodeDto commonCodeDto) {

        validateGroupCode(commonCodeDto.getGroupCode());

        validateCommonCode(
                commonCodeDto.getCommonCode(),
                commonCodeDto.getCommonCode());

        commonCodeMapper.update(commonCodeDto);

    }

    public void deleteCommonCode (CommonCodeDto commonCodeDto) {

        validateGroupCode(commonCodeDto.getGroupCode());

        validateCommonCode(
                commonCodeDto.getGroupCode(),
                commonCodeDto.getCommonCode());
        commonCodeMapper.delete(commonCodeDto);
    }

    private void validateGroupCode (String groupCode) {
        int groupCodeCount = commonCodeMapper.countByGroupCode(groupCode);

        if (groupCodeCount == 0) {
            throw new GroupCodeNotFoundException("존재하지 않는 그룹 코드입니다.");
        }
    }

    private void validateCommonCode (String groupCode, String commonCode) {
        int commonCodeCount = commonCodeMapper.countByGroupCodeAndCommonCode(
                groupCode, commonCode);

        if (commonCodeCount == 0) {
            throw new CommonCodeNotFoundException("존재하지 않는 공통 코드입니다.");
        }
    }

}

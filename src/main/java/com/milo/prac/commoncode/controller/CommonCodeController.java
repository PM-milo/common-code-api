package com.milo.prac.commoncode.controller;

import com.milo.prac.commoncode.dto.CommonCodeDto;
import com.milo.prac.commoncode.service.CommonCodeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/common-codes")
public class CommonCodeController {

    private final CommonCodeService commonCodeService;

    @GetMapping("/{groupCode}/codes")
    public List<CommonCodeDto> findByGroupCode (
            @PathVariable String groupCode
    ) {
        return commonCodeService.findByGroupCode(groupCode);
    }
}

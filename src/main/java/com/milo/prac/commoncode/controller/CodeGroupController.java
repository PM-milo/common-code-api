package com.milo.prac.commoncode.controller;

import com.milo.prac.commoncode.dto.CodeGroupDto;
import com.milo.prac.commoncode.service.CodeGroupService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/code-groups")
public class CodeGroupController {

    private final CodeGroupService codeGroupService;

    @GetMapping
    public List<CodeGroupDto> findAll() {
        return codeGroupService.findAll();
    }
}

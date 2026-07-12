package com.milo.prac.commoncode.controller;

import com.milo.prac.commoncode.dto.CommonCodeDto;
import com.milo.prac.commoncode.service.CommonCodeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/common-codes")
public class CommonCodeController {

    private final CommonCodeService commonCodeService;

    @GetMapping("/{groupCode}")
    public List<CommonCodeDto> findByGroupCode (
            @PathVariable String groupCode
    ) {
        return commonCodeService.findByGroupCode(groupCode);
    }

    @PostMapping("/{groupCode}")
    public ResponseEntity<Void> createCommonCode (
            @PathVariable String groupCode,
            @RequestBody CommonCodeDto commonCodeDto) {
        commonCodeDto.setGroupCode(groupCode);
        commonCodeService.createCommonCode(commonCodeDto);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{groupCode}/{commonCode}")
    public ResponseEntity<Void> updateCommonCode (
            @PathVariable String groupCode,
            @PathVariable String commonCode,
            @RequestBody CommonCodeDto commonCodeDto
    ) {
        commonCodeDto.setGroupCode(groupCode);
        commonCodeDto.setCommonCode(commonCode);
        commonCodeService.updateCommonCode(commonCodeDto);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{groupCode}/{commonCode}")
    public ResponseEntity<Void> deleteCommonCode (
            @PathVariable String groupCode,
            @PathVariable String commonCode,
            @RequestBody CommonCodeDto commonCodeDto
    ) {
        commonCodeDto.setGroupCode(groupCode);
        commonCodeDto.setCommonCode(commonCode);
        commonCodeService.deleteCommonCode(commonCodeDto);

        return ResponseEntity.noContent().build();
    }

}

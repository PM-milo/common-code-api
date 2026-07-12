INSERT INTO TB_CODE_GROUP(
    GROUP_CODE,
    GROUP_NAME,
    DESCRIPTION,
    CREATED_AT,
    CREATED_BY
) VALUES (
          'BANK',
          '은행코드',
          '은행코드구분',
          CURRENT_TIMESTAMP,
          'ADMIN'
         );

INSERT INTO TB_COMMON_CODE(
    GROUP_CODE,
    COMMON_CODE,
    CODE_NAME,
    USE_YN,
    DEL_YN,
    SORT_ORDER,
    DESCRIPTION,
    CREATED_AT,
    CREATED_BY
) VALUES (
          'BANK',
          '001',
          '우리은행',
          'Y',
          'N',
          1,
          '우리은행코드',
          CURRENT_TIMESTAMP,
          'ADMIN'
         );

INSERT INTO TB_COMMON_CODE(
    GROUP_CODE,
    COMMON_CODE,
    CODE_NAME,
    USE_YN,
    DEL_YN,
    SORT_ORDER,
    DESCRIPTION,
    CREATED_AT,
    CREATED_BY
) VALUES (
             'BANK',
             '002',
             '국민은행',
             'Y',
            'N',
             2,
             '국민은행코드',
             CURRENT_TIMESTAMP,
             'ADMIN'
         );

INSERT INTO TB_COMMON_CODE(
    GROUP_CODE,
    COMMON_CODE,
    CODE_NAME,
    USE_YN,
    DEL_YN,
    SORT_ORDER,
    DESCRIPTION,
    CREATED_AT,
    CREATED_BY
) VALUES (
             'BANK',
             '003',
             '신한은행',
             'Y',
            'N',
             3,
             '신한은행코드',
             CURRENT_TIMESTAMP,
             'ADMIN'
         );


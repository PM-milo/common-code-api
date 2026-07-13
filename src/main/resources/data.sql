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

INSERT INTO TB_CODE_GROUP(
    GROUP_CODE,
    GROUP_NAME,
    DESCRIPTION,
    CREATED_AT,
    CREATED_BY
) VALUES (
             'ACCOUNT',
             '계좌유형',
             '계좌유형구분',
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
             'ACCOUNT',
             'SAVING',
             '예금',
             'Y',
             'N',
             4,
             '예금 계좌',
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
             'ACCOUNT',
             'CMA',
             'CMA',
             'Y',
             'N',
             5,
             'CMA 계좌',
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
             'ACCOUNT',
             'ISA',
             'ISA',
             'Y',
             'N',
             6,
             'ISA 계좌',
             CURRENT_TIMESTAMP,
             'ADMIN'
         );

INSERT INTO TB_ACCOUNT (
    ACCOUNT_NUMBER,
    ACCOUNT_OWNER,
    ACCOUNT_TYPE_GROUP_CODE,
    ACCOUNT_TYPE_CODE,
    BANK_GROUP_CODE,
    BANK_CODE,
    USE_YN,
    CREATED_AT,
    CREATED_BY
) VALUES (
          '101-1123-12441',
          '강군호',
          'ACCOUNT',
          'SAVING',
          'BANK',
          '001',
          'Y',
          CURRENT_TIMESTAMP,
          'ADMIN'
         );

INSERT INTO TB_ACCOUNT (
    ACCOUNT_NUMBER,
    ACCOUNT_OWNER,
    ACCOUNT_TYPE_GROUP_CODE,
    ACCOUNT_TYPE_CODE,
    BANK_GROUP_CODE,
    BANK_CODE,
    USE_YN,
    CREATED_AT,
    CREATED_BY
) VALUES (
             '101-1111-33333',
             '홍길동',
             'ACCOUNT',
             'ISA',
             'BANK',
             '003',
            'Y',
             CURRENT_TIMESTAMP,
             'ADMIN'
         );

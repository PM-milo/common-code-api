# Common Code API

Spring Boot와 MyBatis를 사용한 공통 코드 관리 API입니다.

## 기술스택

- Java 17
- Spring Boot 3.5
- MyBatis
- H2 Database
- Maven
- Tabulator

## Features

- 공통 코드 조회
- 공통 코드 등록
- 공통 코드 수정
- 공통 코드 삭제 (논리 삭제)
- 예외 처리 (Global Exception Handler)

## 프로젝트 구조

```
src
├── controller
├── service
├── mapper
├── dto
├── exception
└── resources
    ├── mapper
    ├── schema.sql
    └── data.sql
```

## API

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/common-codes/{groupCode}` | 공통 코드 조회 |
| POST | `/common-codes/{groupCode}` | 공통 코드 등록 |
| PUT | `/common-codes/{groupCode}/{commonCode}` | 공통 코드 수정 |
| DELETE | `/common-codes/{groupCode}/{commonCode}` | 공통 코드 삭제(논리 삭제) |

## Database

### TB_CODE_GROUP
- 그룹 코드 정보 관리

### TB_COMMON_CODE
- 공통 코드 정보 관리
- `DEL_YN`을 이용한 논리 삭제 적용

## 실행

```bash
./mvnw spring-boot:run
```

실행 후

```
http://localhost:8080/
```

에서 화면을 확인할 수 있습니다.

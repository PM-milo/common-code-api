# Common Code API

Spring Boot와 MyBatis를 사용한 공통 코드 및 계좌(Account) 관리 API입니다.

## Tech Stack

- Java 17
- Spring Boot 3.5
- MyBatis
- H2 Database
- Maven
- Swagger (springdoc-openapi)
- Tabulator.js

## Features

### Common Code
- 공통 코드 조회
- 공통 코드 등록
- 공통 코드 수정
- 공통 코드 삭제 (논리 삭제)

### Account
- 계좌 조회
- 계좌 등록
- 계좌 수정
- 계좌 삭제 (물리 삭제)
- 공통 코드(TB_COMMON_CODE)와 JOIN하여 계좌 유형 및 은행명 조회

## Database

- TB_CODE_GROUP
    - 공통 코드 그룹 관리

- TB_COMMON_CODE
    - 공통 코드 관리
    - 논리 삭제(DEL_YN)

- TB_ACCOUNT
    - 계좌 정보 관리
    - 계좌 유형 및 은행 코드를 공통 코드 테이블에서 참조

## API

### Common Code

| Method | URL |
|--------|-----|
| GET | `/common-codes/{groupCode}` |
| POST | `/common-codes/{groupCode}` |
| PUT | `/common-codes/{groupCode}/{commonCode}` |
| DELETE | `/common-codes/{groupCode}/{commonCode}` |

### Account

| Method | URL |
|--------|-----|
| GET | `/accounts` |
| POST | `/accounts` |
| PUT | `/accounts/{accountNumber}` |
| DELETE | `/accounts/{accountNumber}` |

## Project Structure

```
src
├── controller
├── service
├── mapper
├── dto
├── exception
└── resources
    ├── mapper
    ├── static
    ├── schema.sql
    └── data.sql
```

## Run

```bash
./mvnw spring-boot:run
```

## Access

- Main : http://localhost:8080/
- Swagger UI : http://localhost:8080/swagger-ui/index.html
- H2 Console : http://localhost:8080/h2-console
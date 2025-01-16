# Spring Boot를 이용한 RESTful API 개발

## 소개
이 프로젝트는 Spring Boot를 사용하여 RESTful API를 설계하고 구현한 예제입니다. RESTful API의 핵심 원칙과 Java Spring 생태계를 활용한 현대적인 백엔드 개발 기법을 학습하고 적용한 결과물입니다. 이 프로젝트는 백엔드 개발자로서의 전문성과 차별성을 보여주기 위한 포트폴리오 목적으로 작성되었습니다.

---

## 프로젝트 목표
- REST 아키텍처 스타일에 기반한 안정적이고 확장 가능한 API 설계.
- Java Persistence API(JPA)를 활용한 데이터베이스 연동 및 ORM 처리.
- Spring Security를 통한 인증 및 권한 관리.
- HATEOAS를 사용하여 클라이언트와의 상호작용을 명확히 표현.
- API 문서화를 위한 Swagger 통합.
- 국제화(i18n)를 통해 다국어 지원.

---

## 프로젝트 구조
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.restapi
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── repository
│   │   │       └── model
│   │   └── resources
│   │       ├── application.yml
│   │       ├── data.sql
│   │       ├── messages.properties
│   │       ├── messages_kr.properties
│   │       ├── messages_fr.properties
│   │       └── messages_ja.properties
│   └── test
├── README.md
└── .gitignore
```

---

## 핵심 기능 및 사용 기술

### 1. RESTful API 설계
- **이유**: 클라이언트와 서버 간의 명확한 역할 분리와 효율적인 데이터 전송을 위해.
- **내용**:
  - HTTP 메서드(GET, POST, PUT, DELETE)를 활용하여 리소스 관리.
  - 명확한 URI 설계: 예) `/users`, `/users/{id}`.
  - Richardson Maturity Model 레벨 2를 달성.

### 2. Spring Boot를 활용한 간소화된 설정
- **이유**: 빠른 개발 환경 구성과 배포 용이성.
- **내용**:
  - 내장 Tomcat을 사용하여 별도 설정 없이 실행 가능.
  - `application.yml`을 통해 외부 설정 관리.

### 3. JPA와 H2 Database
- **이유**: 데이터베이스와의 상호작용을 단순화하고 유지보수를 용이하게 하기 위해.
- **내용**:
  - Spring Data JPA를 사용하여 Repository 계층에서 CRUD 작업 구현.
  - H2 메모리 데이터베이스를 통해 로컬 개발 및 테스트 환경에서 데이터 저장.
  - `data.sql`을 사용해 초기 데이터를 설정하여 테스트 데이터 자동 로드.

### 4. 예외 처리
- **이유**: 사용자 경험을 개선하고 디버깅을 용이하게 하기 위해.
- **내용**:
  - `@ControllerAdvice`와 `ResponseEntityExceptionHandler`를 사용하여 전역 예외 처리.
  - 사용자 정의 예외(`UserNotFoundException`)를 통해 명확한 오류 메시지 제공.

### 5. Spring Security
- **이유**: 인증 및 권한 관리를 통한 보안 강화.
- **내용**:
  - JWT(Json Web Token)을 활용한 인증.
  - URL별 접근 제어 설정.
  - Security 설정은 `SecurityConfig`에서 관리.

### 6. HATEOAS
- **이유**: 클라이언트가 API의 다음 동작을 쉽게 파악할 수 있도록 지원.
- **내용**:
  - `EntityModel`과 `Link` 객체를 사용하여 리소스에 관련 링크 추가.
  - API를 더욱 RESTful하게 구성.

### 7. API 문서화 (Swagger)
- **이유**: 개발자 간의 효율적인 커뮤니케이션.
- **내용**:
  - Swagger UI를 통해 API의 사용 방법 및 요청/응답 구조 시각화.
  - Swagger 설정은 `SwaggerConfig` 및 `NewSwaggerConfig`를 통해 관리.

### 8. 국제화 지원
- **이유**: 글로벌 사용자 경험 향상을 위해.
- **내용**:
  - 메시지 번들 파일(`messages_kr.properties` 등)을 통해 다국어 지원.
  - `@RequestHeader`로 클라이언트의 언어 설정에 따라 적절한 메시지 반환.

---

## 주요 학습 내용 및 의도
- RESTful API 설계 원칙에 따라 효율적이고 표준화된 API 구현.
- Spring Boot의 자동 설정과 생산성 도구(Spring Initializr, DevTools 등)를 활용한 개발 효율성 극대화.
- JPA와 ORM을 통해 데이터베이스와 객체 지향 프로그래밍 간의 격차 해소.
- HATEOAS와 Swagger를 통해 유지보수성과 확장성을 높인 API 설계.
- 인증과 보안을 고려한 설계로 현실적인 서비스 구축 역량 강화.
- 다국어 지원을 통해 국제적 사용자 기반에 대응.

---

## 실행 방법
1. **환경 구성**
   - JDK 11 이상 설치.
   - Maven 설치.
2. **프로젝트 클론**
   ```bash
   git clone https://github.com/username/restful-api-project.git
   cd restful-api-project
   ```
3. **의존성 설치 및 실행**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. **Swagger 문서 확인**
   - `http://localhost:8080/swagger-ui.html`에서 API 명세 확인.

---

## 앞으로의 개선 방향
- 데이터베이스 마이그레이션 도구(Flyway) 추가.
- CI/CD를 통한 자동 배포 파이프라인 구축.
- Redis 캐시 도입으로 데이터 조회 성능 개선.

---

## 문의
프로젝트에 대한 문의사항은 아래로 연락해 주세요:
- Email: gdh0180@gmail.com
- GitHub: [https://github.com/username](https://github.com/username)

---


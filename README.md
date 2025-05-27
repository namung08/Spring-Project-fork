# 여행 예약 시스템 <img src="img/travel-icon.png" alt="" width="30">

---

- 이 프로젝트는 **Spring Boot와 React**를 활용한 현대적인 여행 예약 시스템입니다.

<h1>Modern Travel Booking System using Spring Boot and React v1.0</h1>

---

> **SeSAC**  
> **개발기간 : 2024.03.13 - 2024.03.19**

# 개발자 <img src="img/developer-icon.png" alt="" width="30">

---

|                              **이상준**                               |                              **김윤기**                               |**김진욱**|
| :-------------------------------------------------------------------: | :-------------------------------------------------------------------: |:---------------------------:|
| ![profile.png](https://avatars.githubusercontent.com/u/113490780?v=4) | ![profile.png](https://avatars.githubusercontent.com/u/170920525?v=4) | ![profile.png](https://avatars.githubusercontent.com/u/159872508?v=4)|
|               [@namung08](https://github.com/namung08)                |               [@game4eyes](https://github.com/developer4eyes)                | [@Jinwook93](https://github.com/Jinwook93)|

# 프로젝트 소개 <img src="img/info-icon.png" alt="" width="30">

---

- **여행 상품 관리** : 다양한 여행 상품을 효율적으로 관리할 수 있는 기능을 제공합니다.
- **예약 시스템** : 사용자가 여행 상품을 쉽게 검색하고 예약할 수 있습니다.
- **데이터 저장** : MySQL을 활용하여 사용자의 예약 데이터를 안전하게 저장합니다.
- **반응형 디자인** : 모든 디바이스에서 최적화된 사용자 경험을 제공합니다.
- **보안 기능** : Spring Security를 통한 안전한 사용자 인증 및 권한 관리
- **API 문서화** : Swagger를 통한 직관적인 API 문서 제공

# 시작 가이드 <img src="img/guide-icon.png" alt="" width="30">

---

- **프로그래밍 언어** : [Java](https://www.java.com/), [TypeScript](https://www.typescriptlang.org/)
- **프레임워크** : [Spring Boot](https://spring.io/projects/spring-boot), [React](https://react.dev/)
- **빌드 도구** : [Gradle](https://gradle.org/)
- **데이터베이스** : [MySQL](https://www.mysql.com/)
- **사용 툴** : [VS Code](https://code.visualstudio.com/), [Cursor](https://cursor.sh/)

```bash
git clone https://github.com/namung08/travel-booking-system.git
cd travel-booking-system
./gradlew build
./gradlew bootRun
```

# 기술 스택 📚

---

<div align=center> 
<h3>Environment</h3>
    <img src="https://img.shields.io/badge/VS Code-007ACC?style=for-the-badge&logo=Visual Studio Code&logoColor=white">
    <img src="https://img.shields.io/badge/Cursor-00A8E8?style=for-the-badge&logo=Cursor&logoColor=white">
<h3>Config</h3>
<img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white">
<h3>Development</h3>
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white">
<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white">
<img src="https://img.shields.io/badge/TypeScript-3178C6?style=for-the-badge&logo=TypeScript&logoColor=white">
<h3>Database</h3>
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">
<h3>Communication </h3>
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>

# 주요 기능 <img src="img/feature-icon.png" alt="" width="30">

---

## ⭐️ 여행 상품 관리 기능

- 새로운 여행 상품 등록
- 기존 상품 정보 수정
- 상품 삭제

## ⭐️ 예약 시스템 기능

- 여행 상품 검색
- 예약 생성 및 관리
- 예약 상태 추적

## ⭐️ 사용자 관리 기능

- 회원가입 및 로그인
- 권한 기반 접근 제어
- 사용자 프로필 관리

## ⭐️ API 문서화 기능

- Swagger UI를 통한 API 문서 제공
- API 테스트 환경 제공

# 프로젝트 구조 <img src="img/structure-icon.png" alt="" width="30">

---

```
travel-booking-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── travel/
│   │   │           ├── booking/
│   │   │           ├── security/
│   │   │           ├── config/
│   │   │           └── TravelApplication.java
│   │   └── resources/
│   │       └── application.properties
├── spring_front/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   └── App.tsx
├── sqlscv/
│   └── schema.sql
└── build.gradle
```

# 라이선스

이 프로젝트는 MIT 라이선스를 따릅니다.

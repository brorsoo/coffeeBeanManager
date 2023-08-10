------------------------------------------------
------------- Coffee Bean 계정 생성 -------------
------------------------------------------------

CREATE USER C##BEAN IDENTIFIED BY BEAN;
-- C##BEAN 계정에 접속 권한, 테이블 생성 권한 등을 부여
GRANT RESOURCE, CONNECT TO C##BEAN;
-- C##BEAN 계정에 테이블 스페이스 부여
ALTER USER C##BEAN QUOTA UNLIMITED ON USERS;

------------------------------------------------
-- 기존 시퀀스 삭제
DROP SEQUENCE SEQ_BEAN_NO;
DROP SEQUENCE SEQ_ORIGIN_NO;

-- 시퀀스 생성
CREATE SEQUENCE SEQ_BEAN_NO;
CREATE SEQUENCE SEQ_ORIGIN_NO;


-- 기존 테이블 삭제
DROP TABLE tbl_coffee_bean CASCADE CONSTRAINTS;
DROP TABLE tbl_bean_origin CASCADE CONSTRAINTS;


-- tbl_bean_origin 테이블 생성
CREATE TABLE tbl_bean_origin
(
    origin_code     NUMBER NOT NULL,
    origin_name     VARCHAR2(30) NOT NULL,
    bean_kind       VARCHAR2(20)
);

COMMENT ON COLUMN tbl_bean_origin.origin_code IS '원산지코드';
COMMENT ON COLUMN tbl_bean_origin.origin_name IS '원산지명';
COMMENT ON COLUMN tbl_bean_origin.bean_kind IS '품종';
COMMENT ON TABLE tbl_bean_origin IS '원산지목록';

CREATE UNIQUE INDEX index_origin_code ON tbl_bean_origin
( origin_code );

ALTER TABLE tbl_bean_origin
 ADD CONSTRAINT pk_origin_code PRIMARY KEY ( origin_code )
 USING INDEX index_origin_code;


-- tbl_coffee_bean 테이블 생성
CREATE TABLE tbl_coffee_bean
(
    bean_no         NUMBER NOT NULL,
    bean_name       VARCHAR2(50) NOT NULL,
    origin_code     NUMBER NOT NULL,
    taste           VARCHAR2(20) NOT NULL,
    weight          NUMBER,
    extra_count     NUMBER NOT NULL
);

COMMENT ON COLUMN tbl_coffee_bean.bean_no IS '원두번호';
COMMENT ON COLUMN tbl_coffee_bean.bean_name IS '원두명';
COMMENT ON COLUMN tbl_coffee_bean.origin_code IS '원산지';
COMMENT ON COLUMN tbl_coffee_bean.taste IS '맛';
COMMENT ON COLUMN tbl_coffee_bean.weight IS '포장무게';
COMMENT ON COLUMN tbl_coffee_bean.extra_count IS '잔여량';
COMMENT ON TABLE tbl_coffee_bean IS '원두리스트';

CREATE UNIQUE INDEX index_bean_no ON tbl_coffee_bean
( bean_no );

ALTER TABLE tbl_coffee_bean
 ADD CONSTRAINT pk_bean_no PRIMARY KEY ( bean_no )
 USING INDEX index_bean_no;

ALTER TABLE tbl_coffee_bean
 ADD CONSTRAINT fk_origin_code FOREIGN KEY ( origin_code )
 REFERENCES tbl_bean_origin ( origin_code );


-- tbl_bean_origin 정보입력
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '에티오피아', '아라비카');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '브라질', '아라비카');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '콜롬비아', '아라비카');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '과테말라', '아라비카');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '케냐', '아라비카');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '탄자니아', '아라비카');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '코스타리카', '아라비카');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '하와이', '아라비카');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '자메이카', '아라비카');

INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '베트남', '로부스타');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '우간다', '로부스타');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '인도', '로부스타');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '카메룬', '로부스타');
INSERT INTO tbl_bean_origin VALUES (SEQ_ORIGIN_NO.NEXTVAL, '인도네시아', '로부스타');


-- tbl_coffee_bean 정보입력

INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '예가체프', 1, '신맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '하라', 1, '초콜릿맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '시다모', 1, '신맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '짐마', 1, '쓴맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '산토스', 2, '신맛', 1000, 5);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '수프리모', 3, '신맛', 500, 30);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '안티구아', 4, '신맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '우에우에테낭고', 4, '신맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '케냐AA', 5, '신맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '킬리만자로', 6, '신맛', 1000, 20);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '음베야', 6, '신맛', 1000, 20);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '아루샤', 6, '신맛', 1000, 20);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '타라주', 7, '신맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '코나', 8, '신맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '블루마운틴', 9, '신맛', 1000, 20);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '위즐', 10, '초콜릿맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '카트루', 10, '쓴맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '우간다', 11, '쓴맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '몬순말라바르', 12, '쓴맛', 500, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '블루마운틴', 13, '쓴맛', 1000, 10);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '만델링', 14, '신맛', 500, 20);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '루왁', 14, '부드러운맛', 500, 20);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '토라잔', 14, '단맛', 500, 20);
INSERT INTO tbl_coffee_bean VALUES (SEQ_BEAN_NO.NEXTVAL, '아체가요', 14, '쓴맛', 500, 20);

COMMIT;



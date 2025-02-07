/* 既存データベースがある場合は削除 */
DROP DATABASE IF EXISTS license_sys_db;

/* データベース作成 */
CREATE DATABASE license_sys_db;

\c license_sys_db;
-- 既存テーブルがある場合は削除
DROP TABLE IF EXISTS m_post CASCADE;
DROP TABLE IF EXISTS m_skill_lv CASCADE;
DROP TABLE IF EXISTS m_emp CASCADE;
DROP TABLE IF EXISTS m_license CASCADE;
DROP TABLE IF EXISTS t_get_license CASCADE;

-- 部署マスタ作成
CREATE TABLE m_post
(
    post_id      SERIAL PRIMARY KEY,
    post_name    VARCHAR(20) NOT NULL
);

-- スキルレベルマスタ作成
CREATE TABLE m_skill_lv
(
    skill_lv    SERIAL PRIMARY KEY,
    weight      INT
);

-- 社員マスタ作成
CREATE TABLE m_emp
(
    emp_cd           CHAR(5) PRIMARY KEY,
    post_id          INT NOT NULL,
    emp_name_kanji   VARCHAR(100) NOT NULL,
    emp_name_kana    VARCHAR(100),
    based_paid       INT NOT NULL,
    FOREIGN KEY(post_id) REFERENCES m_post(post_id)
);

-- 資格マスタ作成
CREATE TABLE m_license
(
    license_cd      CHAR(5) PRIMARY KEY,
    license_name    VARCHAR(100),
    skill_lv        INT,
    FOREIGN KEY(skill_lv) REFERENCES m_skill_lv(skill_lv)
);

-- 資格取得テーブル作成
CREATE TABLE t_get_license
(
    emp_cd              CHAR(5),
    license_cd          CHAR(5),
    get_license_date    DATE,
    PRIMARY KEY(emp_cd, license_cd),
    FOREIGN KEY(emp_cd) REFERENCES m_emp(emp_cd),
    FOREIGN KEY(license_cd) REFERENCES m_license(license_cd)
);


-- 部署マスタINSERT
INSERT INTO m_post (post_id, post_name) VALUES (10, '経理部');
INSERT INTO m_post (post_id, post_name) VALUES (20, '調査部');
INSERT INTO m_post (post_id, post_name) VALUES (30, '営業部');
INSERT INTO m_post (post_id, post_name) VALUES (40, '総務部');

-- スキルレベルマスタINSERT
INSERT INTO m_skill_lv (skill_lv, weight) VALUES (1, 1);
INSERT INTO m_skill_lv (skill_lv, weight) VALUES (2, 2);
INSERT INTO m_skill_lv (skill_lv, weight) VALUES (3, 4);
INSERT INTO m_skill_lv (skill_lv, weight) VALUES (4, 7);
INSERT INTO m_skill_lv (skill_lv, weight) VALUES (5, 10);

-- 社員マスタINSERT
INSERT INTO m_emp (emp_cd, post_id, emp_name_kanji, emp_name_kana, based_paid) VALUES ('21021', 30, '田中一郎', 'たなかいちろう', 1000);
INSERT INTO m_emp (emp_cd, post_id, emp_name_kanji, emp_name_kana, based_paid) VALUES ('21024', 30, '山田花子', 'やまだはなこ', 2000);
INSERT INTO m_emp (emp_cd, post_id, emp_name_kanji, emp_name_kana, based_paid) VALUES ('21042', 10, '鈴木正雄', 'すずきまさお', 1000);
INSERT INTO m_emp (emp_cd, post_id, emp_name_kanji, emp_name_kana, based_paid) VALUES ('21047', 10, '高橋和男', 'たかはしかずお', 2000);
INSERT INTO m_emp (emp_cd, post_id, emp_name_kanji, emp_name_kana, based_paid) VALUES ('21063', 40, '佐藤愛', 'さとうあい', 4000);
INSERT INTO m_emp (emp_cd, post_id, emp_name_kanji, emp_name_kana, based_paid) VALUES ('21066', 20, '岡本美智子', 'おかもとみちこ', 5000);
INSERT INTO m_emp (emp_cd, post_id, emp_name_kanji, emp_name_kana, based_paid) VALUES ('21085', 20, '太田豊', 'おおたゆたか', 1000);
INSERT INTO m_emp (emp_cd, post_id, emp_name_kanji, emp_name_kana, based_paid) VALUES ('21086', 10, '渡辺浩志', 'わたなべひろし', 1000);

-- 資格マスタINSERT
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0001', 'ITパスポート', 1);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0101', '基本情報', 2);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0102', '応用情報', 3);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0301', 'Oracle Master Bronze', 2);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0302', 'Oracle Master Silver', 3);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0303', 'Oracle Master Gold', 4);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0401', 'OCJ-P', 2);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0402', 'OCJ-WS', 3);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0501', 'OCUP-F', 2);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0502', 'OCUP-I', 3);
INSERT INTO m_license (license_cd, license_name, skill_lv) VALUES ('L0503', 'OCUP-A', 4);

-- 資格取得テーブルINSERT
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21021', 'L0001', '2010-02-10');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21024', 'L0101', '2010-05-04');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21047', 'L0102', '2010-01-14');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21063', 'L0301', '2010-08-31');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21066', 'L0402', '2012-10-11');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21085', 'L0501', '2010-03-02');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21086', 'L0502', '2010-07-01');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21024', 'L0503', '2011-06-21');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21063', 'L0001', '2012-04-22');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21066', 'L0101', '2013-10-08');
INSERT INTO t_get_license (emp_cd, license_cd, get_license_date) VALUES ('21047', 'L0501', '2013-09-19');

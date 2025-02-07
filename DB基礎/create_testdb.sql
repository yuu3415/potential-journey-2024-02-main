/* DB作成 */
DROP DATABASE IF EXISTS testdb;
CREATE DATABASE testdb ENCODING 'UTF8';

/* ユーザを作成 */
DROP USER IF EXISTS trainee;
CREATE USER trainee WITH PASSWORD 'password';

/* 権限付与 */
GRANT ALL PRIVILEGES ON DATABASE testdb TO trainee;

/* AUTOCOMMIT無効 */
/* SET AUTOCOMMIT TO OFF; */

/* DB選択 */
\c testdb;

/* 既存のテーブルがあれば削除 */
DROP TABLE IF EXISTS m_person, m_company, m_post;

/* 会社マスタ作成 */
CREATE TABLE m_company
( 
    company_id   SERIAL PRIMARY KEY,
    company_name VARCHAR(100),
    area_id      INT,
    area_name    VARCHAR(100) 
);

/* 個人情報マスタ作成 */
CREATE TABLE m_person
( 
    person_id    SERIAL PRIMARY KEY,
    company_id   INT,
    person_lname VARCHAR(100),
    person_fname VARCHAR(100),
    post_id      INT
);

/* 役職マスタ作成 */
CREATE TABLE m_post
( 
    post_id      SERIAL PRIMARY KEY,
    post_name    VARCHAR(100)
);

/* 個人情報マスタINSERT */
INSERT INTO m_person VALUES(1,3,'山田','太郎',3);
INSERT INTO m_person VALUES(2,3,'鈴木','花子',2);
INSERT INTO m_person VALUES(3,2,'佐藤','一郎',1);
INSERT INTO m_person VALUES(4,6,'田中','次郎',3);
INSERT INTO m_person VALUES(5,6,'高橋','優子',3);
INSERT INTO m_person VALUES(6,7,'斉藤','桃子',1);

/* 会社マスタINSERT */
INSERT INTO m_company VALUES(1,'ABC株式会社',           1,'東京都');
INSERT INTO m_company VALUES(2,'アルファ商事',          3,'神奈川県');
INSERT INTO m_company VALUES(3,'ベータホールディングス',1,'東京都');
INSERT INTO m_company VALUES(4,'株式会社ワン',          1,'東京都');
INSERT INTO m_company VALUES(5,'株式会社ツー',          2,'大阪府');
INSERT INTO m_company VALUES(6,'株式会社スリー',        2,'大阪府');

COMMIT;

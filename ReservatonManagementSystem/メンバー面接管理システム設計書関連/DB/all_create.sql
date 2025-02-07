CREATE TABLE ms_user (
     user_id SERIAL PRIMARY KEY,
     password VARCHAR(255) NOT NULL,
     last_name VARCHAR(255) NOT NULL,
     first_name VARCHAR(255) NOT NULL,
     role_code VARCHAR(255), -- 権限コード（利用の予定はなし。）
     phone_number VARCHAR(20),
     registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     last_login_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
 );

CREATE TABLE ms_member (
     member_code SERIAL PRIMARY KEY,
     last_name VARCHAR(255) NOT NULL,
     first_name VARCHAR(255) NOT NULL,
     address VARCHAR(255),
     phone_number VARCHAR(20),
     birthdate DATE,
     email VARCHAR(255),
     registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
 );
CREATE TABLE tr_meeting_info (
     member_code INT,
     reservation_date DATE,
     start_time TIME,
     meeting_result VARCHAR(255),
     delete_flag INT DEFAULT 0, -- 0: 未削除, 1: 削除
     registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
 );
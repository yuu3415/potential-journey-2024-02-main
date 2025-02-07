select
    t1.emp_cd "社員コード", t2.emp_name_kana "社員名(かな)", 
    t1.license_cd "資格コード", t1.get_license_date "資格取得日"
from
    t_get_license t1
    inner join m_emp t2
    on t1.emp_cd=t2.emp_cd
order by
    t2.emp_name_kana desc, t1.license_cd desc;
    

select
    t1.emp_cd "社員コード", t1.emp_name_kanji "社員名(漢字)", t2.post_name "部署名", 
    t3.license_cd "資格コード", t4.license_name "資格名"
from
    ((m_emp t1 
    left outer join m_post t2
    on t1.post_id = t2.post_id)
    
    left outer join t_get_license t3
    on t1.emp_cd = t3.emp_cd)
    
    left outer join m_license t4
    on t3.license_cd=t4.license_cd
where
    t2.post_name = '経理部' or t3.license_cd = 'L0001'
order by 
license_name desc;

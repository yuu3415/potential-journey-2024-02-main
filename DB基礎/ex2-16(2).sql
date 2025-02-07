select
    t3.license_name,count(t2.license_cd)
from
    (m_emp t1
    left outer join t_get_license t2
    on t1.emp_cd=t2.emp_cd)
    
    right outer join m_license t3
    on t2.license_cd=t3.license_cd
group by
    t2.license_cd,t3.license_name
order by
    license_name asc;

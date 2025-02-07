select
    t1.emp_cd,t1.emp_name_kanji, count(*)
from
    m_emp t1
    inner join t_get_license t2
    on t1.emp_cd=t2.emp_cd
group by
    t1.emp_cd, t1.emp_name_kanji
order by
    t1.emp_cd asc;

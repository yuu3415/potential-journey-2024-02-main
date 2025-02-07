select
    t1.emp_name_kanji "社員名(漢字)", count(*)
from
    (m_emp t1
    inner join t_get_license t2
    on t1.emp_cd=t2.emp_cd)
    inner join m_license t3
    on t2.license_cd=t3.license_cd
group by
     t1.emp_cd, t2.emp_cd
having
    count(*)=2
order by
    emp_name_kanji desc; --ソートがおかしい・高橋をこうはしと認識している？

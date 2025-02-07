select
    t1.emp_cd,t1.emp_name_kanji, count(license_cd)
from
    m_emp t1
    left outer join t_get_license t2
    on t1.emp_cd=t2.emp_cd
group by
    t1.emp_cd, t2.emp_cd
order by
    t1.emp_cd asc;
    
    //なぜこの出力結果になったのか詳細を把握していないと思うので確認

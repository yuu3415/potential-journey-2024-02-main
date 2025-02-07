select
    t1.emp_name_kanji "社員名(漢字)", t3.license_name "資格名", t1.based_paid*t4.weight "報奨金額"
from
    ((m_emp t1
    inner join t_get_license t2
    on t1.emp_cd=t2.emp_cd)
    inner join m_license t3
    on t2.license_cd=t3.license_cd)
    inner join m_skill_lv t4
    on t3.skill_lv=t4.skill_lv
order by
    t1.emp_name_kanji asc;  --出力結果が違うが社員名(漢字)で昇順ソートを行った。イメージの方がソートが少しおかしかったと思うのでこれもDBMSの種類やバージョンの問題か

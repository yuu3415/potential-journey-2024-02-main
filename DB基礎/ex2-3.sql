select
    t1.emp_cd as 社員コード, t1.emp_name_kanji as "社員名(漢字)", t2.post_id "部署ID", t2.post_name "部署名", based_paid "手当基礎額"
from
    m_emp t1 inner join m_post t2
          on t1.post_id = t2.post_id
where
    based_paid<=2000;


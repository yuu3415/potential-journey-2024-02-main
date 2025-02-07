select
    t1.emp_cd, t1.emp_name_kanji, t2.post_id, t2.post_name
from
    m_emp t1 inner join m_post t2
        on t2.post_id=t1.post_id
where
    post_name in ('営業部');  
    
    //苦戦した。一度内部結合してから出さないとダメ。 m_emp t1 inner join m_post t2　on t2.post_id='営業部'と記入してしまった
    

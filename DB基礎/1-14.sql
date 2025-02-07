select
    t1.person_id, t2.company_id, t2.company_name,
    t1.person_lname, t1.person_fname
from
    m_person t1 left outer join m_company t2
        on t1.company_id= t2.company_id;

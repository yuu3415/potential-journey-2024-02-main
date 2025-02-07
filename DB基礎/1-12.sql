select count(area_id) as "COUNT(area_id)", area_id, area_name from m_company group by area_id, area_name having count(*)<=2 order by area_id asc;

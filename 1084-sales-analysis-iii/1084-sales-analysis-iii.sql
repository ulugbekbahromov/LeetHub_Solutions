# Write your MySQL query statement below
select s.product_id, product_name
from product as p
left join sales as s
on p.product_id = s.product_id
group by s.product_id
having min(s.sale_date) >= '2019-01-01'
   and max(s.sale_date) <= '2019-03-31';
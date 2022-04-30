# Write your MySQL query statement below
select name
from salesperson as s
where s.sales_id not in (
            select s.sales_id
            from salesperson as s
            join orders as o
            on s.sales_id = o.sales_id
            join company as c
            on o.com_id = c.com_id
            where c.name = 'RED'
            
);
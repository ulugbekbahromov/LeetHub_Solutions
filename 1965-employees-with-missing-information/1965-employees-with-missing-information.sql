# Write your MySQL query statement below
with info as (
    select sal.employee_id
    from Employees as emp
    inner join Salaries as sal
    on emp.employee_id = sal.employee_id
)

select employee_id
from Employees
where employee_id not in (select * from info)
union 
select employee_id
from Salaries
where employee_id not in (select * from info)
order by employee_id asc;
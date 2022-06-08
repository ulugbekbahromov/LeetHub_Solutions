select 
    distinct event_day as day, 
    emp_id,
    sum(out_time - in_time) over(partition by emp_id, event_day) as total_time
from employees;

# solution using window function
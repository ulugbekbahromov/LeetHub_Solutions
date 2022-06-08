# Write your MySQL query statement below
select 
    u.name, 
    sum(case when u.id = r.user_id 
             then distance
             else 0 
        end) as travelled_distance
from Users as u
left join Rides as r
on u.id = r.user_id
group by r.user_id
order by travelled_distance desc, u.name;
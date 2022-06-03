# Write your MySQL query statement below
select 
    distinct u.name, 
    ifnull(sum(r.distance) over(partition by r.user_id), 0) as travelled_distance
from Users as u
left join Rides as r
on u.id = r.user_id
order by travelled_distance desc, u.name;

# Write your MySQL query statement below
select distinct(actor_id), director_id
from (
    select 
        actor_id, 
        director_id,
        count(timestamp) over(partition by actor_id, director_id) as number_of_times
    from ActorDirector
) as temp_table
where number_of_times >= 3;

# hard solutions for me now
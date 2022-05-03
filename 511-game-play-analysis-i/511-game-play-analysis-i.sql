# Write your MySQL query statement below
with game as (
    select 
        player_id, event_date as first_login,
        dense_rank() over(partition by player_id order by event_date) as rnk
        from activity
)

select player_id, first_login
from game
where rnk = 1;


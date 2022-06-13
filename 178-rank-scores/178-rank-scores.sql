with S2 as (
    select distinct score
    from Scores
)

select 
    S1.score, 
    count(S2.score) as 'Rank' 
from Scores as S1, S2
where S1.score <= S2.score
group by S1.id 
order by S1.score desc;
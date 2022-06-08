with temp as (
    select t.account, u.name, sum(amount) as balance
    from Transactions as t
    inner join Users as u
    on t.account = u.account
    group by t.account
)

select 
    name, 
    balance
from temp
where balance > 10000;

# solution using cte
with Total as (
    select 
        distinct account,
        sum(amount) over(partition by account) as balance
    from Transactions
)

select 
    name, 
    balance
from Users as u
inner join Total as t
on u.account = t.account
where balance > 10000;

# solution using windows function
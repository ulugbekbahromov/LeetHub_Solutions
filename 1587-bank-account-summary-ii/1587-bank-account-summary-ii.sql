select u.name as name, sum(t.amount) as balance
from Users as u
inner join Transactions as t
on u.account = t.account
group by u.name
having sum(t.amount) > 10000;

# simplest solution came to head first
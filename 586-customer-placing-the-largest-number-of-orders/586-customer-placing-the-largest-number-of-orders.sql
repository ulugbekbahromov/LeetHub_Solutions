# Write your MySQL query statement below
select customer_number
from (
    select 
            customer_number,
            dense_rank() over(order by count(order_number) desc) as 'ranking'
    from orders
    group by customer_number 
) as sub
where sub.ranking = 1;
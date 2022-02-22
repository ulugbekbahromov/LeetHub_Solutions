# Write your MySQL query statement below
select name as Customers
from Customers where id not in (
    select c.id
    from Customers as c
    join Orders as o
    on c.id = o.customerId);
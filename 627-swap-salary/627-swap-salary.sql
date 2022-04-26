# Write your MySQL query statement below
update Salary
set sex = char(ascii('m') ^ ascii('f') ^ ascii(sex));
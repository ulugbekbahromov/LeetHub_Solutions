select
    user_id,
    concat(ucase(left(name, 1)), lcase(right(name, length(name)-1))) as name
from Users
order by user_id;
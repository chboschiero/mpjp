-- check null
select first_name, last_name
from employees
where commission_pct is not null;

-- null in operations
select first_name, last_name, 12 * salary * commission_pct
from employees;

-- what if null
select first_name, last_name, 12 * salary * ifnull(commission_pct, 0) -- se è null mette commission_pct a 0 (che moltiplicato da sempre 0)
from employees;
-- average
use me;

select avg(salary)
from employees
where department_id = 50;

select DEPARTMENT_NAME, truncate(avg(salary), 0) as 'Average Salary'
from departments left outer join employees
using(department_id)
group by DEPARTMENT_ID
order by 2 desc;

-- count, count distinct
select count(*), count(manager_id), count(distinct manager_id)
from employees;

-- max, min
select max(salary), min(salary)
from employees;

-- sum
select sum(salary)
from employees
where department_id = 50;

-- standar deviation, variance
select stddev(salary), variance(salary)
from employees;

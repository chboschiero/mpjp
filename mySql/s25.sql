-- self join
select concat(e.last_name, ' ', e.first_name) as Employee, concat(m.last_name, ' ', m.FIRST_NAME) as Manager, e.HIRE_DATE as 'Hire Date'
from employees e join employees m
on (e.manager_id = m.employee_id)
order by 3;

-- "classic" self join
select e.last_name as employee, m.last_name as manager
from employees e, employees m
where e.manager_id = m.employee_id;

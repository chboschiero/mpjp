use me;

select region_name
from regions;

select 7*3; -- se non specifico il "from" si sottintende "from dual" 

select country_name
from countries
where region_id = 1
order by 1 desc;

select concat(last_name, ' ', first_name) as Employee, department_name
from employees join departments
using(department_id);

select concat(last_name, ' ', first_name) as Employee, job_title
from employees join jobs
using(job_id);

select concat(last_name, ' ', first_name) as Employee
from employees join jobs
using(job_id)
where salary = min_salary or salary = max_salary;

select concat(last_name, ' ', first_name) as Employee
from employees join departments using(department_id) join locations using(location_id)
where country_id = 'UK'
order by 1;

select department_name, concat(last_name, ' ', first_name) as Manager
from departments d join employees 
on(d.manager_id = employee_id)
order by 1;

select department_name, concat(last_name, ' ', first_name) as Manager
from departments d left outer join employees m
on(d.manager_id = m.employee_id)
order by 1;

select department_name
from departments
where manager_id is null
order by 1;

select concat(e.last_name, ' ', e.first_name) as Employee, concat(m.last_name, ' ', m.first_name) as Manager
from employees e left outer join employees m
on (e.manager_id = m.employee_id)
order by 1;

select concat(last_name, ' ', first_name) as Employee, Salary, truncate(salary + (salary/100)*8.5, 2) as 'Salary plus', truncate(abs((salary/100)*8.5),2) as 'Delta'
from employees
order by 1; 

select concat(last_name, ' ', first_name) as Employee, abs(datediff(hire_date, curdate())) as 'Hiring Period (days)'
from employees
order by 1;

select concat(last_name, ' ', first_name) as Employee, ifnull(commission_pct, 'no value') as Commission
from employees
order by 1;



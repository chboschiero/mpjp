select max(salary), min(salary), sum(salary), truncate(avg(salary),2)
from employees;

select max(salary), min(salary), sum(salary), truncate(avg(salary), 2)
from employees
group by JOB_ID;

select count(employee_id) as 'Employees Count'
from employees
group by job_id;

select count(employee_id) as 'It_Prog Count'
from employees
where job_id = 'it_prog';

select count(distinct manager_id) as 'Manager Count'
from employees;

select concat(last_name, ' ', first_name) as Employee
from employees
where EMPLOYEE_ID not in (select distinct manager_id from employees where manager_id is not null);

select max(salary) - min(salary) as Delta
from employees;

select max(salary) - min(salary) as Delta
from employees
group by job_id
having Delta != 0;

select min(salary)
from employees
where manager_id is not null
group by MANAGER_ID
having min(SALARY) > 6000;

select Street_address, City, Country_name
from locations join countries
using(country_id);

select concat(last_name, ' ', first_name) as Employee, department_name
from employees left outer join departments
using(department_id);

select concat(last_name, ' ', first_name) as Employee, department_name
from employees join departments using(department_id) join locations using(location_id)
where city = 'Toronto';

select concat(last_name, ' ', first_name) as Employee 
from employees
where HIRE_DATE <  (select hire_date from employees where first_name = 'David' and last_name = 'Lee');

select concat(e.last_name, ' ', e.first_name) as Employee 
from employees e join employees m
on(e.manager_id = m.employee_id)
where e.hire_date < m.hire_date;

select concat(last_name, ' ', first_name) as Employee 
from employees 
where MANAGER_ID = (select manager_id from employees where first_name = 'Lisa' and last_name = 'Ozer')
order by LAST_NAME;

select concat(last_name, ' ', first_name) as Employee 
from employees where DEPARTMENT_ID in (select distinct DEPARTMENT_ID from employees where last_name like '%u%');

select concat(last_name, ' ', first_name) as Employee 
from employees 
where DEPARTMENT_ID = (select DEPARTMENT_ID from departments where DEPARTMENT_NAME = 'Shipping')
order by 1;

select concat(last_name, ' ', first_name) as Employee 
from employees 
where MANAGER_ID = (select EMPLOYEE_ID from employees where LAST_NAME = 'King' and first_name = 'Steven')
order by 1;

use me;







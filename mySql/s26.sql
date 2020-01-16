-- join on 3 tables
select concat(last_name, ' ', first_name) as Employee, city, STREET_ADDRESS
from employees join departments using(department_id)
join locations using(location_id);

-- "classic" 3-way join
select employee_id, city, department_name
from employees e, departments d, locations l
where d.department_id = e.department_id and d.location_id = l.location_id
and DEPARTMENT_NAME = 'Executive';

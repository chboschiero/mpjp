select LAST_NAME, FIRST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
order by last_name, first_name;

select LAST_NAME, FIRST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
where FIRST_NAME = 'David' or FIRST_NAME = 'Peter';

select LAST_NAME, FIRST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
where DEPARTMENT_ID = 60;

select LAST_NAME, FIRST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
where DEPARTMENT_ID = 30 or DEPARTMENT_ID = 50;

select LAST_NAME, FIRST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
where SALARY > 10000;

select LAST_NAME, FIRST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
where SALARY < 4000 or SALARY > 15000;

select LAST_NAME, FIRST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, DEPARTMENT_ID
from employees
where (SALARY < 4000 or SALARY > 15000) and (DEPARTMENT_ID = 50 or DEPARTMENT_ID = 80); 

select LAST_NAME, FIRST_NAME
from employees
where HIRE_DATE like '2005%'; 

select distinct job_id 
from employees
order by job_id asc;

select LAST_NAME, FIRST_NAME
from employees
where COMMISSION_PCT is not null;

select LAST_NAME, FIRST_NAME
from employees
where LAST_NAME like '%a%' or FIRST_NAME like '%a%';

select DEPARTMENT_NAME
from departments;

select STREET_ADDRESS
from locations
where COUNTRY_ID = 'IT';

select FIRST_NAME, LAST_NAME, HIRE_DATE
from employees
where LAST_NAME like '_h%' or FIRST_NAME like '_h%'
order by HIRE_DATE asc;

select FIRST_NAME, LAST_NAME, HIRE_DATE
from employees
where LAST_NAME like 'Mc%'
order by HIRE_DATE asc;
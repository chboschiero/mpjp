use me;

-- a select
select region_name -- filtra le colonne
  from regions
 where region_id = 1; -- where filtra le righe

-- select all
select *
from regions;

-- select distinct
select MANAGER_ID
from employees;

-- select with change on results
select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;

-- alias
select job_title, min_salary as original, min_salary salary 
from jobs; -- anche senza "as" SQL capisce che voglio rinominare la colonna, ma è meglio metterlo
select job_title, min_salary, min_salary + 2000 "increased min salary" 
from jobs; -- con gli alias devo mettere il doppio apice per scrivere una stringa

-- dual
select current_date;
select 1+2, 3-4, 2*6, 5/2, current_date
from dual;

-- concatenation
select concat(country_id, "...", region_id, '!' ) as X
from countries;

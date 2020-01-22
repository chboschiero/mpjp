-- create table by select
use me;
create table coders
as
    select employee_id as coder_id, first_name, last_name, hire_date, salary
    from employees
    where department_id = 60;

-- when in doubt, do not run this one
drop table coders;

insert into coders(coder_id, first_name, last_name, hire_date, salary)
values (201, 'Maria', 'Rossi', curdate(), 5000);
insert into coders(coder_id, first_name, last_name, hire_date, salary)
values (202, 'Paolo', 'Bianchi', curdate(), 4500);
update coders set first_name = 'Mariangela' where first_name = 'Maria';
update coders set salary = salary + 500 where salary > 6000;
delete from coders where first_name = 'Paolo' and last_name = 'Bianchi';
commit;

select * from coders;

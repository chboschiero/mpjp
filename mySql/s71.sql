-- trigger

use me;

drop trigger if exists before_update_salary;

delimiter //

create trigger before_update_salary
	before update on coders
    for each row
begin
	set new.salary = round(new.salary, -1);
end;

// delimiter ;

update coders
set salary = salary + 7;

select * from coders;

drop procedure if exists get_coder;

delimiter //

create procedure get_coder(in p_coder_id integer, out p_first_name varchar(20))
begin
select first_name into p_first_name from coders where coder_id = p_coder_id;
end;

// delimiter ;

call get_coder(103, 'Chiara');

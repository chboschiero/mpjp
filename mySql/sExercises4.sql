use me;
drop procedure if exists tomorrow;

delimiter //

create procedure tomorrow(in p_first_name varchar(20))
begin
	select p_first_name as Name, date_add(curdate(), interval 1 day) as 'Tomorrow Date';
end;

// delimiter ;

call tomorrow('Ciro');

drop procedure if exists get_coder;

delimiter //

create procedure get_coder(in p_coder_id integer, out p_first_name varchar(20), out p_last_name varchar(20))
begin
select first_name, last_name into p_first_name, p_last_name from coders where coder_id = p_coder_id;
end;

// delimiter ;

call get_coder(103, @first, @last);

select @first, @last;




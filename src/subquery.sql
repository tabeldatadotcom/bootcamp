-- select * from jobs;
-- select min(min_salary) from jobs where job_ids in ('AD_PRES', 'IT_PROG', 'SA_REP', 'SH_CLERK');

-- single value subquery
select 
	first_name, 
	last_name 
from employees where 
salary > (
	select 
		min(min_salary) 
	from jobs 
	where job_ids in ('AD_PRES', 'IT_PROG', 'SA_REP', 'SH_CLERK')
);

-- select multiplerow return
select 
	first_name, 
	last_name, 
	salary
from employees where 
salary in (
	select 
		min_salary 
	from jobs 
	where job_ids in ('AD_PRES', 'IT_PROG', 'SA_REP', 'SH_CLERK')
);
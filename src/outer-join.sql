-- k = 107
-- d = 28

-- menggunakan join outer right
select 
	d.manager_id as d_kode, 
	d.department_name as d_name,
	k.employee_id as k_emp_id, 
	k.department_id as k_dep_id
from departments d right outer join employees k on d.manager_id = k.employee_id;

-- menggunakan join outer left
select 
	d.manager_id as d_kode, 
	d.department_name as d_name,
	k.employee_id as k_emp_id, 
	k.department_id as k_dep_id
from departments d left outer join employees k on d.manager_id = k.employee_id;

-- select count(*) from departments; 
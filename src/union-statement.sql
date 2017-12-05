select 
	kode, nama, kode_manager 
from divisi
union 
select 
	department_id as kode, 
	department_name as nama, 
	manager_id as kode_manager 
from departments
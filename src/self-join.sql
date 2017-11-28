select 
	empl.employee_id as kode_karyawan, 
	empl.first_name as nama_karyawan, 
	mgr.first_name as nama_manager
from 
	employees empl join 
	employees mgr on empl.manager_id = mgr.employee_id
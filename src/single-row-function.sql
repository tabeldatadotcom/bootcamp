-- menggunakan single row function contohnya concat, coalesce, div dll
select 
	employee_id as kode_karyawan,
	concat(first_name, ' ', last_name) as nama_lengkap,
	coalesce(
		div(salary, commission_pct),
		0
	) as gaji_bagi_komisi
from employees;
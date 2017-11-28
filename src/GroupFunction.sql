-- menggunakan fungsi group function contohnya, count, sum, avg
select 
	count(*) as jumlah_karyawan, 
	sum(salary + coalesce(commission_pct, 0)) as jumlah_gaji_total, 
	avg(salary) as rata_gaji
from employees where job_id = 'IT_PROG';

-- select salary from employees where job_id = 'IT_PROG';
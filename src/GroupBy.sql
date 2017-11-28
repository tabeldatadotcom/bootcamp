-- mengkategorikan data dengan group by
select 
	job_id as kode_jabatan,  
	count(*) as "Jumlah Karyawan", 
	sum(salary) as jumlah_gaji 

from employees group by job_id
order by kode_jabatan;

-- menggunakan group by with having
select 
	job_id as kode_jabatan,  
	commission_pct,
	count(*) as "Jumlah Karyawan", 
	sum(salary) as jumlah_gaji
from employees 
group by job_id, commission_pct
having job_id = 'SA_MAN' and commission_pct = 0.20
order by kode_jabatan;

select 
	job_id as kode_jabatan,  
	commission_pct,
	count(*) as "Jumlah Karyawan", 
	sum(salary) as jumlah_gaji,
	sum(power(2,2)) as hitung
from employees 
group by job_id, commission_pct
having job_id = 'SA_MAN'
order by kode_jabatan;
-- select count(*) from employees where job_id = 'AC_ACCOUNT';
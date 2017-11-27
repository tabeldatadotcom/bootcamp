-- menggunakan operasi matematika dalam sql
select  job_id as kode_jabatan,
	job_title, 
	min_salary, 
	max_salary ,
	to_char(
	   ((min_salary + max_salary) / 2), '99999'
	) rata_rata
from jobs;
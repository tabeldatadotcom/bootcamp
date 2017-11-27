-- logika dengan equality
select * 
from jobs 
where 
  min_salary = 15000;

-- logika dengan and
select * 
from jobs 
where 
  min_salary > 8200 and job_id = 'IT_PROG';

-- logika dengan or
select * 
from jobs 
where 
  min_salary > 8200 or job_id = 'IT_PROG';

-- klausa like dengan single karakter
select * from jobs where job_id like '_A%';

-- klausa like dengan multi karakter
select * from jobs where job_id like 'A%';
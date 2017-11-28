-- condional expresion atau if-else
select 
	commission_pct as komisi, 
	case when commission_pct is null then 'tidak punya komisi!' 
	     else
		case when salary <= 10000 then 'Gaji untuk pegawai tetep'
		else 'Gaji untuk Dewan'	end 
	end as "Pendapatan Komisi", 
	salary as "Gaji sebulan"
from employees;
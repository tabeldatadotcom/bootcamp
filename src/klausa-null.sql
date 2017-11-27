-- menampilkan daftar department yang ada managernya
select * from departments where manager_id is not null;

-- menampilkan daftar department yang tidak memiliki manager
select * from departments where manager_id is null;
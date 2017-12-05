alter table divisi
add constraint fk_divis_employees foreign key (kode_manager)
references employees(employee_id) 
on update cascade on delete cascade;
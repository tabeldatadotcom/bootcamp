create table divisi(
	kode integer primary key,
	nama character varying(150) not null unique,
	kode_manager integer,
	last_update timestamp,
	created_date date default now(),
	aktif boolean default true,
	avg_salary decimal(8, 2) default 0,
	avg_komisi double precision default 0.1
);
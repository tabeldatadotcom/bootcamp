/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  dimmaryanto93
 * Created: Dec 7, 2017
 */

create table kredit(
id serial primary key,
nama character varying(50) not null,
tenor integer not null default 0,
pinjam decimal not null default 0);

create table jadwal(
id serial primary key,
kredit_id integer references kredit(id),
jadwal_bayar date not null,
cicilan decimal not null default 0);
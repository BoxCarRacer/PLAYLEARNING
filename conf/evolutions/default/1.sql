# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tasks222 (
  id                        bigint not null,
  name                      varchar(255),
  done                      boolean,
  label                     varchar(255),
  constraint pk_tasks222 primary key (id))
;

create sequence tasks222_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists tasks222;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists tasks222_seq;


drop table boards;

create table boards(
  bno int not null primary key auto_increment,
    title varchar(255) not null,
    content text not null,
    cre_dt datetime not null,
    view_cnt int default 0
);

insert into boards(title, content, cre_dt)
values ('1111', 'xxxx', now());
insert into boards(title, content, cre_dt)
values ('2222', 'xxxx', now());
insert into boards(title, content, cre_dt)
values ('3333', 'xxxx', now());
insert into boards(title, content, cre_dt)
values ('4444', 'xxxx', now());
insert into boards(title, content, cre_dt)
values ('5555', 'xxxx', now());

select * from boards;

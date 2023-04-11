
use tryperfume;
drop table if exists etc;
 create table etc(
ename varchar(20) not null primary key,
cate varchar(20) not null,
ebrand varchar(20) not null,
emoney int not null,
edes varchar(80) not null,
esmell varchar(50) not null,
egram varchar(10) not null,
epicmain varchar(60) not null,
epicsub1 varchar(50),
epicsub2 varchar(50),
epicsub3 varchar(50)
);

insert into etc values("취 핸드크림 사찰",'Hand Cream', 'Chi', 12000,'고즈넉한 사찰의 공기를 사찰향으로 느껴보세요','Cedarwood, Tobacco, Balsam','50ml','chihand.jpg','chihand1.jpg','chihand2.jpg','chihand3.jpg');
insert into etc values('한율 어린쑥 자연을 닮은 디퓨저','Diffuser','한율',32000,'싱그러운 어린쑥 향으로 채우는 향기로운 나만의 공간','Wormwood','90ml','hanyul.jpg','hanyul1.png','hanyul2.jpg',null);
insert into etc values('취 퍼퓸 디퓨저 대나무','Diffuser','Chi',30000,'방 안에 은은하게 퍼지는 대나무의 상쾌하고 푸른 향','Green, Windfresh Bamboo','100ml','chi.jpg','chi1.jpg','chi2.jpg','chi3.jpg');
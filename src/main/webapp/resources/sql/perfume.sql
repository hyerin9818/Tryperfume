charset utf-8;
use tryperfume;
drop table if exists perfume;
create table perfume(
pname varchar(20) not null primary key,
pbrand varchar(20) not null,
pmoney int not null,
pdes varchar(80) not null,
psmell varchar(60) not null,
pgram varchar(10) not null,
ppicmain varchar(50) not null,
ppicsub1 varchar(50),
ppicsub2 varchar(50),
ppicsub3 varchar(50)
);

insert into perfume values('페르소나 퍼퓸 피오니 워크','줄라이미',49000,'사랑의 시작을 알리는 설렘의 서사','Pink Pepper, Peony, Musk, Cedarwood','50ml','julymeflo.png','julymeflo1.png','julymeflo2.jpg',null);
insert into perfume values('포맨트 시그니처 퍼퓸 벨벳허그','FORMENT',49000,'레드 애플의 달콤한 향취 속 작약꽃과 핑크 로즈의 실키하고 크리미한 뉘앙스가 더해진 몽환적인 벨벳의 향','Red Apple, Peony, Pink rose, Velvet, Musk','50ml','formentvelvet.jpg','formentvelvet1.png','formentvelvet2.png','formentvelvet3.jpg');
insert into perfume values('LMTQ 프리지아 퍼퓸 ','LOMANTIQUE',29900,'당신의 로맨틱한 하루를 위하여','European pears, Freesia, Musk','50ml','lomentiquefreesia.jpg','lomentiquefreesia1.png','lomentiquefreesia2.png',null);
insert into perfume values('포맨트 시그니처 퍼퓸 코튼 딜라잇부케','FORMENT',49000,'루바브와 은방울꽃의 싱그러움 너머로, 핑크 프리지아와 로즈의 활짝 피어난 꽃잎이 내뿜는 생생한 아름다움을 담은 향기를 선사합니다','Pink Freesia, Rose, Jasmine, Musk','50ml','formentflo.jpg','formentflo1.png','formentflo2.jpg',null);
insert into perfume values('스위티구르망 여자 니치향수','에르게니아',42000,'강하지 않은 부드러운 봄의 작은 정원의 향','Mandarine, Peach, Vanilla','50ml','argenia.jpg','argenia1.png',null,null);
insert into perfume values('이노센트 타임 오드뚜왈렛',"L'air DE SAVON",35000,'달달함이 묻어나는 설렘 가득한 향기','Green Apple, Cassis, Muguet, ','50ml','lairdesavon.jpg','lairdsavon1.png','lairdsavon2.jpg',null);
insert into perfume values('오 드 퍼퓸 뮬','AOZ',46000,'아쿠아 계열과 베티버, 쟈스민, 그린 노트의 조합이 청량한 향','Mandarin, Waterym Green','50ml','aozmull.jpg','aozmull1.png','aozmull2.jpg',null);
insert into perfume values('클린 퓨어솝 EDP','클린',39000,'마음이 편안해지는 산뜻한 비누향','Aldehyde, Cyclamen, Musk ','30ml','cleanpuresoap.jpg','cleanpuresoap1.png','cleanpuresoap2.jpg',null);

insert into perfume values('로에 신시어 우드','로에',36000,'생명력이 가득한 깊은 숲의 풍경','Fresh Pine Leaves, Dewy Cypress Wood, Soft sandalwood','50ml','loesincerewood1.png','loesincerewood.png',null,null);
insert into perfume values('에이딕트 보이드 우드','에이딕트',59000,'웅장한 숲 속, 푸릇한 잎들이 가득 우거진 나무들 사이로 부는 바람의 그윽한 우드의 향취','Greenleaf, Jasmine, Cedarwood','50ml','addictvoidwood1.png','addictsincerevoidwood.png',null,null);
insert into perfume values('페르소나 소일 베이크드','줄라이미',46000,'비 오는 숲속 정원의 향기','Bargamot, Cypress, Amber','50ml','personasoilbaked1.jpg','personasoilbaked.png',null,null);
insert into perfume values('그라펜 타투 퍼퓸 원우드','그라펜',37000,'인적이 드문 깊은 숲 속, 비가 내린 후 고요한 적막에 쌓인 오두막의 편안함을 담았습니다','Rosebuds, Saffron, Vetiver','50ml','grafentattooperfumeonewood1.jpg','grafentattooperfumeonewood.png',null,null);
insert into perfume values('클린 소프트 런드리','클린',39000,'신선한 봄바람과 따스한 햇빛에 잘 말려 뽀송하고 폭신한 빨래의 깨끗하고 상쾌한 향','Bargamot, Pear, Jasmine','30ml','cleansoftlaundry1.jpg','cleansoftlaundry.png','cleansoftlaundry2.png',null);
insert into perfume values('클린 웜코튼','클린',28000,'갓 세탁한 섬유에서 나는 뽀송뽀송하고 포근한 향','Verbena, Orangeflower, Musk','30ml','cleanwarmcotton1.jpg','cleanwarmcotton.png',null,null);
insert into perfume values('포멘트 시그니처 퍼퓸 코튼허그','FORMENT',39000,'공기중에 퍼지는 뮤게의 깨끗함과 머스크의 부드러움','Muget, Rose, Musk','50ml','formentsignatureperfumecottonhug1.jpg','formentsignatureperfumecottonhug.png','formentsignatureperfumecottonhug2.jpg',null);
insert into perfume values('그라펜 타투 퍼퓸 레몬','그라펜',37000,'반짝이는 햇살을 타고 온 상쾌한 바람의 싱그러우면서도 포근한 향기','Lemon, Orchid, Rose','50ml','grafentattooperfumelemon1.jpg','grafentattooperfumelemon.png',null,null);
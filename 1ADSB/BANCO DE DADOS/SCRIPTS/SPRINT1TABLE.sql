create database sprint1;
use sprint1;


-- Primeira tabela
CREATE TABLE Professor (
idProfessor int primary key auto_increment,
nome varchar(50),
sobrenome varchar(30),
especialidade1 varchar(40),
especialidade2 varchar(40)
);
desc professor;

insert into Professor values
(null,'Vivian','Silva','Banco de Dados','programaçao'),
(null,'Thiago','Bonacelli','Documentaçao','XGH'),
(null,'Fernando','Brandão','sprints','Apresentaçao'),
(null,'Eduardo','Verri','Arduino','Binario'),
(null,'Thiago','Gomes','interpessoal','Organizaçao'),
(null,'Claudio','Frezza','Matematica','vscode');

select * from Professor;



-- Segunda Tabela
create table Disciplina (
idDisciplina int primary key auto_increment,
Disciplina varchar(45)
);

insert into Disciplina values
(null, 'Banco de Dados'),
(null, 'Algoritimo'),
(null, 'Pesquisa e Inovaçao'),
(null, 'Socioemocional'),
(null, 'Arq. Comp.');

select * from Disciplina;

desc Professor;
desc Disciplina;


-- add chave estrangeira
ALTER TABLE Professor ADD column fkDisc int;

ALTER TABLE Professor add foreign key (fkDisc)
	references Disciplina (idDisciplina);


-- updates na chave estrangeira
UPDATE Professor SET fkDisc = '1' WHERE idProfessor = '1';
UPDATE Professor SET fkDisc = '4' WHERE idProfessor = '2';
UPDATE Professor SET fkDisc = '3' WHERE idProfessor = '3';
UPDATE Professor SET fkDisc = '5' WHERE idProfessor = '4';
UPDATE Professor SET fkDisc = '4' WHERE idProfessor = '5';
UPDATE Professor SET fkDisc = '2' WHERE idProfessor = '6';


-- comandos pedidos


-- Exibir os professores e suas respectivas disciplinas;
SELECT nome, Disciplina FROM Professor
 join Disciplina on Disciplina.idDisciplina = Professor.fkDisc;
 
 
 -- Exibir apenas o nome da disciplina e o nome do respectivo professor;
 SELECT nome, Disciplina FROM Professor
 join Disciplina on Disciplina.idDisciplina = Professor.fkDisc
 where disciplina like 'Socioemocional';
 
 
 -- Exibir os dados dos professores, suas respectivas disciplinas de um determinado sobrenome;
 SELECT * FROM Professor
 join Disciplina on Disciplina.idDisciplina = Professor.fkDisc
 where sobrenome like 'Bonacelli';
 

--  Exibir apenas a especialidade1 e o nome da disciplina, de um determinado 
-- professor, ordenado de forma crescente pela especialidade1;
 SELECT especialidade1, Disciplina FROM Professor
 join Disciplina on Disciplina.idDisciplina = Professor.fkDisc
 where nome like 'Claudio' order by especialidade1 desc;


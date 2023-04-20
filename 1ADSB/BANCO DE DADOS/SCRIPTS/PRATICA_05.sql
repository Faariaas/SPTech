-- EXERCICIO 1 == LINHA 7
-- EXERCICIO 2 == LINHA 86
-- EXERCICIO 3 == LINHA 152

-- DESCULPE PROFESSORA ME ATRAPALHEI NA 3 E ACABEI PERDENDO MUITO TEMPO

-- ----------EXERCICIO 1------------------------------ --
CREATE DATABASE Pratica5_Ex1;
USE Pratica5_Ex1;


-- ----------TABELA CLIENTE------------------------------ --
CREATE TABLE Cliente (
idCliente INT PRIMARY KEY AUTO_INCREMENT,
NomeDono VARCHAR(45),
TelFixo CHAR(10),
TelCelular CHAR(11),
Endereço VARCHAR(300)
);

ALTER TABLE CLIENTE MODIFY COLUMN TelFixo CHAR(13);
ALTER TABLE CLIENTE MODIFY COLUMN TelCelular CHAR(14);

SELECT * FROM CLIENTE;

DESC CLIENTE;

-- ----------INSERTS------------------------------ --
INSERT INTO Cliente (NomeDono, TelFixo, TelCelular, Endereço) VALUES
		('Gabriel Farias','(11)5891-4020','(11)95125-8464','Rua Domingos Afonso Sertão');
INSERT INTO Cliente (NomeDono, TelFixo, TelCelular, Endereço) VALUES
        ('Caludia Farias','(11)5891-1330','(11)98340-1987','Rua Domingos Afonso Sertão'),
        ('Guilherme Bossert','(11)5891-4022','(11)95522-2000','Rua Estevao Farnandes'),
        ('Gabriele Borges','(11)5525-3021','(11)94107-1999','Rua Interlagos'),
        ('Cleuza de Oliveira','(11)4002-8922','(11)98321-4012','Parque Fernanda');


-- ----------TABELA PET------------------------------ --
CREATE TABLE Pet (
idPet INT PRIMARY KEY AUTO_INCREMENT,
Nome VARCHAR(50),
Tipo VARCHAR(50),
Raça VARCHAR(50),
dtNasc DATE,
FkCliente INT NOT NULL,
FOREIGN KEY (FkCliente) REFERENCES Cliente(idCliente)
);

ALTER TABLE Pet AUTO_INCREMENT = 100;

SELECT * FROM PET;

-- ----------INSERTS------------------------------ --
INSERT INTO pet (Nome, Tipo, Raça, dtNasc, FkCliente) VALUES
		('Zulu','Cachorro','Labrador','2009-03-21','1');
INSERT INTO pet (Nome, Tipo, Raça, dtNasc, FkCliente) VALUES
		('Negão','Cachorro','SRD','2005-07-02',1),
        ('Kiko','Gato','Siames','2005-12-22',2),
        ('Shiwi','Cachorro','Husk','2021-07-25',3),
        ('Megan','Cavalo','Puro-sangue','1978-03-31',5),
        ('Nina','Gato','Siames','2005-12-22',2),
        ('Hawk','Porco','Catador-de-restos','2022-04-02',3);

-- ----------COMANDOS EXERCICIOS 1------------------------------ --
SELECT * FROM PET;
SELECT * FROM CLIENTE;
ALTER TABLE CLIENTE MODIFY COLUMN NomeDono VARCHAR(80);
SELECT * FROM PET WHERE Tipo = 'CACHORRO';
SELECT Nome, dtNasc FROM Pet;
SELECT * FROM Pet ORDER BY Nome;
SELECT * FROM CLIENTE ORDER BY Endereço;
SELECT * FROM Pet WHERE Nome LIKE 'z%';
SELECT * FROM Cliente WHERE NomeDono LIKE '%Faria%';
UPDATE Cliente SET TelFixo='(11)5891-1212' WHERE idCliente=1;
SELECT * FROM CLIENTE;
SELECT * FROM Pet 
JOIN Cliente ON pet.idPet = cliente.idCliente;
SELECT * FROM Pet 
JOIN cliente ON pet.fkcliente = cliente.idCliente WHERE NomeDono = 'Gabriel Farias';
DELETE FROM pet WHERE idPet = '104';
DROP TABLE CLIENTE, PET;


-- --------------------------------------------------- --
-- --------------------------------------------------- --
-- ----------EXERCICIO 2------------------------------ --
CREATE DATABASE Pratica5_Ex2;
USE Pratica5_Ex2;


-- ----------TABELA PESSOA------------------------------ --
CREATE TABLE Pessoa (
idPessoa INT PRIMARY KEY AUTO_INCREMENT,
Nome VARCHAR(45),
dtNasc DATE,
Profissão VARCHAR(45)
);

SELECT * FROM Pessoa;

-- ----------INSERTS------------------------------ --
INSERT INTO Pessoa (Nome, dtNasc, Profissão) VALUES
		('Gabriel Farias Santos','1999-03-22','Analista');
INSERT INTO Pessoa (Nome, dtNasc, Profissão) VALUES
		('Thalita Pitondo','2000-07-23','Admnistradora'),
        ('Guilherme Bossert','2000-08-25','Marketing'),
        ('Bruno Paiva','2001-03-15','Tenente'),
        ('Jonatas Emanuel','1996-03-23','Cabelereiro');
        
        
-- ----------TABELA GASTOS------------------------------ --
CREATE TABLE Gastos (
idGastos INT PRIMARY KEY AUTO_INCREMENT,
Dt Date,
Valor VARCHAR(45),
Descrição VARCHAR(500),
FkPessoa INT NOT NULL,
FOREIGN KEY (FkPessoa) REFERENCES Pessoa(idPessoa)
);

SELECT * FROM GASTOS;

-- ----------INSERTS------------------------------ --
INSERT INTO Gastos (dt, valor, descrição, fkPessoa) VALUES
		('2022-04-05','R$120,00','Recarga de Bilhete unico',1);
INSERT INTO Gastos (dt, valor, descrição, fkPessoa) VALUES
        ('2022-03-07','R$120,00','Recarga de Bilhete unico',1),
        ('2022-03-26','R$780,00','Role no Outback',3),
        ('2022-03-22','R$150,00','Leite Mucilon',2),
        ('2022-04-04','R$490,00','1 litro de Gasolina da moto',4),
        ('2022-03-25','R$99,99','Maquina nova de cortar cabelo',5),
        ('2022-03-22','R$4950,60','GTX 3090TI',3);
        
SELECT * FROM GASTOS;

-- ----------COMANDOS EXERCICIOS 2------------------------------ --
SELECT * FROM Pessoa;
SELECT * FROM GASTOS;
SELECT concat('A Pessoa de nome ',nome,' trabalha como ', Profissão) AS Nome_Profissão FROM Pessoa;
SELECT * FROM Pessoa 
JOIN Gastos ON Pessoa.idPessoa = Gastos.idGastos;
SELECT * FROM Pessoa 
JOIN Gastos ON Pessoa.idPessoa = Gastos.idGastos WHERE nome = 'Thalita Pitondo';
UPDATE Gastos SET valor = 'R$180,00' WHERE idGastos=2;
DELETE FROM Gastos WHERE idGastos = 1;
DROP TABLE Pessoa, Gastos;



-- --------------------------------------------------- --
-- --------------------------------------------------- --
-- ----------EXERCICIO 3------------------------------ --
CREATE DATABASE Pratica5_Ex3;
USE Pratica5_Ex3;


-- ----------TABELA SETOR------------------------------ --
CREATE TABLE Setor (
idSetor INT PRIMARY KEY AUTO_INCREMENT,
NomeSetor VARCHAR(45),
Andar VARCHAR(45)
);

SELECT * FROM SETOR;

-- ----------INSERTS------------------------------ --
INSERT INTO Setor (NomeSetor, Andar) VALUES
		('MARKETING','25º');
INSERT INTO Setor (NomeSetor, Andar) VALUES
		('RH','1º'),
        ('TI','24º'),
        ('COZINHA','2º'),
        ('SALA DO CHEFE','26º'),
        ('CONSULTORIA','13º');
        
SELECT * FROM SETOR;


-- ----------TABELA FUNCIONARIOS------------------------------ --
CREATE TABLE Funcionarios (
idFuncionario INT PRIMARY KEY AUTO_INCREMENT,
NomeFuncionario VARCHAR(45),
Telefone CHAR(14),
Salario VARCHAR(45),
fk_Setor INT,
foreign key (fk_Setor) references Setor(idSetor)
);

ALTER TABLE Funcionarios ADD CONSTRAINT `fkAcompanhante`
FOREIGN KEY (fkAcompanhante) REFERENCES Acompanhante(idAcompanhante);

ALTER TABLE FUNCIONARIOS AUTO_INCREMENT = 01221000;

SELECT * FROM FUNCIONARIOS;
DROP TABLE FUNCIONARIOS;
-- ----------INSERTS------------------------------ --
INSERT INTO Funcionarios (NomeFuncionario, Telefone, Salario, fk_Setor) VALUES
		('Guilherme Bossert','(11)95214-7855','R$1500,00',1),
        ('Thalita Pitondo','(11)95213-3457','R$7890,00',6),
        ('Gabriel Farias','(11)91209-2198','R$23498,60',5),
        ('Bruno Paiva','(11)96094-5763','R$900,00',4),
        ('Gabriel Lima','(11)91478-5908','R$6000,00',3),
        ('Raul Chan','(11)91298-5355','R$2348,60',1),
		('Jorge Romero','(11)94345-1287','R$3900,00',3),
        ('Pericles Exaltassamba','(11)96344-1257','R$25043,00',5),
        ('Thiaguinho do Pagode','(11)96756-9083','R$2500,00',6),
        ('Dilsinho da Sofrencia','(11)96213-4982','R$900,00',4);
        


-- ----------TABELA ACOMPANHANTES------------------------------ --
CREATE TABLE Acompanhante (
idAcompanhante INT AUTO_INCREMENT,
NomeAcom VARCHAR(45),
Relação VARCHAR(45),
dtNasc DATE,
fkFuncionario INT,
FOREIGN KEY (fkFuncionario) REFERENCES Funcionarios(idFuncionario),
CONSTRAINT PRIMARY KEY(idAcompanhante, fkFuncionario)
);
ALTER TABLE ACOMPANHANTE AUTO_INCREMENT = 01221000;
DESC ACOMPANHANTE;
DROP TABLE ACOMPANHANTE;
SELECT * FROM ACOMPANHANTE;
-- ----------INSERTS------------------------------ --
INSERT INTO Acompanhante (NomeAcom, Relação, dtNasc, fkFuncionario) VALUES
		('Carla Dias','Prima','2004-12-31',1221000),
        ('Geh','Namorada','1995-02-25',12221005),
        ('Manoela Garcia','"Amiga"','2002-03-15',1221003),
        ('Ban Nanatsu','Guarda-costas','1703-03-22',1221002),
        ('Emanuele Gonzaga','Acompanhante','1998-05-21',1221004),
        ('Peter Parker','Baterista','2001-04-05',1221007),
        ('Sidney Magal','Amigo','1956-09-31',1221001),
        ('Ash Ketchun','Parceiro','2012-03-22',1221006),
        ('Ivete Leite','Amiga','1988-07-29',1221008),
        ('Ben Tennison','Primo','1987-10-17',1221009);
        
create database Ceres;
use Ceres;


-- DONO --
create table Dono(
idDono int primary key auto_increment,
nome varchar(45),
email varchar (45),
cpf char (14),
senha varchar(20)
);

insert into Dono values 
	(null, 'Luis Carlos', 'luiscarlos@email.com', '672.240.546-77','lu23455654'),
	(null,'Robert Gomes', 'robertgomes@email.com', '543.870.976-53','beto9878877328'),
	(null, 'Andreia Silva', 'andreiasilva@email.com', '325.678.675-98', 'andsilva334567');
                        
select * from Dono;


-- EMPRESA --
create table Empresa(
idEmpresa int primary key auto_increment,
cnpj char(18),
nome varchar(45),
fkDono int, foreign key (fkDono) references Dono(idDono)
);

insert into Empresa values 
	(null, '00.028.166/0002-88', 'BrasCana',1),
	(null, '78.989.344/9882-65', 'AgroVerd',2),
	(null, '09.877.876/5835-89', 'Petrobrás',3);
                           
select * from Empresa;
                           

-- LOGRADOURO --
create table Logradouro(
idLogradouro int primary key auto_increment,
estado char(2),
cidade varchar(45),
rua varchar(45),
complemento varchar(45),
bairro varchar(45),
cep char(9),
fkEmpresa int, foreign key (fkEmpresa) references Empresa(idEmpresa)
);

insert into Logradouro values 
	(null,'TO', 'Alvorada','Rua São Caetano do Sul',987,'Tarapuá','1276-988',1),
	(null,'MG', 'Uberaba', 'Rua São José', 638, 'Riviera Mineira', '14015-040',2),
	(null,'SP', 'Campos do Jordão', 'Rua Sete de Setembro', 442, 'Tatuapé', '14015-040',3);

select * from Logradouro;


-- SENSOR --
create table Sensor(
idSensor int primary key auto_increment,
temperatura double,
umidade double,
dataSensor datetime,
fkEmpresa int, foreign key (fkEmpresa) references Empresa(idEmpresa)
);

insert into Sensor values 
	(null, 22.99, 85.11, '2019-09-11 09:12:04',1),
	(null, 20.89, 45.59,'2019-06-22 15:56:59',2),
	(null, 21.78, 82.99, '2019-04-18 05:15:45',3);
                          
select * from Sensor;


-- PLANTAÇAO --
create table Plantacao(
idPlantacao int primary key auto_increment,
fkSensor int, foreign key (fkSensor) references Sensor(idSensor),
fkEmpresa int, foreign key (fkEmpresa) references Empresa(idEmpresa)
);

insert into Plantacao values 
	(null,1,1),
	(null,2,2),
	(null,3,3);
    

-- SOLICITAÇÃO --
create table Solicitacao(
idSolicitacao int primary key auto_increment,
statusSolicitacao char(5),
fkEmpresa int, foreign key (fkEmpresa) references Empresa(idEmpresa)
);

SELECT * FROM solicitacao;

-- SELECTS --
SELECT * FROM dono;
SELECT * FROM empresa;
SELECT * FROM sensor;
SELECT * FROM plantacao;
SELECT * FROM solicitacao;


-- JOINS --
SELECT dono.nome,email, empresa.nome AS nome_empresa FROM dono
JOIN empresa ON dono.idDono = empresa.idEmpresa;

SELECT empresa.nome AS Nome_empresa, concat("temperatura de:",temperatura,", umidade de:",umidade) AS sensores FROM sensor
JOIN empresa ON empresa.idEmpresa = sensor.idsensor;

SELECT plantacao.idplantacao AS Plantação, empresa.cnpj AS 'CNPJ da empresa' FROM empresa
JOIN plantacao ON empresa.idempresa = plantacao.idPlantacao;

SELECT plantacao.idplantacao AS Plantação, concat('sensor ',idsensor,' Temperatura: ',temperatura,' umidade ',umidade) AS 'Dados dos sensores' FROM plantacao
JOIN sensor ON sensor.idsensor = plantacao.idplantacao;
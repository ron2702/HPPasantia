CREATE USER JoseFelixGonzalez PASSWORD 'josefelix2110';
ALTER ROLE JoseFelixGonzalez WITH SUPERUSER;
CREATE DATABASE HenriPittier WITH OWNER JoseFelixGonzalez;

CREATE TABLE LUGAR(
	CODIGO 					SERIAL,
	TIPO 					VARCHAR(50) NOT NULL,
	NOMBRE 					VARCHAR(80) NOT NULL,
	FK_LUGAR				INTEGER,
	CONSTRAINT PK_LUGAR PRIMARY KEY (CODIGO)
);

CREATE TABLE REPRESENTANTE(
	CEDULA 					INTEGER,
	PRIMERNOMBRE			VARCHAR(30) NOT NULL,
	SEGUNDONOMBRE			VARCHAR(30),
	PRIMERAPELLIDO			VARCHAR(30) NOT NULL,
	SEGUNDOAPELLIDO 		VARCHAR(30),
	FECHANAC				DATE,
	TELEFONOCASA			VARCHAR(11),
	TELEFONOMOVIL			VARCHAR(11),
	TIPO					VARCHAR(17) NOT NULL,
	FOTO					VARCHAR(100) NOT NULL,
	FK_LUGAR 				INTEGER,
	CONSTRAINT CH_TIPO CHECK (TIPO in('Autorizado','Representante')),
	CONSTRAINT PK_REPRESENTANTE PRIMARY KEY(CEDULA)	
);

CREATE TABLE EMPLEADO(
	CEDULA 					INTEGER,
	PRIMERNOMBRE 			VARCHAR(30) NOT NULL,
	SEGUNDONOMBRE			VARCHAR (30),
	PRIMERAPELLIDO 			VARCHAR(30) NOT NULL,
	SEGUNDOAPELLIDO			VARCHAR(30),
	BANCO 					VARCHAR(30) NOT NULL,
	SUELDOMENSUAL 			INTEGER NOT NULL,
	FECHAINGRESO 			DATE NOT NULL,
	FECHANAC 				DATE NOT NULL,
	TELEFONOCASA 			VARCHAR(11),
	TELEFONOMOVIL 			VARCHAR(11),
	CARGO 					VARCHAR(30) NOT NULL,
	FOTO 					VARCHAR(100) NOT NULL,
	NOMBREUSUARIO			VARCHAR(50),
	CONTRASENA				VARCHAR(80),
	FK_LUGAR 				INTEGER NOT NULL,
	CONSTRAINT PK_EMPLEADO PRIMARY KEY (CEDULA)
);

CREATE TABLE ESTUDIANTE(
	CEDULAESCOLAR 			INTEGER,
	PRIMERNOMBRE			VARCHAR(30) NOT NULL,
	SEGUNDONOMBRE			VARCHAR(30),
	PRIMERAPELLIDO			VARCHAR(30) NOT NULL,
	SEGUNDOAPELLIDO 		VARCHAR(30),
	FECHANAC				DATE NOT NULL,
	FOTO					VARCHAR(100) NOT NULL,
	CONSTRAINT PK_ESTUDIANTE PRIMARY KEY(CEDULAESCOLAR)
);

CREATE TABLE GRUPO(
	CODIGO 					VARCHAR(30),
	NOMBRE 					VARCHAR(30) NOT NULL,
	DESCRIPCION 			VARCHAR(30),
	CAPACIDAD 				INTEGER,
	PERIODO 				VARCHAR(50),
	CONSTRAINT PK_GRUPO PRIMARY KEY(CODIGO)
);

CREATE TABLE REP_EST(
	ID 						SERIAL,
	FK_CEDULA 				INTEGER NOT NULL,
	FK_CEDULAESCOLAR 		INTEGER NOT NULL,
	CONSTRAINT PK_REP_EST PRIMARY KEY(ID)
);

CREATE TABLE EMP_GRU_EST(
	ID 						SERIAL,
	FK_CEDULA 				INTEGER,
	FK_CEDULAESCOLAR 		INTEGER NOT NULL,
	FK_GRUPO 				VARCHAR(30),
	CONSTRAINT PK_EMP_GRU_EST PRIMARY KEY(ID)
);

CREATE TABLE COMPROBANTE_PAGO(
	ID 						INTEGER,
	FK_EMPLEADO 			INTEGER,
	CONSTRAINT PK_COMPROBANTE_PAGO PRIMARY KEY(ID)
);

CREATE TABLE INASISTENCIA(
	ID						SERIAL,
	DIASFALTADOS			INTEGER NOT NULL,
	MES						VARCHAR(15) NOT NULL,
	ANO 					INTEGER NOT NULL,
	FK_EMPLEADO				INTEGER,
	CONSTRAINT PK_INASISTENCIA PRIMARY KEY(ID)
);

CREATE TABLE SUPLENCIA(
	ID						SERIAL,
	DIASADICIONALES			INTEGER NOT NULL,
	MES						VARCHAR(15) NOT NULL,
	ANO 					INTEGER NOT NULL,
	FK_EMPLEADO				INTEGER,
	CONSTRAINT PK_SUPLENCIA PRIMARY KEY(ID)
);

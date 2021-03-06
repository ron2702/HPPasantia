/***************************************MANEJO DE USUARIOS**************************************/
CREATE OR REPLACE FUNCTION EMPLEADO_INICIARSESION(varchar(50), varchar(15)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM EMPLEADO WHERE NOMBREUSUARIO = $1 AND CONTRASENA = $2) = 0) THEN

		RESULT := 204;
  	
  	ELSE
	
		RESULT := 200;
	
	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


/****************************************CRUD EMPLEADO******************************************/

/*---------------------REGISTRAR EMPLEADO------------------------*/
CREATE OR REPLACE FUNCTION EMPLEADO_REGISTRAR(integer, varchar(30), varchar(30), varchar(30), varchar(30), varchar(20), integer, date, date, varchar(11), varchar(11), varchar(30), varchar(100), varchar(50), varchar(80), varchar(2), varchar(80), varchar(80), varchar(80)) RETURNS integer AS $$
DECLARE
 RESULT integer;
 FK_LUGAR integer;

BEGIN
	IF ((SELECT COUNT(*) FROM EMPLEADO WHERE CEDULA = $1) = 0) THEN

		FK_LUGAR := (SELECT P.CODIGO FROM LUGAR m, LUGAR e, LUGAR p WHERE E.NOMBRE = $17 AND M.NOMBRE = $18 AND P.NOMBRE = $19 AND E.CODIGO = M.FK_LUGAR AND M.CODIGO = P.FK_LUGAR);
		INSERT INTO EMPLEADO (CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, BANCO, SUELDOMENSUAL, FECHAINGRESO, FECHANAC, TELEFONOCASA, TELEFONOMOVIL, CARGO, FOTO, NOMBREUSUARIO, CONTRASENA, TAREASDIRIGIDAS, FK_LUGAR) VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10, $11, $12, $13, $14, $15, $16, FK_LUGAR);
		
		RESULT := 201;
  	
  	ELSE
	
		RESULT := 500;
	
	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*----------------------REGISTRAR EMPLEADO-----------------------*/

/*----------------CONSULTAR TODOS LOS EMPLEADOS-----------------*/
CREATE OR REPLACE FUNCTION EMPLEADO_CONSULTAR_TODOS() RETURNS TABLE(CEDULA integer, PRIMERNOMBRE varchar(30), SEGUNDONOMBRE varchar(30), PRIMERAPELLIDO varchar(30), SEGUNDOAPELLIDO varchar(30), BANCO varchar(20), SUELDOMEN integer, FECHAINGRESO date, FECHANAC date, TELFCASA varchar(11), TELFMOVIL varchar(11), CARGO varchar(30), FOTO varchar(100), USUARIO varchar(50), CLAVE varchar(15), TAREASDIRIGIDAS varchar(2), ESTADO varchar(80), MUNICIPIO varchar(80), PARROQUIA varchar(80)) AS $$
DECLARE

BEGIN
	 RETURN QUERY
	 SELECT EM.CEDULA, EM.PRIMERNOMBRE, EM.SEGUNDONOMBRE, EM.PRIMERAPELLIDO, EM.SEGUNDOAPELLIDO, EM.BANCO, EM.SUELDOMENSUAL, EM.FECHAINGRESO, EM.FECHANAC, EM.TELEFONOCASA, EM.TELEFONOMOVIL, EM.CARGO, EM.FOTO, EM.NOMBREUSUARIO, EM.CONTRASENA, EM.TAREASDIRIGIDAS, E.NOMBRE, M.NOMBRE, P.NOMBRE
	 FROM EMPLEADO EM, LUGAR E, LUGAR M, LUGAR P
	 WHERE EM.FK_LUGAR = P.CODIGO AND P.FK_LUGAR = M.CODIGO AND M.FK_LUGAR = E.CODIGO
	 ;
END;
$$ LANGUAGE plpgsql;
/*----------------CONSULTAR TODOS LOS EMPLEADOS-----------------*/

/*-----------------CONSULTAR EMPLEADOS POR CEDULA-----------------*/
CREATE OR REPLACE FUNCTION EMPLEADO_CONSULTAR_DETALLE(integer) RETURNS TABLE(CEDULA integer, PRIMERNOMBRE varchar(30), SEGUNDONOMBRE varchar(30), PRIMERAPELLIDO varchar(30), SEGUNDOAPELLIDO varchar(30), BANCO varchar(20), SUELDOMEN integer, FECHAINGRESO date, FECHANAC date, TELFCASA varchar(11), TELFMOVIL varchar(11), CARGO varchar(30), FOTO varchar(100), USUARIO varchar(50), CLAVE varchar(15), TAREASDIRIGIDAS varchar(2), ESTADO varchar(80), MUNICIPIO varchar(80), PARROQUIA varchar(80)) AS $$
DECLARE

BEGIN
	RETURN QUERY
	SELECT EM.CEDULA, EM.PRIMERNOMBRE, EM.SEGUNDONOMBRE, EM.PRIMERAPELLIDO, EM.SEGUNDOAPELLIDO, EM.BANCO, EM.SUELDOMENSUAL, EM.FECHAINGRESO, EM.FECHANAC, EM.TELEFONOCASA, EM.TELEFONOMOVIL, EM.CARGO, EM.FOTO, EM.NOMBREUSUARIO, EM.CONTRASENA, EM.TAREASDIRIGIDAS, E.NOMBRE, M.NOMBRE, P.NOMBRE
	FROM EMPLEADO EM, LUGAR E, LUGAR M, LUGAR P
	WHERE EM.FK_LUGAR = P.CODIGO AND P.FK_LUGAR = M.CODIGO AND M.FK_LUGAR = E.CODIGO AND EM.CEDULA = $1		
	 ;
END;
$$ LANGUAGE plpgsql;
/*-----------------CONSULTAR EMPLEADOS POR CEDULA-----------------*/

/*-----------------------MODIFICAR EMPLEADOS-----------------------*/
CREATE OR REPLACE FUNCTION EMPLEADO_MODIFICAR(integer, varchar(30), varchar(30), varchar(30), varchar(30), varchar(20), integer, date, date, varchar(11), varchar(11), varchar(30), varchar(100), varchar(50), varchar(80), varchar(2), varchar(80), varchar(80), varchar(80)) RETURNS integer AS $$
DECLARE
 RESULT integer;
 lugar integer;

BEGIN
	IF ((SELECT COUNT(*) FROM EMPLEADO WHERE CEDULA = $1) = 1) THEN

		lugar := (SELECT P.CODIGO FROM LUGAR m, LUGAR e, LUGAR p WHERE E.NOMBRE = $17 AND M.NOMBRE = $18 AND P.NOMBRE = $19 AND E.CODIGO = M.FK_LUGAR AND M.CODIGO = P.FK_LUGAR);
		UPDATE EMPLEADO SET PRIMERNOMBRE = $2, SEGUNDONOMBRE = $3, PRIMERAPELLIDO = $4, SEGUNDOAPELLIDO = $5, BANCO = $6, SUELDOMENSUAL = $7, FECHAINGRESO = $8, FECHANAC = $9, TELEFONOCASA = $10, TELEFONOMOVIL = $11, CARGO = $12, FOTO = $13, NOMBREUSUARIO = $14, CONTRASENA = $15, TAREASDIRIGIDAS = $16, FK_LUGAR = lugar WHERE CEDULA = $1;
		
		RESULT := 201;
  	
  	ELSE
	
		RESULT := 204;
	
	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*-----------------------MODIFICAR EMPLEADOS-----------------------*/

/*-------------------------BORRAR EMPLEADOS-------------------------*/
CREATE OR REPLACE FUNCTION EMPLEADO_BORRAR(integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM EMPLEADO WHERE CEDULA = $1) = 1) THEN 

		DELETE FROM EMPLEADO WHERE CEDULA = $1;
		
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*-------------------------BORRAR EMPLEADOS-------------------------*/


/****************************************CRUD INASISTENCIA******************************************/

/*------------------REGISTRAR INASISTENCIA--------------------*/
CREATE OR REPLACE FUNCTION INASISTENCIA_REGISTRAR(integer, varchar(15), integer, integer) RETURNS integer AS $$
DECLARE
 RESULT integer;
 INASISTENCIASACTUALES integer;
 INASISTENCIASNUEVAS integer;

BEGIN
	 IF ((SELECT COUNT(*) FROM INASISTENCIA WHERE FK_EMPLEADO = $4 AND MES = $2 AND ANO = $3) >= 1) THEN
	 	
	 	INASISTENCIASACTUALES := (SELECT DIASFALTADOS FROM INASISTENCIA WHERE FK_EMPLEADO = $4 AND MES = $2 AND ANO = $3);
	 	INASISTENCIASNUEVAS := INASISTENCIASACTUALES + $1;
	 	UPDATE INASISTENCIA SET DIASFALTADOS = INASISTENCIASNUEVAS WHERE ((FK_EMPLEADO = $4) AND (MES = $2) AND (ANO = $3));
	  	
	  	RESULT := 201;

	 ELSE

	 	INSERT INTO INASISTENCIA (DIASFALTADOS, MES, ANO, FK_EMPLEADO) VALUES ($1, $2, $3, $4);
	  	
	  	RESULT := 201;

	 END IF;

 	 RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*------------------REGISTRAR INASISTENCIA--------------------*/

/*--------------CONSULTAR INASISTENCIAS X EMPLEADO-------------*/
CREATE OR REPLACE FUNCTION INASISTENCIA_CONSULTAR_DETALLE(integer) RETURNS TABLE(CEDULA integer, DIASFALTADOS integer, MES varchar(15), ANO integer) AS $$
DECLARE

BEGIN
	 RETURN QUERY
	 SELECT INA.FK_EMPLEADO, INA.DIASFALTADOS, INA.MES, INA.ANO
	 FROM INASISTENCIA INA
	 WHERE INA.FK_EMPLEADO = $1		
	 ;
END;
$$ LANGUAGE plpgsql;
/*--------------CONSULTAR INASISTENCIAS X EMPLEADO-------------*/

/*------------MODIFICAR INASISTENCIAS X EMPLEADO---------------*/
CREATE OR REPLACE FUNCTION INASISTENCIA_MODIFICAR(integer, varchar(15), integer, integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM INASISTENCIA WHERE FK_EMPLEADO = $4 AND MES = $2 AND ANO = $3) = 1) THEN
		
		UPDATE INASISTENCIA SET DIASFALTADOS = $1 WHERE ((FK_EMPLEADO = $4) AND (MES = $2) AND (ANO = $3));
		
		RESULT := 201;
  	
  	ELSE
	
		RESULT := 204;
	
	END IF;

 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*------------MODIFICAR INASISTENCIAS X EMPLEADO---------------*/

/*--------------BORRAR INASISTENCIAS X EMPLEADO----------------*/
CREATE OR REPLACE FUNCTION INASISTENCIA_BORRAR(varchar(15), integer, integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM INASISTENCIA WHERE FK_EMPLEADO = $3 AND MES = $1 AND ANO = $2) = 1) THEN

		DELETE FROM INASISTENCIA WHERE ID = (SELECT ID FROM INASISTENCIA WHERE FK_EMPLEADO = $3 AND MES = $1 AND ANO = $2);
		
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*--------------BORRAR INASISTENCIAS X EMPLEADO----------------*/

/****************************************CRUD SUPLENCIA******************************************/
/*------------------REGISTRAR SUPLENCIA--------------------*/
CREATE OR REPLACE FUNCTION SUPLENCIA_REGISTRAR(integer, varchar(15), integer, integer) RETURNS integer AS $$
DECLARE
 RESULT integer;
 SUPLENCIASACTUALES integer;
 SUPLENCIASNUEVAS integer;

BEGIN
	 IF ((SELECT COUNT(*) FROM SUPLENCIA WHERE FK_EMPLEADO = $4 AND MES = $2 AND ANO = $3) >= 1) THEN
		 
		 SUPLENCIASACTUALES := (SELECT DIASADICIONALES FROM SUPLENCIA WHERE FK_EMPLEADO = $4 AND MES = $2 AND ANO = $3);
		 SUPLENCIASNUEVAS := SUPLENCIASACTUALES + 1;
		 UPDATE SUPLENCIA SET DIASADICIONALES = SUPLENCIASNUEVAS WHERE ((FK_EMPLEADO = $4) AND (MES = $2) AND (ANO = $3));

		 RESULT := 201;

	 ELSE

		 INSERT INTO SUPLENCIA (DIASADICIONALES, MES, ANO, FK_EMPLEADO) VALUES ($1, $2, $3, $4);
		 
		 RESULT := 201;

	 END IF;

 	 RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*------------------REGISTRAR INASISTENCIA--------------------*/

/*------------CONSULTAR SUPLENCIAS X EMPLEADO---------------*/
CREATE OR REPLACE FUNCTION SUPLENCIA_CONSULTAR_DETALLE(integer) RETURNS TABLE(CEDULA integer, DIASADICIONALES integer, MES varchar(15), ANO integer) AS $$
DECLARE

BEGIN
	 RETURN QUERY
	 SELECT SU.FK_EMPLEADO, SU.DIASADICIONALES, SU.MES, SU.ANO
	 FROM SUPLENCIA SU
	 WHERE SU.FK_EMPLEADO = $1		
	 ;
END;
$$ LANGUAGE plpgsql;
/*------------CONSULTAR SUPLENCIAS X EMPLEADO---------------*/

/*------------MODIFICAR SUPLENCIAS X EMPLEADO---------------*/
CREATE OR REPLACE FUNCTION SUPLENCIA_MODIFICAR(integer, varchar(15), integer, integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM SUPLENCIA WHERE FK_EMPLEADO = $4 AND MES = $2 AND ANO = $3) = 1) THEN
		UPDATE SUPLENCIA SET DIASADICIONALES = $1 WHERE ((FK_EMPLEADO = $4) AND (MES = $2) AND (ANO = $3));
		
		RESULT := 201;
  	
  	ELSE
	
		RESULT := 204;
	
	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*------------MODIFICAR SUPLENCIAS X EMPLEADO---------------*/

/*--------------BORRAR SUPLENCIA X EMPLEADO----------------*/
CREATE OR REPLACE FUNCTION SUPLENCIA_BORRAR(integer, varchar(15), integer, integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM SUPLENCIA WHERE FK_EMPLEADO = $4 AND MES = $2 AND ANO = $3) = 1) THEN

		DELETE FROM SUPLENCIA WHERE ID = (SELECT ID FROM SUPLENCIA WHERE FK_EMPLEADO = $4 AND MES = $2 AND ANO = $3);
		
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*--------------BORRAR SUPLENCIA X EMPLEADO----------------*/

/**************************************CRUD EMP_GRU_EST******************************************/
/*------------------REGISTRAR EMP_GRU_EST--------------------*/
CREATE OR REPLACE FUNCTION EMPGRU_REGISTRAR(integer, varchar(30), varchar(30)) RETURNS integer AS $$
DECLARE
 RESULT integer; 
 CANTDOCENTES integer;
 CANTAUXILIARES integer;
 REGISTRADO integer;


BEGIN
	CANTDOCENTES := (SELECT COUNT(EMP.ID) FROM EMP_GRU_EST EMP, EMPLEADO E WHERE (E.CEDULA = EMP.FK_CEDULA) AND (EMP.FK_GRUPO = $2) AND (E.CARGO = 'Docente'));
	CANTAUXILIARES := (SELECT COUNT(EMP.ID) FROM EMP_GRU_EST EMP, EMPLEADO E WHERE (E.CEDULA = EMP.FK_CEDULA) AND (EMP.FK_GRUPO = $2) AND (E.CARGO = 'Auxiliar'));
	REGISTRADO := (SELECT COUNT(EMP.ID) FROM EMP_GRU_EST EMP, EMPLEADO E WHERE (E.CEDULA = EMP.FK_CEDULA) AND (E.CEDULA = $1));
	IF (CANTDOCENTES = 0 AND ($3 = 'Docente') AND (REGISTRADO = 0)) THEN

		INSERT INTO EMP_GRU_EST (FK_CEDULA, FK_CEDULAESCOLAR, FK_GRUPO) VALUES ($1, NULL, $2);
		
		RESULT := 201;
  	
  	ELSIF (CANTAUXILIARES < 2 AND ($3 = 'Auxiliar') AND (REGISTRADO = 0)) THEN
	
		INSERT INTO EMP_GRU_EST (FK_CEDULA, FK_CEDULAESCOLAR, FK_GRUPO) VALUES ($1, NULL, $2);
		
		RESULT := 201;

	ELSE

		RESULT := 500;

	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*------------------REGISTRAR EMP_GRU_EST--------------------*/

/*--------------BORRAR EMP_GRU_EST----------------*/
CREATE OR REPLACE FUNCTION EMPGRU_BORRAR(integer, varchar(30)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM EMP_GRU_EST WHERE FK_CEDULA = $1 AND FK_GRUPO = $2) = 1) THEN

		DELETE FROM EMP_GRU_EST WHERE ID = (SELECT ID FROM EMP_GRU_EST WHERE FK_CEDULA = $1 AND FK_GRUPO = $2);
		
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*--------------BORRAR EMP_GRU_EST----------------*/

/*------------CONSULTAR EMP_GRU_EST---------------*/
CREATE OR REPLACE FUNCTION EMPGRU_CONSULTAR() RETURNS TABLE(FK_CEDULA integer, PRIMERNOMBRE varchar(30), PRIMERAPELLIDO varchar(30), CARGO varchar(30), NOMBRE varchar(30)) AS $$
DECLARE

BEGIN
	 RETURN QUERY
	 SELECT EMP.FK_CEDULA, E.PRIMERNOMBRE, E.PRIMERAPELLIDO, E.CARGO, G.NOMBRE
	 FROM EMP_GRU_EST EMP, EMPLEADO E, GRUPO G
	 WHERE EMP.FK_CEDULA = E.CEDULA AND EMP.FK_GRUPO = G.CODIGO	
	 ;
END;
$$ LANGUAGE plpgsql;
/*------------CONSULTAR EMP_GRU_EST---------------*/


/**************************************CRUD PRESTAMO******************************************/
/*------------REGISTRAR PRESTAMO---------------*/
CREATE OR REPLACE FUNCTION PRESTAMO_REGISTRAR(date, integer, integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN

	INSERT INTO PRESTAMO (FECHAPRESTAMO, MONTO, FK_EMPLEADO) VALUES ($1, $2, $3);
	RESULT := 201;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;
/*------------REGISTRAR PRESTAMO---------------*/

/*------------CONSULTAR PRESTAMO DETALLE---------------*/
CREATE OR REPLACE FUNCTION PRESTAMO_CONSULTAR(integer) RETURNS TABLE(FECHAPRESTAMO date, MONTO integer, FK_EMPLEADO integer) AS $$
DECLARE

BEGIN
	 RETURN QUERY
	 SELECT P.FECHAPRESTAMO, P.MONTO, P.FK_EMPLEADO
	 FROM PRESTAMO P
	 WHERE P.FK_EMPLEADO = $1
	 ;
END;
$$ LANGUAGE plpgsql;
/*------------CONSULTAR PRESTAMO DETALLE---------------*/
CREATE OR REPLACE FUNCTION PRESTAMO_CONSULTAR_MONTO_ACTUAL(integer) RETURNS TABLE(FECHAPRESTAMO date, MONTO integer, FK_EMPLEADO integer) AS $$
DECLARE

BEGIN
	 RETURN QUERY
	 SELECT SUM(P.MONTO)
	 FROM PRESTAMO P
	 WHERE P.FK_EMPLEADO = $1
	 ;
END;
$$ LANGUAGE plpgsql;
/*------------CONSULTAR MONTO PRESTAMO ACTUAL---------------*/
/***********************************CRUD REPRESENTANTE***************************************/

CREATE OR REPLACE FUNCTION REPRESENTANTE_REGISTRAR(integer, varchar(30), varchar(30), varchar(30), varchar(30), date, varchar(11), varchar(11), varchar(17), varchar(100), varchar(80), varchar(80), varchar(80)) RETURNS integer AS $$
DECLARE
 RESULT integer;
 FK_LUGAR integer;

BEGIN
	IF ((SELECT COUNT(*) FROM REPRESENTANTE WHERE CEDULA = $1) = 0) THEN

		FK_LUGAR := (SELECT P.CODIGO FROM LUGAR M, LUGAR E, LUGAR P WHERE E.NOMBRE = $11 AND M.NOMBRE = $12 AND P.NOMBRE = $13 AND E.CODIGO = M.FK_LUGAR AND M.CODIGO = P.FK_LUGAR);
		INSERT INTO REPRESENTANTE (CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, FECHANAC, TELEFONOCASA, TELEFONOMOVIL, TIPO, FOTO, FK_LUGAR) VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10, FK_LUGAR);
		RESULT := 201;
  	
  	ELSE
	
		RESULT := 500;
	
	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION REPRESENTANTE_MODIFICAR(integer, varchar(30), varchar(30), varchar(30), varchar(30), date, varchar(11), varchar(11), varchar(17), varchar(100), varchar(80), varchar(80), varchar(80)) RETURNS integer AS $$
DECLARE
 RESULT integer;
 lugar integer;

BEGIN
	IF ((SELECT COUNT(*) FROM REPRESENTANTE WHERE CEDULA = $1) = 1) THEN

		lugar := (SELECT P.CODIGO FROM LUGAR M, LUGAR E, LUGAR P WHERE E.NOMBRE = $11 AND M.NOMBRE = $12 AND P.NOMBRE = $13 AND E.CODIGO = M.FK_LUGAR AND M.CODIGO = P.FK_LUGAR);
		UPDATE REPRESENTANTE SET PRIMERNOMBRE = $2, SEGUNDONOMBRE = $3, PRIMERAPELLIDO = $4, SEGUNDOAPELLIDO = $5, FECHANAC = $6, TELEFONOCASA = $7, TELEFONOMOVIL = $8, TIPO = $9, FOTO = $10, FK_LUGAR = lugar  WHERE CEDULA = $1;
		RESULT := 201;
  	
  	ELSE
	
		RESULT := 204;
	
	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION REPRESENTANTE_BORRAR(integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM REPRESENTANTE WHERE CEDULA = $1) = 1) THEN 

		DELETE FROM REPRESENTANTE WHERE CEDULA = $1;
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION REPRESENTANTE_CONSULTAR_TODOS() RETURNS TABLE(CEDULA integer, PRIMERNOMBRE varchar(30), SEGUNDONOMBRE varchar(30), PRIMERAPELLIDO varchar(30), SEGUNDOAPELLIDO varchar(30), FECHANAC date, TELEFONOCASA varchar(11), TELEFONOMOVIL varchar(11), TIPO varchar(17), FOTO varchar(100), ESTADO varchar(80), MUNICIPIO varchar(80), PARROQUIA varchar(80)) AS $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT RE.CEDULA, RE.PRIMERNOMBRE ,RE.SEGUNDONOMBRE, RE.PRIMERAPELLIDO, RE.SEGUNDOAPELLIDO, RE.FECHANAC, RE.TELEFONOCASA, RE.TELEFONOMOVIL, RE.TIPO, RE.FOTO, E.NOMBRE, M.NOMBRE, P.NOMBRE
	FROM REPRESENTANTE RE, LUGAR E, LUGAR M, LUGAR P
	WHERE RE.FK_LUGAR =  P.CODIGO AND P.FK_LUGAR = M.CODIGO AND M.FK_LUGAR = E.CODIGO
	;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION REPRESENTANTE_CONSULTAR_DETALLE(integer) RETURNS TABLE(CEDULA integer, PRIMERNOMBRE varchar(30), SEGUNDONOMBRE varchar(30), PRIMERAPELLIDO varchar(30), SEGUNDOAPELLIDO varchar(30), FECHANAC date, TELEFONOCASA varchar(11), TELEFONOMOVIL varchar(11), TIPO varchar(17), FOTO varchar(100), ESTADO varchar(80), MUNICIPIO varchar(80), PARROQUIA varchar(80)) AS $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT RE.CEDULA, RE.PRIMERNOMBRE ,RE.SEGUNDONOMBRE, RE.PRIMERAPELLIDO, RE.SEGUNDOAPELLIDO, RE.FECHANAC, RE.TELEFONOCASA, RE.TELEFONOMOVIL, RE.TIPO, RE.FOTO, E.NOMBRE, M.NOMBRE, P.NOMBRE
	FROM REPRESENTANTE RE, LUGAR E, LUGAR M, LUGAR P
	WHERE RE.FK_LUGAR =  P.CODIGO AND P.FK_LUGAR = M.CODIGO AND M.FK_LUGAR = E.CODIGO AND RE.CEDULA = $1
	;
END;
$$ LANGUAGE plpgsql;


/**************************************CRUD ESTUDIANTE****************************************/
CREATE OR REPLACE FUNCTION ESTUDIANTE_REGISTRAR(bigint, varchar(30), varchar(30), varchar(30), varchar(30), date, varchar(100), varchar(50), varchar(7)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM ESTUDIANTE WHERE CEDULAESCOLAR = $1) = 0) THEN 

		INSERT INTO ESTUDIANTE VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9);
		RESULT := 201;

	ELSE

		RESULT := 500;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION ESTUDIANTE_MODIFICAR(bigint, varchar(30), varchar(30), varchar(30), varchar(30), date, varchar(100), varchar(50), varchar(7)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM ESTUDIANTE WHERE CEDULAESCOLAR = $1) = 1) THEN 

		UPDATE ESTUDIANTE SET PRIMERNOMBRE = $2, SEGUNDONOMBRE = $3, PRIMERAPELLIDO = $4, SEGUNDOAPELLIDO = $5, FECHANAC = $6, FOTO = $7, CEDULAMAPFRE = $8, SEXO = $9 WHERE CEDULAESCOLAR = $1;
		RESULT := 201;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION ESTUDIANTE_BORRAR(bigint) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM ESTUDIANTE WHERE CEDULAESCOLAR = $1) = 1) THEN 

		DELETE FROM ESTUDIANTE WHERE CEDULAESCOLAR = $1;
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION ESTUDIANTE_CONSULTAR_TODOS() RETURNS TABLE (CEDULAESCOLAR bigint, PRIMERNOMBRE varchar(30), SEGUNDONOMBRE varchar(30), PRIMERAPELLIDO varchar(30), SEGUNDOAPELLIDO varchar(30), FECHANAC date, FOTO varchar(100), CEDULAMAPFRE varchar(50), SEXO varchar(7)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT ES.CEDULAESCOLAR, ES.PRIMERNOMBRE, ES.SEGUNDONOMBRE, ES.PRIMERAPELLIDO, ES.SEGUNDOAPELLIDO, ES.FECHANAC, ES.FOTO, ES.CEDULAMAPFRE, ES.SEXO
	FROM ESTUDIANTE ES
	;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION ESTUDIANTE_CONSULTAR_DETALLE(bigint) RETURNS TABLE (CEDULAESCOLAR bigint, PRIMERNOMBRE varchar(30), SEGUNDONOMBRE varchar(30), PRIMERAPELLIDO varchar(30), SEGUNDOAPELLIDO varchar(30), FECHANAC date, FOTO varchar(100), CEDULAMAPFRE varchar(50), SEXO varchar(7)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT ES.CEDULAESCOLAR, ES.PRIMERNOMBRE, ES.SEGUNDONOMBRE, ES.PRIMERAPELLIDO, ES.SEGUNDOAPELLIDO, ES.FECHANAC, ES.FOTO, ES.CEDULAMAPFRE, ES.SEXO
	FROM ESTUDIANTE ES
	WHERE ES.CEDULAESCOLAR = $1
	;
END;
$$ LANGUAGE plpgsql;

/**************************************CRUD REP_EST****************************************/
CREATE OR REPLACE FUNCTION REPEST_REGISTRAR(integer, bigint) RETURNS integer AS $$
DECLARE
 RESULT integer;
 FK_REPRESENTANTE integer;
 FK_ESTUDIANTE bigint;


BEGIN

	IF ((SELECT COUNT(*) FROM REP_EST WHERE FK_CEDULA = $1 AND FK_CEDULAESCOLAR = $2) = 0) THEN 

		FK_REPRESENTANTE := (SELECT CEDULA FROM REPRESENTANTE WHERE CEDULA = $1);
		FK_ESTUDIANTE := (SELECT CEDULAESCOLAR FROM ESTUDIANTE WHERE CEDULAESCOLAR = $2);
		INSERT INTO REP_EST (ID, FK_CEDULA, FK_CEDULAESCOLAR) VALUES (nextval('rep_est_id_seq'), FK_REPRESENTANTE, FK_ESTUDIANTE);
		RESULT := 200;
	ELSE
		RESULT := 204;
	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION REPEST_BORRAR(integer, bigint) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM REP_EST WHERE FK_CEDULA = $1 AND FK_CEDULAESCOLAR = $2) = 1) THEN 

		DELETE FROM REP_EST WHERE FK_CEDULA  = $1 AND FK_CEDULAESCOLAR = $2;
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION REPEST_CONSULTAR_TODOS() RETURNS TABLE (CEDULARep integer, PRIMERNOMBRERep varchar(30), PRIMERAPELLIDORep varchar(30), CEDULAESCOLAREs bigint, PRIMERNOMBREEs varchar(30), PRIMERAPELLIDOEs varchar(30)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT RE.CEDULA, RE.PRIMERNOMBRE, RE.PRIMERAPELLIDO, ES.CEDULAESCOLAR, ES.PRIMERNOMBRE, ES.PRIMERAPELLIDO
	FROM REPRESENTANTE RE, ESTUDIANTE ES, REP_EST REPEST
	WHERE (RE.CEDULA = REPEST.FK_CEDULA) AND (ES.CEDULAESCOLAR = REPEST.FK_CEDULAESCOLAR)
	;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION REPEST_CONSULTAR_DETALLE(integer) RETURNS TABLE (CEDULARep integer, PRIMERNOMBRERep varchar(30), PRIMERAPELLIDORep varchar(30), CEDULAESCOLAREs bigint, PRIMERNOMBREEs varchar(30), PRIMERAPELLIDOEs varchar(30)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT RE.CEDULA, RE.PRIMERNOMBRE, RE.PRIMERAPELLIDO, ES.CEDULAESCOLAR, ES.PRIMERNOMBRE, ES.PRIMERAPELLIDO
	FROM REPRESENTANTE RE, ESTUDIANTE ES, REP_EST REPEST
	WHERE (REPEST.FK_CEDULA = $1) AND (RE.CEDULA = REPEST.FK_CEDULA) AND (ES.CEDULAESCOLAR = REPEST.FK_CEDULAESCOLAR)
	;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION REPEST_CONSULTAR_DETALLE_ESCOLAR(bigint) RETURNS TABLE (CEDULARep integer, PRIMERNOMBRERep varchar(30), PRIMERAPELLIDORep varchar(30), CEDULAESCOLAREs bigint, PRIMERNOMBREEs varchar(30), PRIMERAPELLIDOEs varchar(30)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT RE.CEDULA, RE.PRIMERNOMBRE, RE.PRIMERAPELLIDO, ES.CEDULAESCOLAR, ES.PRIMERNOMBRE, ES.PRIMERAPELLIDO
	FROM REPRESENTANTE RE, ESTUDIANTE ES, REP_EST REPEST
	WHERE (REPEST.FK_CEDULAESCOLAR = $1) AND (RE.CEDULA = REPEST.FK_CEDULA) AND (ES.CEDULAESCOLAR = REPEST.FK_CEDULAESCOLAR)
	;
END;
$$ LANGUAGE plpgsql;


/**************************************CRUD GRUPO****************************************/
CREATE OR REPLACE FUNCTION GRUPO_REGISTRAR(varchar(30), varchar(30), varchar(30), integer, varchar(50)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN

	IF ((SELECT COUNT(*) FROM GRUPO WHERE CODIGO = $1) = 0) THEN 

		INSERT INTO GRUPO (CODIGO, NOMBRE, DESCRIPCION, CAPACIDAD, PERIODO) VALUES ($1, $2, $3, $4, $5);
		RESULT := 201;
	ELSE
		RESULT := 204;
	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION GRUPO_MODIFICAR(varchar(30), varchar(30), varchar(30), integer, varchar(50)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM GRUPO WHERE CODIGO = $1) = 1) THEN 

		UPDATE GRUPO SET NOMBRE = $2, DESCRIPCION = $3, CAPACIDAD = $4, PERIODO = $5 WHERE CODIGO = $1;
		RESULT := 201;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION GRUPO_BORRAR(varchar(30)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM GRUPO WHERE CODIGO = $1) = 1) THEN 

		DELETE FROM GRUPO WHERE CODIGO  = $1;
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION GRUPO_CONSULTAR_TODOS() RETURNS TABLE (CODIGO varchar(30), NOMBRE varchar(30), DESCRIPCION varchar(30), CAPACIDAD integer, PERIODO varchar(50)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT GR.CODIGO, GR.NOMBRE, GR.DESCRIPCION, GR.CAPACIDAD, GR.PERIODO
	FROM GRUPO GR
	;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION GRUPO_CONSULTAR_DETALLE(varchar(30)) RETURNS TABLE (CODIGO varchar(30), NOMBRE varchar(30), DESCRIPCION varchar(30), CAPACIDAD integer, PERIODO varchar(50)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT GR.CODIGO, GR.NOMBRE, GR.DESCRIPCION, GR.CAPACIDAD, GR.PERIODO
	FROM GRUPO GR
	WHERE GR.CODIGO = $1
	;
END;
$$ LANGUAGE plpgsql;

/**************************************CRUD EMPGRUEST****************************************/
CREATE OR REPLACE FUNCTION EMPGRUEST_REGISTRAR(integer, bigint, varchar(30)) RETURNS integer AS $$
DECLARE
 RESULT integer;
 FK_EMPLEADO integer;
 FK_ESTUDIANTE integer;
 FK_GRUPOCOD varchar(30);


BEGIN

	IF ((SELECT COUNT(*) FROM EMP_GRU_EST EGE  WHERE EGE.FK_CEDULA = $1 AND EGE.FK_CEDULAESCOLAR = $2 AND EGE.FK_GRUPO = $3) = 0) THEN 

		FK_EMPLEADO := (SELECT CEDULA FROM EMPLEADO WHERE CEDULA = $1);
		FK_ESTUDIANTE := (SELECT CEDULAESCOLAR FROM ESTUDIANTE WHERE CEDULAESCOLAR = $2);
		FK_GRUPOCOD := (SELECT CODIGO FROM GRUPO WHERE CODIGO = $3);
		INSERT INTO EMP_GRU_EST(ID, FK_CEDULA, FK_CEDULAESCOLAR, FK_GRUPO) VALUES (nextval('emp_gru_est_id_seq'), FK_EMPLEADO, FK_ESTUDIANTE, FK_GRUPOCOD);
		RESULT := 201;
	ELSE
		RESULT := 204;
	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION EMPGRUEST_BORRAR(integer, bigint, varchar(30)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM EMP_GRU_EST EGE  WHERE EGE.FK_CEDULA = $1 AND EGE.FK_CEDULAESCOLAR = $2 AND EGE.FK_GRUPO = $3) = 1) THEN 

		DELETE FROM EMP_GRU_EST WHERE FK_CEDULA  = $1 AND FK_CEDULAESCOLAR = $2 AND FK_GRUPO = $3;
		RESULT := 200;

	ELSE

		RESULT := 204;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION EMPGRUEST_CONSULTAR_TODOS() RETURNS TABLE (CEDULAemp integer, PRIMERNOMBREemp varchar(30), PRIMERAPELLIDOemp varchar(30), CEDULAESCOLARest bigint, PRIMERNOMBREest varchar(30), PRIMERAPELLIDOest varchar(30), CODIGO varchar(30), NOMBRE varchar(30)) as $$
DECLARE
BEGIN

	RETURN QUERY
	SELECT EM.CEDULA, EM.PRIMERNOMBRE, EM.PRIMERAPELLIDO, ES.CEDULAESCOLAR, ES.PRIMERNOMBRE, ES.PRIMERAPELLIDO, GR.CODIGO, GR.NOMBRE
	FROM EMPLEADO EM, GRUPO GR, ESTUDIANTE ES, EMP_GRU_EST EGE
	WHERE (EM.CEDULA = EGE.FK_CEDULA) AND (ES.CEDULAESCOLAR = EGE.FK_CEDULAESCOLAR) AND (GR.CODIGO =EGE.FK_GRUPO)
	;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION EMPGRUEST_CONSULTAR_DETALLE(integer, bigint, varchar(30)) RETURNS TABLE (CEDULAemp integer, PRIMERNOMBREemp varchar(30), PRIMERAPELLIDOemp varchar(30), CEDULAESCOLARest bigint, PRIMERNOMBREest varchar(30), PRIMERAPELLIDOest varchar(30), CODIGO varchar(30), NOMBRE varchar(30)) as $$
DECLARE
BEGIN

	RETURN QUERY
	SELECT EM.CEDULA, EM.PRIMERNOMBRE, EM.PRIMERAPELLIDO, ES.CEDULAESCOLAR, ES.PRIMERNOMBRE, ES.PRIMERAPELLIDO, GR.CODIGO, GR.NOMBRE
	FROM EMPLEADO EM, GRUPO GR, ESTUDIANTE ES, EMP_GRU_EST EGE
	WHERE (EM.CEDULA = $1) AND (ES.CEDULAESCOLAR = $2) AND (GR.CODIGO = $3) AND (EM.CEDULA = EGE.FK_CEDULA) AND (ES.CEDULAESCOLAR = EGE.FK_CEDULAESCOLAR) AND (GR.CODIGO =EGE.FK_GRUPO)
	;
END;
$$ LANGUAGE plpgsql;

/**************************************Consultar Lugar Detallado****************************************/

CREATE OR REPLACE FUNCTION ESTADO_CONSULTAR_TODOS() RETURNS TABLE (CODIGO integer, NOMBRE varchar(80)) as $$
DECLARE
BEGIN

	RETURN QUERY
	SELECT LU.CODIGO, LU.NOMBRE
	FROM LUGAR LU
	WHERE LU.TIPO = 'Estado'
	;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION MUNICIPIO_CONSULTAR_TODOS(integer) RETURNS TABLE (CODIGO integer, NOMBRE varchar(80)) as $$
DECLARE
BEGIN

	RETURN QUERY
	SELECT LU.CODIGO, LU.NOMBRE FROM LUGAR LU WHERE LU.FK_LUGAR = $1;

END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION PARROQUIA_CONSULTAR_TODOS(integer) RETURNS TABLE (CODIGO integer, NOMBRE varchar(80)) as $$
DECLARE
BEGIN

	RETURN QUERY
	SELECT LU.CODIGO, LU.NOMBRE FROM LUGAR LU WHERE LU.FK_LUGAR = $1;

END;
$$ LANGUAGE plpgsql;
/*****************************CRUD REPRESENTANTE**********************************/

CREATE OR REPLACE FUNCTION REPRESENTANTE_REGISTRAR(integer, varchar(30), varchar(30), varchar(30), varchar(30), date, varchar(11), varchar(11), varchar(17), varchar(100), varchar(80), varchar(80), varchar(80)) RETURNS integer AS $$
DECLARE
 RESULT integer;
 FK_LUGAR integer;

BEGIN
	IF ((SELECT COUNT(*) FROM REPRESENTANTE WHERE CEDULA = $1) = 0) THEN

		FK_LUGAR := (SELECT P.CODIGO FROM LUGAR M, LUGAR E, LUGAR P WHERE E.NOMBRE = $11 AND M.NOMBRE = $12 AND P.NOMBRE = $13 AND E.CODIGO = M.FK_LUGAR AND M.CODIGO = P.FK_LUGAR);
		INSERT INTO REPRESENTANTE (CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, FECHANAC, TELEFONOCASA, TELEFONOMOVIL, TIPO, FOTO, FK_LUGAR) VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10, FK_LUGAR);
		RESULT := 200;
  	
  	ELSE
	
		RESULT := 101;
	
	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;



CREATE OR REPLACE FUNCTION REPRESENTANTE_MODIFICAR(integer, varchar(30), varchar(30), varchar(30), varchar(30), date, varchar(11), varchar(11), varchar(17), varchar(100), varchar(80), varchar(80), varchar(80)) RETURNS integer AS $$
DECLARE
 RESULT integer;
 fk_lugar integer;

BEGIN
	IF ((SELECT COUNT(*) FROM REPRESENTANTE WHERE CEDULA = $1) = 0) THEN

		fk_lugar := (SELECT P.CODIGO FROM LUGAR M, LUGAR E, LUGAR P WHERE E.NOMBRE = $11 AND M.NOMBRE = $12 AND P.NOMBRE = $13 AND E.CODIGO = M.FK_LUGAR AND M.CODIGO = P.FK_LUGAR);
		UPDATE REPRESENTANTE SET CEDULA = $1, PRIMERNOMBRE = $2, SEGUNDONOMBRE = $3, PRIMERAPELLIDO = $4, SEGUNDOAPELLIDO = $5, FECHANAC = $6, TELEFONOCASA = $7, TELEFONOMOVIL = $8, TIPO = $9, FOTO = $10, FK_LUGAR = fk_lugar  WHERE CEDULA = $1;
		RESULT := 200;
  	
  	ELSE
	
		RESULT := 101;
	
	END IF;
 	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION REPRESENTANTE_BORRAR(integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM REPRESENTANTE WHERE CEDULA = $1) = 0) THEN 

		DELETE FROM REPRESENTANTE WHERE CEDULA = $1;
		RESULT := 200;

	ELSE

		RESULT := 101;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;



CREATE OR REPLACE FUNCTION REPRESENTANTE_CONSULTAR_TODOS() RETURNS TABLE ( CEDULA integer, PRIMERNOMBRE varchar(30), SEGUNDONOMBRE varchar(30), PRIMERAPELLIDO varchar(30), SEGUNDOAPELLIDO varchar(30), FECHANAC date, TELEFONOCASA varchar(11), TELEFONOMOVIL varchar(11), TIPO varchar(17), FOTO varchar(100), ESTADO varchar(80), MUNICIPIO varchar(80), PARROQUIA varchar(80)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT ES.CEDULA, ES.PRIMERNOMBRE, ES.SEGUNDONOMBRE, ES.PRIMERAPELLIDO, ES.SEGUNDOAPELLIDO, ES.FECHANAC, ES.TELEFONOCASA, ES.TELEFONOMOVIL, ES.TIPO, E.NOMBRE, M.LUGAR, P.LUGAR 
	FROM ESTUDIANTE ES, LUGAR E, LUGAR M, LUGAR P
	WHERE ES.FK_LUGAR =  P.CODIGO AND P.FK_LUGAR = M.CODIGO AND M.FK_LUGAR = E.CODIGO
	;

END;
$$ LANGUAGE plpgsql;


/*****************************CRUD ESTUDIANTE**********************************/
CREATE OR REPLACE FUNCTION ESTUDIANTE_REGISTRAR(integer, varchar(30), varchar(30), varchar(30), varchar(30), date, varchar(100)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM ESTUDIANTE WHERE CEDULAESCOLAR = $1) = 0) THEN 

		INSERT INTO ESTUDIANTE VALUES ($1, $2, $3, $4, $5, $6, $7);
		RESULT := 200;

	ELSE

		RESULT := 201;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;



CREATE OR REPLACE FUNCTION ESTUDIANTE_MODIFICAR(integer, varchar(30), varchar(30), varchar(30), varchar(30), date, varchar(100)) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM ESTUDIANTE WHERE CEDULAESCOLAR = $1) = 1) THEN 

		UPDATE ESTUDIANTE SET CEDULAESCOLAR = $1, PRIMERNOMBRE = $2, SEGUNDONOMBRE = $3, PRIMERAPELLIDO = $4, SEGUNDOAPELLIDO = $5, FECHANAC = $6, FOTO = $7 WHERE CEDULAESCOLAR = $1;
		RESULT := 200;

	ELSE

		RESULT := 201;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;



CREATE OR REPLACE FUNCTION ESTUDIANTE_BORRAR(integer) RETURNS integer AS $$
DECLARE
 RESULT integer;

BEGIN
	IF ((SELECT COUNT(*) FROM ESTUDIANTE WHERE CEDULAESCOLAR = $1) = 1) THEN 

		DELETE FROM ESTUDIANTE WHERE CEDULAESCOLAR = $1;
		RESULT := 200;

	ELSE

		RESULT := 201;

	END IF;
	RETURN RESULT;
END;
$$ LANGUAGE plpgsql;



CREATE OR REPLACE FUNCTION ESTUDIANTE_CONSULTAR_TODOS() RETURNS TABLE (CEDULAESCOLAR integer, PRIMERNOMBRE varchar(30), SEGUNDONOMBRE varchar(30), PRIMERAPELLIDO varchar(30), SEGUNDOAPELLIDO varchar(30), FECHANAC date, FOTO varchar(100)) as $$
DECLARE

BEGIN

	RETURN QUERY
	SELECT CEDULAESCOLAR, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, FECHANAC, FOTO
	FROM ESTUDIANTE;

END;
$$ LANGUAGE plpgsql;

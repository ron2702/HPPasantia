/*LUGAR*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'País', 'Venezuela', null);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Amazonas',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Anzoátegui',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Apure',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Aragua',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Barinas',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Bolívar',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Carabobo',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Cojedes',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Delta Amacuro',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Distrito Capital',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Falcón',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Guárico',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Lara',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Mérida',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','MirANDa',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Monagas',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Nueva Esparta',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Portuguesa',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Sucre',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Táchira',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Trujillo',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Vargas',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Yaracuy',1);
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Estado','Zulia',1);

INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Atures',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Amazonas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Alto Orinoco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Amazonas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Atabapo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Amazonas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Autana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Amazonas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Manapiare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Amazonas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Maroa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Amazonas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Rio Negro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Amazonas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Anaco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Aragua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bruzual',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cajigal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Carvajal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Freites',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Guanipa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Guanta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Independencia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','L/Diego Bautista',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Libertad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','MC Gregor',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Monagas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Peñalver',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Piritu',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Santa Ana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Simon Rodriguez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sotillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','S Juan Capistrano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San FernANDo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Apure'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Achaguas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Apure'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Biruaca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Apure'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Muñoz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Apure'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Paez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Apure'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pedro Comejo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Apure'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Romulo Gallegos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Apure'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Girardot',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Camatagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jose Angel Lamas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jose Felix Rivas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jose R Revenga',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Mario B Iragorry',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Casimiro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Sebastian',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Santiago Mariño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Santo Michelena',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Tovar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Urdaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Zamora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Francisco Linares',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ocumare de la Costa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Barinas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Antonio Jose de Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Alberto Arvelo T',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Arismendi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cruz Paredes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ezequiel Zamora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Obispos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pedraza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Rojas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','ANDres E Blanco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Heres',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Blvno Angostura',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Caroni',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cedeño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','El Callao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Gran Sabana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Piar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Roscio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sifontes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Padre Pedro Chien',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Bolívar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Valencia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bejuma',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Carlos Arvelo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Diego Ibarra',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Guacara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Juan Jose Mora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Los Guayos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Montalban',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Naguanagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Puerto Cabello',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Diego',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Joaquin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Carabobo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ezequiel Zamora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Anzoátegui',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Girardot',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Lima Blanco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pao S J Bautista',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ricaurte',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Romulo Gallegos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Tinaco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Tinaquillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Cojedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Tucupita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Delta Amacuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Antonio Diaz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Delta Amacuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Casacoima',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Delta Amacuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pedernales',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Delta Amacuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Blvno Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Distrito Capital'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Acosta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Buchivacoa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cacique Manaure',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Carirubana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Colina',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Dabajuro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Democracia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Falcón',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Federacion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jacura',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Los Taques',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Mauroa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Mons. Iturriza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Palma Sola',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Petit',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Piritu',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Francisco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Silva',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Tocopero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Union',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Urumaco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Zamora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Falcón'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Roscio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Camaguan',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Chaguaramas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','El Socorro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Infante',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Las Mercedes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Mellado',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Monagas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ortiz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ribas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','S Maria de Ipire',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Zaraza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','S Jose de Guaribe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Geronimo de G',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Guárico'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Iribarren',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','ANDres Eloy Blanco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Crespo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jimenez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Moran',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Palavecino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Simon Planas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Torres',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Urdaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Lara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Alberto Adriani',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','ANDres Bello',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Antonio Pinto S',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Aricagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Arzobispo Chacon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Campo Elias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Caracciolo Parra',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Guaraque',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Justo Briceño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Padre Noguera',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pueblo Llano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Rangel',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Rivas Davila',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Santos Marquina',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Tovar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Tulio F Cordero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Zea',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cardenal Quintero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Julio Cesar Salas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ob. Ramos de Lora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Mérida'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Guaicaipuro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Acevedo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','ANDres Bello',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Baruta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Brion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Buroz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Carrizal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Chacao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cristobal Rojas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','El Hatillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Independencia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','LANDer',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Los Salias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Paez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Paz Castillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pedro Gual',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Plaza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Simon Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Urdaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Zamora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'MirANDa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Maturin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Acosta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Aguasay',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Caripe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cedeño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ezequiel Zamora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Piar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Punceres',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Santa Barbara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sotillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Uracoa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Monagas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Arismendi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Diaz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Garcia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Gomez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Maneiro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Marcano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Mariño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Tubores',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Antolin del Campo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Peninsula de Macanao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Villalba',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Nueva Esparta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Guanare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Agua Blanca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Araure',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));	
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Esteller',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Guanarito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','M Jose V de Unda',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ospino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Paez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Papelon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Santa Rosalia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Turen',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Genaro Boconoito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Rafael de Onoto',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Portuguesa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','ANDres Eloy Blanco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','ANDres Mata',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Arismendi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Benitez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bermudez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cajigal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cruz S Acosta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Mariño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Mejia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Montes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ribero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Valdez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Cristobal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','ANDres Belloo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Antonio Romulo C',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Ayacucho',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cardenas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cordoba',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Francisco de MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Fernandez Feo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Garcia de Hevia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Guasimos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Independencia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jauregui',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jose Maria Vargas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Junin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Libertad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Lobatera',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Michelena',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Panamericano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Rafael Urdaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Samuel Maldonado',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Judas Tadeo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Seboruco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Simon Rodriguez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Torbes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Uribante',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pedro Maria Ureña',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Táchira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Trujillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','ANDres Bello',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bocono',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Candelaria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Carache',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Escuque',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jose F M Cañizal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Juan V Campo Elias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','La Ceiba',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Monte Carmelo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Motatan',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pampan',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Pampanito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Rafael Rangel',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Urdaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Valera',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Rafael Carvajal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Vargas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Felipe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Aristides Bastidas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Bruzual',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cocorote',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Independencia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','La Trinidad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Manuel Monge',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Nirgua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Peña',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Urachiche',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Veroes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jose Antonio Paez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Yaracuy'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Maracaibo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Almirante P',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Baralt',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Blvno Guajira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Cabimas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Catatumbo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Colon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Francisco J Pulgar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jesus E Lossada',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Jesus M Semprun',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','La Cañada de U',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Lagunillas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Machiues de P',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Mara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','San Francisco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Santa Rita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Simon Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Rosario de Perija',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Municipio','Valmore Rodriguez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Estado' AND NOMBRE = 'Zulia'));

										/* Parroquias del Estado amazonas*/
/* Parroquia del Municipio  Atures*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','FernANDo Giron Tovar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Atures'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Luis Alberto Gomez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Atures'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Parhueña',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Atures'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Plaranillal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Atures'));
/* Parroquia del Municipio alto orinoco */
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Esmealda',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alto Orinoco'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Huachamacare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alto Orinoco'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Marawaka',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alto Orinoco'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mavaca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alto Orinoco'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sierra Parima',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alto Orinoco'));
/* Parroquia del Municipio Atabapo */
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San FernANDo de Ataba',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Atabapo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caname',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Atabapo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ucata',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Atabapo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Yapacana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Atabapo'));
/* Parroquia del Municipio Autana*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Isla de Raton',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Autana'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guayapo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Autana'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Munduapo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Autana'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Samariapo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Autana'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sipapo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Autana'));
/* Parroquia del Municipio Manapiare*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan de Manapiare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Manapiare'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Alto Venturi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Manapiare'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bajo Venturi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Manapiare'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Medio Venturi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Manapiare'));
/* Parroquia del Municipio Maroa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Maroa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maroa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Comunidad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maroa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Victorino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maroa'));
/* Parroquia del Municipio Rio Negro*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Carlos de Rio Neg',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rio Negro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Casiquiare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rio Negro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cocuy',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rio Negro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Solano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rio Negro'));

											/* Parroquias del Estado Anzoátegui*/
/* Parroquia del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bergantin',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caigua',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Carmen',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Pilar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Naricual',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Cristobal',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
/* Parroquia del Municipio Anaco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Anaco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Anaco'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Joaquin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Anaco'));
/* Parroquia del Municipio Aragua*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aragua de Barcelona',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Aragua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cachipo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Aragua'));
/* Parroquia del Municipio Bruzual*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Clarines',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bruzual' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guanape',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bruzual' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sabana de Uchipe',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bruzual' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
/* Parroquia del Municipio Cajigal*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Onoto',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cajigal' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Pablo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cajigal' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
/* Parroquia del Municipio Carvajal*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Barbara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carvajal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Valle Guanape',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carvajal'));
/* Parroquia del Municipio Freites*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cantaura',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Freites'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Freites'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Freites'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Urica',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Freites'));
/* Parroquia del Municipio Guanipa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de Guanipa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanipa'));
/* Parroquia del Municipio Guanta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chorreron',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guanta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanta'));
/* Parroquia del Municipio Independencia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Soledad',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Independencia' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mano',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Independencia' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
/* Parroquia del Municipio L/Diego Bautista*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Morro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'L/Diego Bautista'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Lecherias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'L/Diego Bautista'));
/* Parroquia del Municipio Libertad*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Mateo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertad' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El carito',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertad' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Ines',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertad' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
/* Parroquia del Municipio MC Gregor*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Chaparro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'MC Gregor'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tomas Alfaro Calatrava',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'MC Gregor'));
/* Parroquia del Municipio MirANDa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pariaguan',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Atapirire',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Boca de Pao',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Pao',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
/* Parroquia del Municipio Monagas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mapire',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Piar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Clara',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Diego de Cabrutica',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Uverito',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Zuata',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Anzoátegui' AND m.FK_LUGAR = e.CODIGO));
												
												
												/* Parroquias del Estado Apure*/
/* Parroquias del Municipio San FernANDo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Recreo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San FernANDo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Peñalver',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San FernANDo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San FernANDo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San FernANDo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael de Atamaica',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San FernANDo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Recreo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San FernANDo'));
/*Parroquias del Municipio Achaguas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Achaguas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Apurito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Yagual',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guachara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mucuritas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Queseras del Medio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
/*Parroquias del Municipio Biruaca*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Biruaca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Biruaca'));
/*Parroquias del Municipio Muñoz*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bruzual',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mantecal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Quintero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rincon Hondo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Vicente',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Achaguas'));
/*Parroquias del Municipio Paez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aramendi',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Apure' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Amparo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Apure' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guasdualito',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Apure' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Camilo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Apure' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Urdaneta',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Apure' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Pedro Camejo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Codazzi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedro Comejo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cunaviche',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedro Comejo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan de Payara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedro Comejo'));
/*Parroquias del Municipio Romulo Gallegos*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Elorza',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Romulo Gallegos' AND e.NOMBRE = 'Apure' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Trinidad',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Romulo Gallegos' AND e.NOMBRE = 'Apure' AND m.FK_LUGAR = e.CODIGO));
							
											/* Parroquias del Estado aragua*/
/*Parroquias del Municipio Girardot*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','ANDres Eloy Blanco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Choroni',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Joaquin Crespo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Casanova Godoy',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Delicias',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Tacariguas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Madre Maria de San Jose',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pedro Jose Ovalles',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Mateo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Camatagua*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Camatagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Camatagua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carmaen de Cura',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Camatagua'));
/*Parroquias del Municipio Jose Angel Lamas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Cruz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose Angel Lamas'));
/*Parroquias del Municipio Jose Felix Rivas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Vicente Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose Felix Rivas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Castor Nieves Rios',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose Felix Rivas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Guacamayas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose Felix Rivas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pao de Zarate',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose Felix Rivas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Zuata',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose Felix Rivas'));
/*Parroquias del Municipio Jose R Revenga*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Consejo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose R Revenga'));
/*Parroquias del Municipio Libertador*/

INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Palo Negro',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Martin de Porres',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Mario B Iragorry*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Limon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mario B Iragorry'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caña de Azucar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mario B Iragorry'));
/*Parroquias del Municipio San Casimiro*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Casimiro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Casimiro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guiripa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Casimiro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ollas del Caramacate',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Casimiro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Valle Morin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Casimiro'));
/*Parroquias del Municipio San Sebastian*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Sebastian',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Sebastian'));
/*Parroquias del Municipio Santiago Mariño*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Turmero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santiago Mariño'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Alfredo Pacheco M',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santiago Mariño'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arevalo Aponte',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santiago Mariño'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chuao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santiago Mariño'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Saman de Guere',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santiago Mariño'));
/*Parroquias del Municipio Santo Michelena*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Tejerias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santo Michelena'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tiara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santo Michelena'));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cagua',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bella Vista',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Tovar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Colonia Tovar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Tovar' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Urdaneta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Barbacoas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Peñitas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco de Cara',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Taguay',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Zamora*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Villa de Cura',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Magdaleno',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Augusto Mijares',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco de Asis',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Valles de Tucutunemo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Aragua' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Francisco Linares*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Francisco Linares'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Francisco de MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Francisco Linares'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mons Feliciano G',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Francisco Linares'));
/*Parroquias del Municipio Ocumare de la Costa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ocumare de la Costa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ocumare de la Costa'));

										/* Parroquias del Estado barinas*/
/*Parroquias del Municipio Barinas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Alfredo A Larriva',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Alto Barinas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Barinas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Corazon de Jesus',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Dominga Ortiz P',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Carmen',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan A Rodriguez D',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel P Fajardo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ramon I Mnedez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Romulo Betancourt',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Silvestre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Ines',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Lucia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Torunos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Barinas'));
/*Parroquias del Municipio Antonio Jose de Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','ANDres Bello',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Jose de Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Nicolas Pulido',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Jose de Sucre'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ticoporo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Jose de Sucre'));
/*Parroquias del Municipio Alberto Arvelo T*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rodriguez Dominguez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Arvelo T'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sabaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Arvelo T'));
/*Parroquias del Municipio Arismendi*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arismendi',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Gadarrama',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Union',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altamira',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Barinitas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Calderas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Cruz Paredes*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Barrancas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cruz Paredes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Socorro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cruz Paredes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Masparrito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cruz Paredes'));
/*Parroquias del Municipio Ezequiel Zamora*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pedro Briceño Mendez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ramon Ignacio Mendez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Barbara',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Ignacio del Pumar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Barinas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Obispos*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Real',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Obispos'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Luz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Obispos'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Guasimitos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Obispos'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Obispos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Obispos'));
/*Parroquias del Municipio Pedraza*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ciudad Bolivia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedraza'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ignacio Briceño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedraza'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Felix Ribas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedraza'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Paez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedraza'));
/*Parroquias del Municipio Rojas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Dolores',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rojas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rojas'));    
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Palacio Fajardo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rojas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rojas'));
/*Parroquias del Municipio Sosa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ciudad de Nutrias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Sosa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Regalo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Sosa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Puerto de Nutrias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Sosa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Catalina',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Sosa'));

											/* Parroquias del Estado Bolívar*/
/*Parroquias del Municipio Heres*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Agua Salada',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Catedral',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Antonio Paez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Sabanita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Marhuanta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Orinoco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Panapana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Vista Hermosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Zea',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Heres'));
/*Parroquias del Municipio Blvno Angostura*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ciudad Piar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Angostura'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Barceloneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Angostura'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Angostura'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Barbara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Angostura'));
/*Parroquias del Municipio Caroni*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cachamay',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chirica',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Dalla Costa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Once de Abril',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pozo Verde',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Simon Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Unare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Universidad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Vista al Sol',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Yocoima',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caroni'));
/*Parroquias del Municipio Cedeño*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caicara del Orinoco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altagracia',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ascension Farreras',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guaniamo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Urbana',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pijiguaos',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio El Callao*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Callao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'El Callao'));
/*Parroquias del Municipio Gran Sabana*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Elena de Uairen',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Gran Sabana'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ikabaru',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Gran Sabana'));
/*Parroquias del Municipio Piar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Upata',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','ANDres Eloy Blanco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pedro Cova',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Roscio*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guasipati',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Roscio' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Salom',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Roscio' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Sifontes*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tumeremo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Sifontes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Dalla Costa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Sifontes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Isidro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Sifontes'));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Maripa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aripao',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guarataro',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Majadas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Moitaco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Bolívar' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Padre Pedro Chien*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Palmar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Padre Pedro Chien'));

												/* Parroquias del Estado Carabobo*/
/*Parroquias del Municipio Valencia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Candelaria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Catedral',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Socorro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Miguel Peña',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Negro Primero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rafael Urdaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Blas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valencia'));
/*Parroquias del Municipio Bejuma*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bejuma',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bejuma'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Canoabo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bejuma'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Simon Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bejuma'));
/*Parroquias del Municipio Carlos Arevalo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Belen',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carlos Arevalo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guigue',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carlos Arevalo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tacarigua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carlos Arevalo'));
/*Parroquias del Municipio Diego Ibarra*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aguas Calientes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Diego Ibarra'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mariara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Diego Ibarra'));
/*Parroquias del Municipio Guacara*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ciudad Alianza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guacara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guacara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guacara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Yagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guacara'));
/*Parroquias del Municipio Juan Jose Mora*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Moron',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Juan Jose Mora'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Uraima',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Juan Jose Mora'));
/*Parroquias del Municipio Libertador*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','U Independencia',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Carabobo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','U Tocuyito',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Carabobo' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Los Guayos*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','U Los Guayos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Los Guayos'));
/*Parroquias del Municipio MirANDa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','MirANDa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Carabobo' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Montalban*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Montalban',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Montalban'));
/*Parroquias del Municipio Naguanagua*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Montalban',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Naguanagua'));
/*Parroquias del Municipio Puerto Cabello*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bartolome Salom',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Puerto Cabello'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Borburata',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Puerto Cabello'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Democracia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Puerto Cabello'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Fraternidad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Puerto Cabello'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Goaigoaza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Puerto Cabello'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Jose Flores',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Puerto Cabello'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Patanemo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Puerto Cabello'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Union',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Puerto Cabello'));
/*Parroquias del Municipio San Diego*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Urb San Diego',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Diego'));
/*Parroquias del Municipio San Joaquin*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Joaquin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Joaquin'));
			
													/* Parroquias del Estado Cojedes*/
/*Parroquias del Municipio Ezequiel Zamora*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Angel Bravo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Cojedes' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Manrique',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Cojedes' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Carlos de Austria',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Cojedes' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Anzoátegui*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cojedes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Anzoátegui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan de Mata Suarez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Anzoátegui'));
/*Parroquias del Municipio Girardot*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Baul',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Cojedes' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sucre',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Girardot' AND e.NOMBRE = 'Cojedes' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Lima Blanco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Aguadita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lima Blanco')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Macapo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lima Blanco')); 
/*Parroquias del Municipio Pao S J Bautista*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Pao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pao S J Bautista')); 
/*Parroquias del Municipio Ricaurte*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Amparo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ricaurte')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertad de Cojedes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ricaurte')); 
/*Parroquias del Municipio Romulo Gallegos*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Romulo Gallegos',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Romulo Gallegos' AND e.NOMBRE = 'Cojedes' AND m.FK_LUGAR = e.CODIGO)); 
/*Parroquias del Municipio Tinaco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Gl/Jefe Jose L Silva',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tinaco')); 
/*Parroquias del Municipio Tinaquillo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tinaquillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tinaquillo')); 

												/* Parroquias del Estado Delta amecuro*/
/*Parroquias del Municipio Tucupita*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Vidal Marcano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tucupita')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Millan',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tucupita')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Leonardo Ruiz Pineda',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tucupita')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mons. Argimiro Garcia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tucupita')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tucupita')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tucupita')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Virgen del Valle',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tucupita')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mcl. Antonio Jose de Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tucupita')); 
/*Parroquias del Municipio Antonio Diaz*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Almirante Luis Brion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Diaz')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aniceto Lugo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Diaz')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Curiapo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Diaz')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Renaud',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Diaz')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Padre Barral',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Diaz')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santos del Abelgas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Diaz')); 
/*Parroquias del Municipio Casacoima*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','5 de Julio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Casacoima')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Imataca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Casacoima')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Bautista Arismendi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Casacoima')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Piar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Casacoima')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Romulo Gallegos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Casacoima')); 
/*Parroquias del Municipio Pedernales*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Luis B Prieto Figueroa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedernales')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pedernales',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedernales')); 

											/* Parroquias del Estado Distrito Capital*/
/*Parroquias del Municipio Blvno Libertador*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','23 de Enero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altagracia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Antimano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Candelaria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caricuao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Catedral',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Coche',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Junquito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Paraiso',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Recreo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Valle',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Pastora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Vega',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Macaro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Agustin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Bernardino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Pedro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rosalia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Teresa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Libertador')); 

												/* Parroquias del Estado Falcón */
/*Parroquias del Municipio MirANDa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guzman Guillermo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO)); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mitare',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rio Seco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO)); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sabaneta',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Gabriel',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Ana',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Acosta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Capadare',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE  = 'Acosta' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Patora',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE  = 'Acosta' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertador',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE  = 'Acosta' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan de los Cayos',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE  = 'Acosta' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO)); 
/*Parroquias del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aracua',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','LaPeña',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Luis',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Buchivacoa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bariro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Buchivacoa')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Borojo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Buchivacoa')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Capatadira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Buchivacoa')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guajiro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Buchivacoa')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Seque',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Buchivacoa')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Zazadira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Buchivacoa')); 
/*Parroquias del Municipio Cacique Manaure*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Yaracal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cacique Manaure')); 
/*Parroquias del Municipio Carirubana*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carirubana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carirubana')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Norte',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carirubana')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Punta Cardon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carirubana')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Ana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carirubana')); 
/*Parroquias del Municipio Colina*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Acurigua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colina')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guaibacoa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colina'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Vela de Coro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colina')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Calderas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colina')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Macoruca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colina')); 
/*Parroquias del Municipio Dabajuro*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Dabajuro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Dabajuro')); 
/*Parroquias del Municipio Democracia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Agua Clara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Democracia')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Avaria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Democracia')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pedregal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Democracia')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Piedra Grande',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Democracia')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Purureche',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Democracia')); 
/*Parroquias del Municipio Falcón*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Adaure',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Adicora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Baraived',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Buena Vista',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Hato',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Vinculo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jadacaquiva',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Moruy',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pueblo Nuevo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Falcón')); 
/*Parroquias del Municipio Federacion*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Agua Larga',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Federacion')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Churuguara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Federacion')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Pauji',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Federacion')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Independencia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Federacion')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Maparari',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Federacion')); 
/*Parroquias del Municipio Jacura*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Agua Linda',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jacura')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Araurima',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jacura')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jacura',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jacura')); 
/*Parroquias del Municipio Los Taques*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Judibana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Los Taques')); 
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Taques',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Los Taques'));
/*Parroquias del Municipio Mauroa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Casigua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mauroa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mene de Mauroa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mauroa'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Felix',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mauroa'));
/*Parroquias del Municipio Mons. Iturriza*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Boca de Tocuyo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mons. Iturriza'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chichiriviche',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mons. Iturriza'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tocuyo de la Costa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mons. Iturriza'));
/*Parroquias del Municipio Palma Sola*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Palma Sola',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Palma Sola'));
/*Parroquias del Municipio Petit*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cabure',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Petit'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Colina',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Petit'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Curimagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Petit'));
/*Parroquias del Municipio Piritu*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Piritu',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piritu' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de la Costa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piritu' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio San Francisco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mirimire',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'San Francisco' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Silva*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Boca de Aroa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Silva'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tucacas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Silva'));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pecaya',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sucre',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Tocopero*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tocopero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tocopero'));
/*Parroquias del Municipio Union*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Charal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Union'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Vegas del Tuy',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Union'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sta. Cruz de Bucaral',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Union'));
/*Parroquias del Municipio Urumaco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bruzual',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Urumaco'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Urumaco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Urumaco'));
/*Parroquias del Municipio Zamora*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Cienaga',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Soledad',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pueblo Cumarebo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Puerto Cumarebo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Zazarida',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'Falcón' AND m.FK_LUGAR = e.CODIGO));

												/* Parroquias del Estado Guárico */
/*Parroquias del Municipio Roscio*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cantagallo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Roscio' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Parapara',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Roscio' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan de los Morros',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Roscio' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Camaguan*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Camaguan',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Camaguan'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Puerto MirANDa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Camaguan'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Uverito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Camaguan'));
/*Parroquias del Municipio Chaguaramas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chaguaramas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Chaguaramas'));
/*Parroquias del Municipio El Socorro*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Socorro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'El Socorro'));
/*Parroquias del Municipio Infante*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Espino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Infante'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Valle de la Pascua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Infante'));
/*Parroquias del Municipio Las Mercedes*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cabruta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Las Mercedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Mercedes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Las Mercedes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sta. Rita de Manapire',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Las Mercedes'));
/*Parroquias del Municipio Mellado*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Sombrero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mellado'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mellado'));
/*Parroquias del Municipio MirANDa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Calabozo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Calvario',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Rastro',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guaratinajas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Monagas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altagracia de Orituco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Lezama',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertad de Orituco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Paso Real de Macaira',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Fracisco de Macaira',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael de Orituco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Soublette',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Monagas' AND e.NOMBRE = 'Guárico' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Ortiz*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ortiz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ortiz'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','S Lorenzo de Tiznados',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ortiz'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco de Tiznados',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ortiz'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de Tiznados',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ortiz'));
/*Parroquias del Municipio Ribas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael de Laya',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ribas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tucupido',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ribas'));
/*Parroquias del Municipio S Maria de Ipire*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altamira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'S Maria de Ipire'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Maria de Ipire',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'S Maria de Ipire'));
/*Parroquias del Municipio Zaraza*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de Unare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Zaraza'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Zaraza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Zaraza'));
/*Parroquias del Municipio S Jose de Guaribe*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','S Jose de Guaribe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'S Jose de Guaribe'));
/*Parroquias del Municipio San Geronimo de G*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cazorla',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Geronimo de G'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guayabal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Geronimo de G'));
												
												/* Parroquias del Estado Lara */
/*Parroquias del Municipio Iribarren*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aguedo F Alvarado',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Buena Vista',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Catedral',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Cuji',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan de Villegas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juarez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Concepcion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tamaca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Union',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Iribarren'));
/*Parroquias del Municipio ANDres Eloy Blanco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pio Tamayo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Eloy Blanco' AND e.NOMBRE = 'Lara' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Quebrada Honda de Guache',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Eloy Blanco' AND e.NOMBRE = 'Lara' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Yacambu',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Eloy Blanco' AND e.NOMBRE = 'Lara' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Crespo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Freitez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Crespo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Maria Blanco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Crespo'));
/*Parroquias del Municipio Jimenez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Coronel Mariano Peraza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jimenez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cuara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jimenez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Diego de Lozada',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jimenez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Bernardoo Dorante',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jimenez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan B Rodriguez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jimenez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Paraiso de San Jose',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jimenez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Miguel',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jimenez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tintorero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jimenez'));
/*Parroquias del Municipio Moran*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Anzoátegui',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Moran'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Moran'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guárico',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Moran'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Hilario Luna y Luna',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Moran'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Humocaro Alto',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Moran'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Humocaro Bajo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Moran'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Candelaria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Moran'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Moran',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Moran'));
/*Parroquias del Municipio Palavecino*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Agua Viva',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Palavecino'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cabudare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Palavecino'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose G Bastidas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Palavecino'));
/*Parroquias del Municipio Simon Planas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Buria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Simon Planas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Gustavo Vega Leon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Simon Planas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sarare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Simon Planas'));
/*Parroquias del Municipio Torres*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altagracia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Antonio Diaz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Camacaro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Castañeda',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cecilio Zubillaga',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chiquinquira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Blanco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Espinoza los Monteros',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Heriberto Arroyo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Lara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Mercedes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Morillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Monta a Verde',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Montes de Oca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Reyes Vargas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Torres',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Trinidad Samuel',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torres'));
/*Parroquias del Municipio Urdaneta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Moroturo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Lara' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Miguel',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Lara' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Siquisique',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Lara' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Xaguas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Lara' AND m.FK_LUGAR = e.CODIGO));

												/* Parroquias del Estado Mérida */
/*Parroquias del Municipio Libertador*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Antonio Spinetti Dini',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arias',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caracciolo Parra P',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Domingo Peña',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Llano',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Morro',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Gonzalo Picon Febres',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jacinto Plaza',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Rodriguez Suarez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Lasso de la Vega',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Nevados',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mariano Picon Salas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Malla',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Osuna Rodriguez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sagrario',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Alberto Adriani*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Gabriel Picon G',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Adriani'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Hector Amable Mora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Adriani'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Nucete Sardi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Adriani'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Presidente Betancourt',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Adriani'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Presidente Paez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Adriani'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Presidente Romulo Gallegos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Adriani'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pulido Mendez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Alberto Adriani'));
/*Parroquias del Municipio ANDres Bello*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Azulita',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Bello' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Antonio Pinto S*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sta Cruz de Mora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Pinto S'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mesa de Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Pinto S'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mesa de las Palmas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Pinto S'));
/*Parroquias del Municipio Aricagua*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aricagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Aricagua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Aricagua'));
/*Parroquias del Municipio Arzobispo Chacon*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Canagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Arzobispo Chacon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Capuri',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Arzobispo Chacon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chacanta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Arzobispo Chacon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Molino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Arzobispo Chacon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guaimaral',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Arzobispo Chacon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mucuchachi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Arzobispo Chacon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mucutuy',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Arzobispo Chacon'));
/*Parroquias del Municipio Campo Elias*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Acequias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Campo Elias'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Fernandez Peña',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Campo Elias'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jaji',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Campo Elias'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Mesa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Campo Elias'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Matriz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Campo Elias'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Montalban',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Campo Elias'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Campo Elias'));
/*Parroquias del Municipio Caracciolo Parra*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tucani',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caracciolo Parra'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Florencio Ramirez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caracciolo Parra'));
/*Parroquias del Municipio Guaraque*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guaraque',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaraque'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mesa de Quintero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaraque'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rio Negro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaraque'));
/*Parroquias del Municipio Justo Briceño*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Torondoy',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Justo Briceño'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Cristobal de T',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Justo Briceño'));
/*Parroquias del Municipio MirANDa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chachopo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','ANDres Eloy Blanco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Venta',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Piñango',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Padre Noguera*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sta Maria de Caparo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Padre Noguera'));
/*Parroquias del Municipio Pueblo Llano*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pueblo Llano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pueblo Llano'));
/*Parroquias del Municipio Rangel*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mucuchies',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rangel'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cacute',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rangel'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Toma',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rangel'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mucuruba',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rangel'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rangel'));
/*Parroquias del Municipio Rivas Davila*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bailadores',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rivas Davila'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Geronimo Maldonado',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rivas Davila'));
/*Parroquias del Municipio Santos Marquina*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tabay',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santos Marquina'));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Lagunillas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chiguara',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Estanques',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Trampa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pueblo Nuevo del Sur',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Tovar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Amparo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Tovar' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Llano',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Tovar' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Tovar' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tovar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Tovar' AND e.NOMBRE = 'Mérida' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Tulio F Cordero*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Nueva Bolivia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tulio F Cordero'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Independencia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tulio F Cordero'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Maria C Palacios',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tulio F Cordero'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Apolonia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tulio F Cordero'));
/*Parroquias del Municipio Zea*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Zea',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Zea'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caño El Tigre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Zea'));
/*Parroquias del Municipio Cardenal Quintero*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santo Domingo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cardenal Quintero'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Piedras',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cardenal Quintero'));
/*Parroquias del Municipio Julio Cesar Salas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arapuey',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Julio Cesar Salas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Palmira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Julio Cesar Salas'));
/*Parroquias del Municipio Ob. Ramos de Lora*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sta Elena de Arenales',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ob. Ramos de Lora'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Eloy Paredes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ob. Ramos de Lora'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pq R de Alcazar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ob. Ramos de Lora'));
											
											/* Parroquias del Estado MirANDa */
/*Parroquias del Municipio Guaicaipuro*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altagracia de la M',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaicaipuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cecilio Acosta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaicaipuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Jarillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaicaipuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Teques',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaicaipuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Paracotos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaicaipuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Pedro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaicaipuro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tacata',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guaicaipuro'));
/*Parroquias del Municipio Acevedo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Araguita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Acevedo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arevalo Gonzalez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Acevedo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Capaya',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Acevedo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caucagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Acevedo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Cafe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Acevedo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Marizapa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Acevedo'));	
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Panaquire',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Acevedo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ribas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Acevedo'));
/*Parroquias del Municipio ANDres Bello*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cumbo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Bello' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de Barlovento',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Bello' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Baruta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Baruta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baruta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Cafetal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baruta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Minas de Baruta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baruta'));
/*Parroquias del Municipio Brion*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Curiepe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Brion'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Higuerote',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Brion'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tacarigua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Brion'));
/*Parroquias del Municipio Buroz*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mamporal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Buroz'));
/*Parroquias del Municipio Carrizal*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carrizal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carrizal'));
/*Parroquias del Municipio Chacao*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chacao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Chacao'));
/*Parroquias del Municipio Cristobal Rojas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Charallave',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cristobal Rojas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Brisas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cristobal Rojas'));
/*Parroquias del Municipio El Hatillo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Hatillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'El Hatillo'));
/*Parroquias del Municipio Independencia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Cartanal',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Independencia' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Teresa del Tuy',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Independencia' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio LANDer*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Democracia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'LANDer'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ocumare del Tuy',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'LANDer'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Barbara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'LANDer'));
/*Parroquias del Municipio Los Salias*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio de los Altos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Los Salias'));
/*Parroquias del Municipio Paez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Guapo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Paparo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rio Chico',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San FernANDo del Guapo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tacarigua de la Laguna',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Paz Castillo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Lucia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Paz Castillo'));
/*Parroquias del Municipio Pedro Gual*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cupira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedro Gual'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Machurucuto',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedro Gual'));
/*Parroquias del Municipio Plaza*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guarenas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Plaza'));
/*Parroquias del Municipio Simon Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio de Yare',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Simon Bolívar' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco de Yare',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Simon Bolívar' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caucaguita',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Filas de Mariches',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Dolorita',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Leoncio Martinez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Petare',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Urdaneta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cua',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Nueva Cua',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Zamora*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bolívar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guatire',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Zamora' AND e.NOMBRE = 'MirANDa' AND m.FK_LUGAR = e.CODIGO));										
											
											/* Parroquias del Estado Monagas*/
/*Parroquias del Municipio Maturin*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Alto de los Godos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Boqueron',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Corozo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Furrial',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jusepin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Pica',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Cocuizas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Simon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Vicente',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Cruz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maturin'));
/*Parroquias del Municipio Acosta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE  = 'Acosta' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE  = 'Acosta' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Aguasay*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aguasay',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Aguasay'));
/*Parroquias del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caripito',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Caripe*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caripe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caripe'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Guacharo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caripe'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Guanota',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caripe'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sabana de Piedra',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caripe'));	
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Agustin',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caripe'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Teresen',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Caripe'));
/*Parroquias del Municipio Cedeño*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caicara',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Areo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Felix',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Viento Fresco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cedeño' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Ezequiel Zamora*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Punta de Mata',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Tejero',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Ezequiel Zamora' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Libertador*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Temblador',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chaguaramas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Alhuacas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tabasca',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Piar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aragua',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aparicio',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chaguaramal',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Pinto',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guanaguana',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Toscana',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Taguaya',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Piar' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Punceres*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Quiriquire',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Punceres'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cachipo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Punceres'));
/*Parroquias del Municipio Santa Barbara*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Barbara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santa Barbara'));
/*Parroquias del Municipio Sotillo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Barrancas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sotillo' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Barrancos de Fajardo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sotillo' AND e.NOMBRE = 'Monagas' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Uracoa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Uracoa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Uracoa'));

											/* Parroquias del Estado Nueva Esparta*/
/*Parroquias del Municipio Arismendi*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Asuncion',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Diaz*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan Bautista',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Diaz'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Zabala',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Diaz'));
/*Parroquias del Municipio Garcia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Valle Espiritu Santo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Garcia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Francisco Fajardo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Garcia'));
/*Parroquias del Municipio Gomez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Ana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Gomez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Gomez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guevara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Gomez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Matasiete',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Gomez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Gomez'));
/*Parroquias del Municipio Maneiro*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pampatar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maneiro'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aguirre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maneiro'));
/*Parroquias del Municipio Marcano*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Griego',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Marcano'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Adrian',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Marcano'));
/*Parroquias del Municipio Mariño*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Porlamar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Mariño' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Tubores*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Punta de Piedras',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tubores'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Barales',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Tubores'));
/*Parroquias del Municipio Antolin del Campo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Plaza de Paraguachi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antolin del Campo'));
/*Parroquias del Municipio Peninsula de Macanao*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Boca del Rio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Peninsula de Macanao'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Peninsula de Macanao'));
/*Parroquias del Municipio Villalba*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Pedro de Coche',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Villalba'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Vicente Fuentes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Villalba'));
										
											/* Parroquias del Estado Portuguesa*/
/*Parroquias del Municipio Guanare*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guanare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanare'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cordoba',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanare'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Virgen de la Coromoto',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanare'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de la Montaña',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanare'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan Guanaguanare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanare'));
/*Parroquias del Municipio Agua Blanca*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Agua Blanca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Agua Blanca'));
/*Parroquias del Municipio Araure*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Araure',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Araure'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rio Acarigua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Araure'));
/*Parroquias del Municipio Esteller*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Piritu',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Esteller'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Uveral',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Esteller'));
/*Parroquias del Municipio Guanarito*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guanarito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanarito'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Divina Pastora',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanarito'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Trinidad de la Capilla',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guanarito'));
/*Parroquias del Municipio M Jose V de Unda*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chabasquen',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'M Jose V de Unda'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Peña Blanca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'M Jose V de Unda'));
/*Parroquias del Municipio Ospino*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ospino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ospino'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aparicion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ospino'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Estacion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ospino'));
/*Parroquias del Municipio Paez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Acarigua',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Payara',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pimpinela',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ramon Peraza',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Paez' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Papelon*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Papelon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Papelon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caño Delgadito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Papelon'));
/*Parroquias del Municipio Santa Rosalia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Playon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santa Rosalia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Florida',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santa Rosalia'));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Biscucuy',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Concepcion',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de Saguaz',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Uvencio A Velasquez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Villa Rosa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael Palo Alzado',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Nueva Esparta' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Turen*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Villa Bruzual',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Turen'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Canelones',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Turen'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Isidro Labrador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Turen'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Cruz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Turen'));
/*Parroquias del Municipio Genaro Boconoito*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Boconoito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Genaro Boconoito'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Antolin Tovar Aquino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Genaro Boconoito'));
/*Parroquias del Municipio San Rafael de Onoto*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael de Onoto',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Rafael de Onoto'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Fe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Rafael de Onoto'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Thermo Morles',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Rafael de Onoto'));
												
												/* Parroquias del Estado Sucre*/
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altagracia',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ayacucho',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Raul Leoni',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Ines',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Valentin Valiente',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Gran Mariscal',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio ANDres Eloy Blanco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mariño',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Eloy Blanco' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Romulo Gallgos',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Eloy Blanco' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio ANDres Mata*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de Areocuar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'ANDres Mata'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tavera Acosta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'ANDres Mata'));
/*Parroquias del Municipio Arismendi*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Antonio Jose de Sucre',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Morro de Puerto Santo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Puerto Santo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rio Caribe',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan Galdonas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Arismendi' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Benitez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Pilar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Benitez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Rincon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Benitez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','General Francisco A Vasquez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Benitez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guaraunos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Benitez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tanapuicito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Benitez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Union',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Benitez'));
/*Parroquias del Municipio Bermudez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bermudez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Macarapana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bermudez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Catalina',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bermudez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bermudez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Teresa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bermudez'));
/*Parroquias del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mariguitar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Cajigal*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertad',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cajigal' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Paujil',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cajigal' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Yaguaraparo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Cajigal' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Cruz S Acosta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Araya',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cruz S Acosta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chacopata',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cruz S Acosta'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manicuare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cruz S Acosta'));
/*Parroquias del Municipio Libertador*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Campo Elias',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tunapuy',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Mariño*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Campo Claro',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Mariño' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Irapa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Mariño' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Marabal',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Mariño' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio de Irapa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Mariño' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Soro',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Mariño' AND e.NOMBRE = 'Sucre' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Mejia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio del Golfo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mejia'));
/*Parroquias del Municipio Montes*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arenas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Montes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aricagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Montes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cocollar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Montes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cumanacoa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Montes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San FernANDo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Montes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Lorenzo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Montes'));
/*Parroquias del Municipio Ribero*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cariaco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ribero'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Catuaro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ribero'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rendon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ribero'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Cruz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ribero'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Maria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ribero'));
/*Parroquias del Municipio Valdez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bideau',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valdez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cristobal Colon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valdez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guiria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valdez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Punta de Piedra',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valdez'));

												/* Parroquias del Estado Táchira*/
/*Parroquias del Municipio San Cristobal*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Dr Francisco Romero Lobo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Cristobal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Concordia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Cristobal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pedro Maria Morantes',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Cristobal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Sebastian',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Cristobal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Juan Bautista',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Cristobal'));
/*Parroquias del Municipio ANDres Bello*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cordero',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Bello' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Antonio Romulo C*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Mesas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Antonio Romulo C'));
/*Parroquias del Municipio Ayacucho*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Colon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ayacucho'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rivas Berti',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ayacucho'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Pedro del Rio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Ayacucho'));
/*Parroquias del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio del Táchira',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Isaias Medina Angarita',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Vicente Gomez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Palotal',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Cardenas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tariba',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cardenas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Amenodoro Rangel Lamu',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cardenas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Florida',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cardenas'));
/*Parroquias del Municipio Cordoba*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Ana del Táchira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cordoba'));
/*Parroquias del Municipio Francisco de MirANDa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Francisco de MirANDa'));
/*Parroquias del Municipio Fernandez Feo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael del Pinal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Fernandez Feo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Alberto Adriani',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Fernandez Feo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santo Domingo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Fernandez Feo'));
/*Parroquias del Municipio Garcia de Hevia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Fria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Garcia de Hevia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Boca de Grita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Garcia de Hevia'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Antonio Paez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Garcia de Hevia'));
/*Parroquias del Municipio Guasimos*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Palmira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Guasimos'));
/*Parroquias del Municipio Independencia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Capacho Nuevo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Independencia' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan German Roscio',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Independencia' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Roman Cardenas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Independencia' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Jauregui*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Grita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jauregui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Emilio C Guerrero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jauregui'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Monseñor Miguel A Salas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jauregui'));
/*Parroquias del Municipio Jose Maria Vargas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Cobre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose Maria Vargas'));
/*Parroquias del Municipio Junin*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rubio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Junin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bramon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Junin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Petrolea',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Junin'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Quinimari',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Junin'));
/*Parroquias del Municipio Libertad*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Capacho Viejo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertad' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cipriano Castro',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertad' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Felipe Rugeles',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertad' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Libertador*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Abejales',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Doradas',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Emeterio Ochoa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Joaquin de Navay',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Libertador' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Lobatera*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Lobatera',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lobatera'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Constitucion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lobatera'));
/*Parroquias del Municipio Michelena*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Michelena',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Michelena'));
/*Parroquias del Municipio Panamericano*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Coloncito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Panamericano'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Palmita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Panamericano'));
/*Parroquias del Municipio Rafael Urdaneta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Delicias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Urdaneta'));
/*Parroquias del Municipio Samuel Maldonado*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Tendida',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Samuel Maldonado'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bocono',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Samuel Maldonado'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Hernandez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Samuel Maldonado'));
/*Parroquias del Municipio San Judas Tadeo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Umuquena',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Juadas Tadeo'));
/*Parroquias del Municipio Seboruco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Seboruco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Seboruco'));
/*Parroquias del Municipio Simon Rodriguez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Simon',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Simon Rodriguez' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Queniquea',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Pablo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Eleazar Lopez Contreras',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Táchira' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Torbes*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Josecito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Torbes'));
/*Parroquias del Municipio Uribante*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pregonero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Uribante'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cardenas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Uribante'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Pablo Peñaloza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Uribante'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Potosi',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Uribante'));
/*Parroquias del Municipio Pedro Maria Ureña*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ureña',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedro Maria Ureña'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Nueva Arcadia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pedro Maria Ureña'));

												/* Parroquias del Estado Trujillo*/
/*Parroquias del Municipio Trujillo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','ANDres Linares',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chiquinquira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cristobal Mendoza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cruz Carrillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Matriz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Monseñor Carrillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Trujillo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tres Esquinas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Trujillo'));
/*Parroquias del Municipio ANDres Bello*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Araguaney',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Bello' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Jaguito',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Bello' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Esperanza',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Bello' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Isabel',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'ANDres Bello' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Bocono*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ayacucho',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bocono',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Burbusay',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Carmen',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','General Rivas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guaramacal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Vega de Guaramacal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Monseñor Juaregui',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mosquey',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rafael Rangel',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Miguel',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Bocono'));
/*Parroquias del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cheregue',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Granados',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sabana Grande',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Candelaria*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arnoldo Gabaldon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Candelaria'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bolivia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Candelaria'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carrillo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Candelaria'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cegarra',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Candelaria'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chejende',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Candelaria'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Salvador Ulloa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Candelaria'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Candelaria'));
/*Parroquias del Municipio Carache*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carache',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carache'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cuicas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carache'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Concepcion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carache'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Panamericana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carache'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Cruz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Carache'));
/*Parroquias del Municipio Escuque*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Escuque',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Escuque'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Union',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Escuque'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sabana Libre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Escuque'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Escuque'));
/*Parroquias del Municipio Jose F M Cañizal*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Antonio Jose de Sucre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose F M Cañizal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Socorro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose F M Cañizal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Caprichos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose F M Cañizal'));
/*Parroquias del Municipio Juan V Campo Elias*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arnoldo Gabaldon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Juan V Campo Elias'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Campo Elias',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Juan V Campo Elias'));
/*Parroquias del Municipio La Ceiba*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Progreso',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Ceiba'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Ceiba',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Ceiba'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Apolonia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Ceiba'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tres de Febrero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Ceiba'));
/*Parroquias del Municipio MirANDa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Agua Caliente',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Agua Santa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Cenizo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Dividive',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Valerita',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Monte Carmelo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Buena Vista',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Monte Carmelo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Monte Carmelo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Monte Carmelo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Maria del Horcon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Monte Carmelo'));
/*Parroquias del Municipio Motatan*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El baño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Motatan'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jalisco',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Motatan'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Motatan',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Motatan'));
/*Parroquias del Municipio Pampan*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Flor de Patria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pampan'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Paz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pampan'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pampan',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pampan'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Ana',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pampan'));
/*Parroquias del Municipio Pampanito*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Concepcion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pampanito'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pampanito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pampanito'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pampanito II',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Pampanito'));
/*Parroquias del Municipio Rafael Rangel*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Betijoque',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Rangel'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Cedro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Rangel'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Gregorio Hernandez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Rangel'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Pueblita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Rangel'));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Paraiso',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Junin',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sabana de Mendoza',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Valmore Rodriguez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Urdaneta*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cabimbu',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jajo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Mesa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Quebrada',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santiago',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tuñame',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Urdaneta' AND e.NOMBRE = 'Trujillo' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Valera*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juan Ignacio Montilla',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valera'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Beatriz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valera'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Puerta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valera'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mendoza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valera'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mercedes Diaz',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valera'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Luis',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valera'));
/*Parroquias del Municipio Rafael Carvajal*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Antonio N Briceño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Carvajal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Campo Alegre',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Carvajal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carvajal',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Carvajal'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Leonardo Suarez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rafael Carvajal'));
												
													/* Parroquias del Estado Vargas*/
/*Parroquias del Municipio Vargas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caraballeda',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carayaca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carlos Soublette',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Curuao',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Catia La Mar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Junko',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Guaira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Macuto',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Maiquetia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Naiguata',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Urimare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Vargas'));
													
													/* Parroquias del Estado Yaracuy*/
/*Parroquias del Municipio San Felipe*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Felipe',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Felipe'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Albarico',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Felipe'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Javier',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'San Felipe'));
/*Parroquias del Municipio Aristides Bastidas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Pablo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Aristides Bastidas'));
/*Parroquias del Municipio Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aroa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bolívar' AND e.NOMBRE = 'Yaracuy' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Bruzual*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chivacoa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bruzual' AND e.NOMBRE = 'Yaracuy' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Campo Elias',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Bruzual' AND e.NOMBRE = 'Yaracuy' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Cocorote*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cocorote',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cocorote'));
/*Parroquias del Municipio Independencia*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Independencia',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Independencia' AND e.NOMBRE = 'Yaracuy' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio La Trinidad*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chivacoa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Trinidad'));
/*Parroquias del Municipio Manuel Monge*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Yumare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Manuel Monge'));
/*Parroquias del Municipio Nirgua*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Nirgua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Nirgua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Salom',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Nirgua'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Temerla',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Nirgua'));
/*Parroquias del Municipio Peña*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Yaritagua',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Peña'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San ANDres',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Peña'));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guama',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Yaracuy' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Urachiche*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Urachiche',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Urachiche'));
/*Parroquias del Municipio Veroes*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Farriar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Veroes'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Guayabo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Veroes'));
/*Parroquias del Municipio Jose Antonio Paez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sabana de Parra',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jose Antonio Paez'));
										
											/* Parroquias del Estado Zulia*/
/*Parroquias del Municipio Maracaibo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Antonio Borjas Romero',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bolívar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cacique Mara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cecilio Acosta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chiquinquira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Coquivacoa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Cristo de Aranza',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Francisco Eugenio B',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Idelfonso Vasquez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Juana de Avila',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Luis Hurtado Higuera',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Dagnino',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Olegario Villalobos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Raul Leoni',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Isidro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Lucia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Venancio Pulgar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Caracciolo Parra Perez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Maracaibo'));
/*Parroquias del Municipio Almirante P*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Isla de Toas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Almirante P'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Monagas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Almirante P'));
/*Parroquias del Municipio Baralt*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','General Urdaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baralt'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertador',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baralt'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Guanipa Matos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baralt'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Marcelino Briceño',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baralt'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pueblo Nuevo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baralt'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Timoteo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Baralt'));
/*Parroquias del Municipio Blvno Guajira*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Alta Guajira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Guajira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Elias Sachez Rubio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Guajira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Guajira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Guajira'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sinamaica',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Blvno Guajira'));
/*Parroquias del Municipio Cabimas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ambrosio',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Aristides Calvani',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carmen Herrera',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','German Rios Linares',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jorge Hernandez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Rosa',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Punta Gorda',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Romulo Betancourt',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Benito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Cabimas'));
/*Parroquias del Municipio Catatumbo*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Encontrados',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Catatumbo'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Udon Perez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Catatumbo'));
/*Parroquias del Municipio Colon*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Moralito',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Carlos del Zulia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Barbara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Cruz del Zulia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colon'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Urribarri',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Colon'));
/*Parroquias del Municipio Francisco J Pulgar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Carlos Quevedo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Francisco J Pulgar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Francisco J Pulgar',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Francisco J Pulgar'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Simon Rodriguez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Francisco J Pulgar'));
/*Parroquias del Municipio Jesus E Lossada*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Ramon Yepez',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jesus E Lossada'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Concepcion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jesus E Lossada'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Mariano Parra Leon',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jesus E Lossada'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jesus E Lossada'));
/*Parroquias del Municipio Jesus M Semprun*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bari',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jesus M Semprun'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jesus M Semprun',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Jesus M Semprun'));
/*Parroquias del Municipio La Cañada de U*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','ANDres Bello',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Cañada de U'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Chiquinquira',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Cañada de U'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Concepcion',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Cañada de U'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Carmelo',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Cañada de U'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Potreritos',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'La Cañada de U'));
/*Parroquias del Municipio Lagunillas*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Alfnso de Ojeda',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lagunillas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Campo Lara',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lagunillas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Eleazar Lopez Contreras',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lagunillas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lagunillas'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Venezuela',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Lagunillas'));
/*Parroquias del Municipio Machiques de P*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Libertad',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Machiques de P'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rio Negro',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Machiques de P'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose de Perija',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Machiques de P'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bartolome de las Casas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Machiques de P'));
/*Parroquias del Municipio Mara*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Sierrita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Las Parcelas',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Luis de Vicente',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Monseñor Marcos Sergio G',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ricaurte',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Rafael',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mara'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Tamare',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Mara'));
/*Parroquias del Municipio MirANDa*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Altagracia',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Ana Maria Campos',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Faria',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Antonio',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Jose',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'MirANDa' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio San Francisco*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Domitila Flores',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'San Francisco' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Bajo',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'San Francisco' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Francisco Ochoa',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'San Francisco' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Los Cortijos',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'San Francisco' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Marcial Hernandez',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'San Francisco' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','San Francisco',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'San Francisco' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Santa Rita*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Mene',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santa Rita'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Jose Cenovio Urribarri',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santa Rita'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Pedro Lucas Urribarri',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santa Rita'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Santa Rita',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Santa Rita'));
/*Parroquias del Municipio Simon Bolívar*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Manuel Manrique',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Simon Bolívar' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rafael Maria Baralt',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Simon Bolívar' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rafael Urdaneta',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Simon Bolívar' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Sucre*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Bobures',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Batey',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Gibraltar',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Heras',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Arturo Celestino',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Romulo Gallegos',(SELECT m.CODIGO FROM LUGAR m, LUGAR e WHERE m.TIPO = 'Municipio' AND m.NOMBRE = 'Sucre' AND e.NOMBRE = 'Zulia' AND m.FK_LUGAR = e.CODIGO));
/*Parroquias del Municipio Rosario de Perija*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Donaldo Garcia',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rosario de Perija'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','El Rosario',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rosario de Perija'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Sixto Zambrano',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Rosario de Perija'));
/*Parroquias del Municipio Valmore Rodriguez*/
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','La Victoria',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valmore Rodriguez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Rafael Urdaneta',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valmore Rodriguez'));
INSERT INTO LUGAR VALUES (nextval('lugar_codigo_seq'),'Parroquia','Raul Cuenca',(SELECT CODIGO FROM LUGAR WHERE TIPO = 'Municipio' AND NOMBRE = 'Valmore Rodriguez'));

/*EMPLEADOS*/
INSERT INTO EMPLEADO VALUES (648949, 'Lucila', 'Crisolia', 'De Gonzalez', 'Aranguren', 'Mercantil', 20000000, '02/05/2006', '31/10/1948', null, null, 'Directora', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (2110338, 'Jose', 'Felix', 'Gonzalez', 'Perez', 'Banesco', 20000000, '01/09/2006', '25/02/1944', null, null, 'Administrador', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (10332708, 'Roxana', 'Maria', 'Gonzalez', 'Aranguren', 'Banesco', 6000000, '01/09/2006', '06/11/1969', null, null, 'Secretaria Adm', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (18329356, 'Yalitza', 'C', 'Insua', 'Santoyo', 'Banesco', 4500000, '13/09/2012', null, null, null, 'Coordinadora', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (16438861, 'Andreina', null, 'Mundo', null, 'Banesco', 3200000, '16/01/2014', null, null, null, 'Docente', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (26217421, 'Skarleth', 'A', 'Almeida', 'N', 'Provincial', 3200000, '05/03/2018', null, null, null, 'Docente', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (15166540, 'Elizabeth', 'J', 'Cayonez', 'R', 'Banesco', 3200000, '12/09/2013', null, null, null, 'Docente', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (5416652, 'Taydee', 'G', 'Naranjo', 'Seijas', 'Provincial', 3200000, '14/02/2018', null, null, null, 'Docente', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (6868252, 'Nelly', 'M', 'Rodriguez', 'De Veira', 'Banesco', 3000000, '09/09/2014', null, null, null, 'Auxiliar', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (6293741, 'Kilsin', null, 'Mijares', null, 'Mercantil', 3000000, '13/09/2010', null, null, null, 'Auxiliar', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (5223483, 'Noris', null, 'Rivas', null, 'Mercantil', 3000000, '02/05/2006', null, null, null, 'Auxiliar', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (8421185, 'Marleny', null, 'Rueda', 'H', 'Mercantil', 3000000, '16/09/2008', null, null, null, 'Auxiliar', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (14409682, 'Eglee', 'Milagros', 'Fernandez', null, 'Banesco', 3000000, '14/09/2009', null, null, null, 'Auxiliar', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (17078153, 'Nikarilis', 'E', 'Madrid', 'Fonseca', 'Mercantil', 3000000, '15/09/2014', null, null, null, 'Auxiliar', null, null, null, 1);
INSERT INTO EMPLEADO VALUES (25281481, 'Rosanna', null, 'Rodriguez', null, 'Banesco', 3000000, '15/10/2015', null, null, null, 'Obrera', null, null, null, 1);

# ApiRest
Api register

É uma api para cadastrar usuários e suas localidades, possuindo duas tabelas:

Tabela PEOPLE 
+------+--------------+------------+------------+
|  id  |     name     | birth_date | address_id |
|_int8_|_varchar(255)_|__timestamp_|____int8____|

A coluna ADDRESS_ID faz um vínculo com a tabela ADDRESS
+------+--------------+--------------+--------------+
|  id  |     city     |     cep      |    number    |
|_int8_|_varchar(255)_|_varchar(255)_|_varchar(255)_|

Além de cadastrar, o usuário também pode buscar e excluir registros.

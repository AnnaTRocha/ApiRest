# ApiRest
Api register

É uma api para cadastrar usuários e suas localidades, possuindo duas tabelas:

Tabela PEOPLE 

<table border="1">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>birth_date</td>
        <td>address_id</td>
    </tr>
    <tr>
        <td>int8</td>
        <td>varchar(255)</td>
        <td>timestamp</td>
        <td>int8</td>
    </tr>
</table>

A coluna ADDRESS_ID faz um vínculo com a tabela ADDRESS

<table border="1">
    <tr>
        <td>id</td>
        <td>city</td>
        <td>cep</td>
        <td>number</td>
    </tr>
    <tr>
        <td>int8</td>
        <td>varchar(255)</td>
        <td>varchar(255)</td>
        <td>varchar(255)</td>
    </tr>
</table>

Além de cadastrar, o usuário também pode buscar e excluir registros.

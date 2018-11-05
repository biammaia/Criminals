<%--
  Created by IntelliJ IDEA.
  User: felipeokino
  Date: 22/10/18
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Registro</title>
  <meta charset="UTF-8"/>
  <link rel="stylesheet" type="text/css" href="style.css">
  <%--<meta http-equiv="refresh" content="0"/>--%>
</head>
</head>
<body>
<fieldset class="principal">
  <h2 >Novo Criminoso</h2>
  <form id="register_form">
    <div class="form_child">
      <label>CPF</label>
      <input type="text" name="cpf">

      <label>Nome</label>
      <input type="text" name="first_name">

      <label>Sobrenome</label>
      <input type="text" name="last_name">

      <label>Nascimento</label>
      <input type="date" name="niver">
    </div>
    <div style="margin-top: 10%">
      <div style="margin-bottom: 2%">
        <label>Pertence a gangue?</label>
        <input type="checkbox" name="VISUAL">
      </div>
    </div>
    <div>
      <input type="submit" name="enviar" value="Enviar">
      <input type="reset" name="limpar" value="limpar">
    </div>
  </form>
</fieldset>
</body>
</html>

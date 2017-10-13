<%-- 
    Document   : Usuario
    Created on : 12/10/2017, 19:26:58
    Author     : BRYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatecpg.quiz.Usuario"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Usuário</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <form>
            <input type="text" name="login" id="name" value="" placeholder="Escreva seu nome" />
            <input type="submit" name="submit" value="Logar"/>
        </form>

        <%
            HttpSession sessao = request.getSession();
            String usuario = "";
            usuario = (String) sessao.getAttribute("usuario");
            if ((String) sessao.getAttribute("usuario") != null) {
                sessao.removeAttribute("usuario");

            }

        %>


    </body>

</html>

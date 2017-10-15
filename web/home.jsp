<%-- 
    Document   : home
    Created on : 13/10/2017, 16:01:05
    Author     : felipe
--%>

<%@page import="br.com.fatecpg.Jogador"%>
<%@page import="br.com.fatecpg.Questoes"%>
<%@page import="br.com.fatecpg.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<% if(request.getParameter("sair") != null){ //sempre que tiver sair ele limpa todos os arraylist
    Jogador.Limpar();
    Questoes.Limpar();
    response.sendRedirect(request.getRequestURI());
}
if (request.getParameter("quiz") != null){ //quando clicar no iniciar ele carrega as questões
    String resposta[] = {
            request.getParameter("0"),
            request.getParameter("1"),
            request.getParameter("2"),
            request.getParameter("3"),
            request.getParameter("4"),
            request.getParameter("5"),
            request.getParameter("6"),
            request.getParameter("7"),
            request.getParameter("8"),
            request.getParameter("9")
    };
    Questoes.validaTeste(resposta);
    Jogador.setMedia(Questoes.calculaMedia());
    Jogador.setNotaAnterior(Questoes.getUltNota());
}%>


<html>
    <head>
        <title>Quiz - Página inicial</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/main.css"/>
        <link rel="stylesheet" href="css/home.css"/>
        <script src="js/jquery.min.js"></script>
        <script src="js/home.js"></script>
    </head>
    <body>
        <nav>
            <div class="container-fluid"></div>
        </nav>
        <div class="container">
            <% if(request.getParameter("quiz") == null) { %>   
            <div class="row">
                <div class="offset-md-2 col-md-8 quiz-desc">
                    <h1>Bem-vindo</h1>
                    <p>Você é fã de Harry Potter? Então vamos testar seus conhecimentos. Inicie o Quiz!</p>
                    <form method="POST" action="quiz.jsp" id="form" autocomplete="off">
                        <div class="form-inline">
                            <div id="div-danger" class="form-group">
                                <input id="nome_jogador" class="form-control form-control-lg" 
                                       type="text" name="nome_jogador" placeholder="Digite seu nome"/>
                            </div>
                        <button id="bt_submit" type="submit" class="btn btn-outline-success btn-lg">Iniciar Teste</button>
                        </div>
                    </form>
                </div>
            </div>
        <% } %>
        
        <% if(request.getParameter("quiz") != null) { %>
        <div class="row">
            <div class="offset-md-2 col-md-8 estatistica">
                <h2>Porcentagem de acertos de <%= Jogador.getNome() %></h2><hr>
                <div class="esquerda">
                    <h3>Última prova: <%= Jogador.getNotaAnterior()+"%"%></h3>
                    <h3>Prova feita <%= Questoes.getCt() %> vezes</h3>
                </div>
                </br>
                <div class="direita">
                    <h3>Média: <%= Jogador.getMedia()+"%" %></h3>
                </div>
                <div class="botoes">
                    <form method="POST">
                        <button type="submit" class="btn btn-outline-danger" name="sair" value="1">Sair</button>    
                        <a class="btn btn-outline-success" href="quiz.jsp">Fazer novamente</a>
                    </form>
                </div>
            </div>
        </div>
        <% } %>
        <footer>
            <div class="container-fluid"></div>
        </footer>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
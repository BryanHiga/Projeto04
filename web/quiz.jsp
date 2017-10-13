<%@page import="br.com.fatecpg.quiz.Questão"%>
<%@page import="br.com.fatecpg.quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz - Web Quiz</title>
    </head>

    <h1>WebQuiz</h1>
    <h2>Quiz</h2>
    <h3>Questões: </h3>
    <%
        if (request.getParameter("finalizar") != null) {
            int acertos = 0;

            for (Questão q : Quiz.getPergunta()) {
                String resposta = request.getParameter(q.getQuestao());
                if (resposta != null) {
                    if (resposta.equals(q.getResponda())) {
                        acertos++;
                    }
                }
            }

            Quiz.contagem++;
            Quiz.soma +=(100.00*((double)acertos/10.0));

        }     
    %>
    <form>
        <%for (Questão q : Quiz.getPergunta()) {%> <h4><%= q.getResponda()%></h4>
        <input type="radio" name="<%= q.getResponda()%>" value="<%= q.getAlternativa()[0]%>" />
        <%= q.getAlternativa()[0]%>
        <input type="radio" name="<%= q.getResponda()%>" value="<%= q.getAlternativa()[1]%>" />
        <%= q.getAlternativa()[1]%>
        <input type="radio" name="<%= q.getResponda()%>" value="<%= q.getAlternativa()[2]%>" />
        <%= q.getAlternativa()[2]%>            
        <%}%>
        <br/><br/>
        <input type="submit" name="finalizar" value="Finalizar"/>
    </form>

</html>

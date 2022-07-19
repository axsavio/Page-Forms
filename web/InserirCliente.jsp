<%-- 
    Document   : InserirCliente
    Created on : 15 de jul. de 2022, 12:59:22
    Author     : alexs
--%>

<%@page import="br.com.DAO.PessoaDAO"%>
<%@page import="br.com.DTO.PessoaDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registros</title>
    </head>
    <body>
        
        
        <%
            
      try {
                PessoaDTO objPessoaDTO = new PessoaDTO(); //Instanciar para acessar o objeto
        objPessoaDTO.setName(request.getParameter("name"));
        objPessoaDTO.setCpf(request.getParameter("cpf"));
        objPessoaDTO.setEmail(request.getParameter("email"));
        objPessoaDTO.setDate(request.getParameter("date"));
        objPessoaDTO.setSexo(request.getParameter("sexo"));
        objPessoaDTO.setPassword(request.getParameter("password"));
       
        
               PessoaDAO objPessoaDAO = new PessoaDAO();
        objPessoaDAO.CadastrarCliente(objPessoaDTO); //
          } catch (Exception e) {
          
          }

        %>
        
        <h1>
            Cadastro feito com Sucesso!!
        </h1>
        <h2>
            <a href="index.html"> Voltar para Pagina Principal </a>
        </h2>
        
    </body>
</html>

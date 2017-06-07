<%-- 
    Document   : c
    Created on : 11/03/2016, 01:29:30 PM
    Author     : Rosita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <title>Facelet Title</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script>
         // var webresource="<%=getServletContext().getContextPath()%>/webresources";
          //var calculadoraRest=webresource+"/calculadora";
          var factorialPath="https://localhost:8181/SeguridadWeb2/webresources/calculadora/factorial";
          function init(){
            $("#factorialBtn").click(function(){
             var vBase=$("#f_base").val();
             var vAltura=$("#f_altura").val();
             $.ajax(factorialPath,
             {
               data:{base:vBase,altura:vAltura},
            success:function(resp){
            $("#f_resultado").text("Resultado:"+resp);    
            }   
             });
                
            });  
              
          }
        </script>
    </head>
    <body>
        <h1>Calculo de Area</h1>
        <form onload="init()">
            <fieldset>
                <legend>Factorial</legend>
                <label for="f_base">Base</label><input id="f_base" name="base" /><br/>
                <label for="f_altura">Altura</label><input id="f_altura" name="altura" /><br/>
                <button id="factorialBtn" type="button">Calcular</button>
                <div id="f_resultado"></div>
            </fieldset>
        </form>
    </body>
    
</html>


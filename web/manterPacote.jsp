<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Cadastro de Pacote</title>
        <%@ include file = "header.jsp" %>
    <div class="col">
        <form class="row g-3">
            <h2><span id="acao"></span>Pacote</h2>
            
            <div class="col-12">
                <label for="name" class="form-label">CPF do Cliente</label>
                <input type="text" class="form-control" id="name" placeholder="">
            </div>
            
            <div class="col-12">
                <label for="cpf" class="form-label">CPF do Funcionário</label>
                <input type="text" class="form-control" id="cpf" placeholder="">
            </div>
            
            <div class="col-12">
                <div class="form-group"><script src="./Scripts/ViaCep.js"></script></div>
                <button type="submit" class="btn btn-primary" id="botaoSubmit">Salvar</button>
            </div>
        </form>
    </div>
    <script src="./Scripts/main.js"></script>
            
</body>
</html>
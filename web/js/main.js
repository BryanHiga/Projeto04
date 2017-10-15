$(document).ready(function() {
    
    var questaoAtual = 0;
    $('#q0').css('display', 'block');
    
    $('#bt_voltar').on('click', function(){
        if(questaoAtual != 0) {
            questaoAtual--;
            if(questaoAtual != 9) {
                $('#bt_enviar').css('display','none');
            }
            esconderTudo(questaoAtual);
        }    
    });
    $('#bt_avancar').on('click', function(){
        if(questaoAtual != 9) {
            questaoAtual++;
            if(questaoAtual == 9){
                $('#bt_enviar').css('display','block');
            }
            esconderTudo(questaoAtual);
        }
    });
    $('#bt_abandonar').on('click', function(event){
       $(location).attr('href','home.jsp');
    });
});

function esconderTudo(quest){
    for(i = 0; i<=9; i++) {
        if(i==quest) {
            $('#q'+i).css('display', 'block');
            console.log('display');
        }
        else {
            $('#q'+i).css('display', 'none');
            console.log('none');
        }
    }
}
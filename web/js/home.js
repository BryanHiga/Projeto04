$(function(){
    var tela = $(document).height();
    var quiz = $('.quiz-desc').height();
    var meioTela= (tela - quiz*2)/2;
    
    $('.quiz-desc').css('margin-top', meioTela);
    
    // VERIFICAÇÃO SE CAMPO NOME ESTA VAZIO ==========================
    $('#bt_submit').on('click', function(event){
        event.preventDefault();
        if($.trim($('#nome_jogador').val()) === '') 
            $('#div-danger').toggleClass('has-danger');
        else 
            $('#form').submit();
    });
    //================================================================
    
});
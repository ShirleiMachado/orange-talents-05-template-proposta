package br.com.zupacademy.shirlei.proposta.analiseProposta;

import br.com.zupacademy.shirlei.proposta.proposta.Proposta;

public class AnaliseResponse {

    private String documento;
    private String nome;
    private StatusAnalise resultadoSolicitacao;
    private String idProposta;

    public AnaliseResponse(
            String documento,
            String nome,
            StatusAnalise resultadoSolicitacao,
            String idProposta
    ){
        this.documento = documento;
        this.nome = nome;
        this.resultadoSolicitacao = resultadoSolicitacao;
        this.idProposta = idProposta;
    }

    public Proposta.StatusProposta getResultadoSolicitacao(){

        return resultadoSolicitacao.toStatusProposta();
    }
}

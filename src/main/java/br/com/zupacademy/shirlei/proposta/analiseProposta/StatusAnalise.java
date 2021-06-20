package br.com.zupacademy.shirlei.proposta.analiseProposta;

import br.com.zupacademy.shirlei.proposta.proposta.Proposta;

public enum StatusAnalise {
    SEM_RESTRICAO, COM_RESTRICAO;

    public Proposta.StatusProposta toStatusProposta(){
        return this.equals(SEM_RESTRICAO) ? Proposta.StatusProposta.ELEGIVEL:Proposta.StatusProposta.NAO_ELEGIVEL;
    }


}

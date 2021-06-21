package br.com.zupacademy.shirlei.proposta.analiseProposta;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "http://localhost:9999", name = "analise")
public interface AnaliseClient {

    @RequestMapping(value = "/api/solicitacao", method = RequestMethod.POST, consumes = "application/json")
    AnaliseResponse verificaStatusSolicitante(AnaliseRequest pedidoAvaliacao);
}



package br.com.zupacademy.shirlei.proposta.analiseProposta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "${proposta.services.analise.host}", name = "analise")
public interface AnaliseClient {

    @PostMapping("\"${proposta.services.analise.solicitacao}\"")
    AnaliseResponse verificaStatusSolicitante(AnaliseRequest pedidoAvaliacao);
}

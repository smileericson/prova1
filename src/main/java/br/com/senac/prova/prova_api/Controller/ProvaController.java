package br.com.senac.prova.prova_api.Controller;

import br.com.senac.prova.prova_api.DTOS.ResponseDTOS;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prova")
@CrossOrigin

public class ProvaController {

    @GetMapping("/validarNumero")
    public ResponseEntity<ResponseDTOS> validarNumero(@RequestParam double numero){

        ResponseDTOS restoDivisao = new ResponseDTOS();
        restoDivisao.setRestoDivisao(numero%2);

        if (restoDivisao.getRestoDivisao() == 0){
            restoDivisao.setImparPar(" PAR ");
        }
        else{
            restoDivisao.setImparPar("IMPAR");
        }
        return ResponseEntity.ok(restoDivisao);

    }


}

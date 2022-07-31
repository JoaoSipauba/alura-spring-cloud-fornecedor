package br.com.alura.microservices.fornecedor.service;

import br.com.alura.microservices.fornecedor.model.InfoFornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        System.out.println(infoRepository.findByEstado(estado));
        return infoRepository.findByEstado(estado);
    }

}

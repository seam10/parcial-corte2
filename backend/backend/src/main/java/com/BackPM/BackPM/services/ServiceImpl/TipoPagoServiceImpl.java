package com.BackPM.BackPM.services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackPM.BackPM.models.TipoPago;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.repositories.ITipoPagoRepository;
import com.BackPM.BackPM.services.IService.ITipoPagoService;

@Service
public class TipoPagoServiceImpl extends ABaseService<TipoPago> implements ITipoPagoService {

    @Autowired
    private ITipoPagoRepository TipoPagoRepository;

    @Override
    protected IBaseRepository<TipoPago, Long> getRepository() {
        return TipoPagoRepository;
    }
}

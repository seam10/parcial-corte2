package com.BackPM.BackPM.services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackPM.BackPM.models.Factura;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.repositories.IFacturaRepository;
import com.BackPM.BackPM.services.IService.IFacturaService;

@Service
public class FacturaServiceImpl extends ABaseService<Factura> implements IFacturaService {

    @Autowired
    private IFacturaRepository FacturaRepository;

    @Override
    protected IBaseRepository<Factura, Long> getRepository() {
        return FacturaRepository;
    }
}

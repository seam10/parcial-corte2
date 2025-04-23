package com.BackPM.BackPM.services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackPM.BackPM.models.Producto;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.repositories.IProductoRepository;
import com.BackPM.BackPM.services.IService.IProductoService;

@Service
public class ProductoServiceImpl extends ABaseService<Producto> implements IProductoService {

    @Autowired
    private IProductoRepository ProductoRepository;

    @Override
    protected IBaseRepository<Producto, Long> getRepository() {
        return ProductoRepository;
    }
}

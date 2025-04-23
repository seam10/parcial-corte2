package com.BackPM.BackPM.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BackPM.BackPM.models.Factura;
import com.BackPM.BackPM.services.IService.IFacturaService;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends ABaseController<Factura, IFacturaService> {

    public FacturaController(IFacturaService service) {
        super(service, "Factura");
    }
}

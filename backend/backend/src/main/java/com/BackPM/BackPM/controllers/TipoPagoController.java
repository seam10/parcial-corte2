package com.BackPM.BackPM.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BackPM.BackPM.models.TipoPago;
import com.BackPM.BackPM.services.IService.ITipoPagoService;

@RestController
@RequestMapping("/tipos-pago")
public class TipoPagoController extends ABaseController<TipoPago, ITipoPagoService> {

    public TipoPagoController(ITipoPagoService service) {
        super(service, "TipoPago");
    }
}

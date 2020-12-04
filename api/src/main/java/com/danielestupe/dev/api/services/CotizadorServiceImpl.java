package com.danielestupe.dev.api.services;

import com.danielestupe.dev.api.models.Cotizador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Quote")
public class CotizadorServiceImpl implements CotizadorService {
  @Autowired
  private PaisService paisService;
  @Autowired
  private CategoriaClienteService clienteService;

  public Float getQuote(Cotizador cotizador) {
    float tarifa = paisService.getRate(cotizador.getPaisDestinoId());
    float descuento = clienteService.getDiscount(cotizador.getCategoriaClienteId());

    float peso = cotizador.getPeso();
    float alto = cotizador.getDimension().getAlto();
    float ancho = cotizador.getDimension().getAncho();
    float largo = cotizador.getDimension().getLargo();

    float resultado = (peso * tarifa) + (1.66F * alto * largo * ancho) - (descuento * 0.5F * peso);

    return resultado;
  }
}

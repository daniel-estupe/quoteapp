import { Component, OnInit } from '@angular/core';
import { QuoteapiService } from './quoteapi.service';
import Cotizador from './interfaces/Cotizador';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent implements OnInit {
  title = 'client-app';
  regiones: Object;
  paises: Object;
  categorias: Object;

  cotizador: Cotizador = {
    peso: null,
    dimension: {
      ancho: null,
      alto: null,
      largo: null
    },
    paisDestinoId: null,
    categoriaClienteId: null
  };
  
  costo: number = 0;

  constructor(private _api: QuoteapiService) {}

  ngOnInit() {
    this._api.getRegions().subscribe(data => {
      this.regiones = data
    })

    this._api.getCountries().subscribe(data => {
      this.paises = data;
    })

    this._api.getCategories().subscribe(data => {
      this.categorias = data;
    })
  }

  calcularCosto() {
    this._api.getQuote(this.cotizador).subscribe((data: number) => {
      this.costo = data;
    })
  }
}

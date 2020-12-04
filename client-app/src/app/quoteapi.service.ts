import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class QuoteapiService {

  constructor(private _http: HttpClient) { }

  getRegions() {
    return this._http.get('http://localhost:8086/api/regiones');
  }

  getCountries() {
    return this._http.get('http://localhost:8086/api/paises')
  }

  getCategories() {
    return this._http.get('http://localhost:8086/api/categorias')
  }

  getQuote(data) {
    return this._http.post('http://localhost:8086/api/cotizador', data);
  }
}

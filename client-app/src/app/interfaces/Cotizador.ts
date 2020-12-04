import Dimension from './Dimension';

export default interface Cotizador {
  peso: number,
  dimension: Dimension,
  paisDestinoId: number,
  categoriaClienteId: number
}
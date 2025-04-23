import React from 'react';

export const TiposDePago: React.FC<{ metodo: string; setMetodo: (m: string) => void }> = ({ metodo, setMetodo }) => {
  return (
    <div>
      <h2>Método de Pago</h2>
      <select value={metodo} onChange={(e) => setMetodo(e.target.value)}>
        <option value="efectivo">Efectivo</option>
        <option value="tarjeta">Tarjeta</option>
        <option value="transferencia">Transferencia</option>
      </select>
    </div>
  );
};

import React from 'react';

export const Factura: React.FC<{ cliente: string; setCliente: (nombre: string) => void }> = ({ cliente, setCliente }) => {
  return (
    <div>
      <h2>Factura</h2>
      <input
        type="text"
        value={cliente}
        onChange={(e) => setCliente(e.target.value)}
        placeholder="Nombre del cliente"
      />
    </div>
  );
};

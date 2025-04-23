import React, { useState } from 'react';
import { Productos } from './Productos';
import { Factura } from './Factura';
import { TiposDePago } from './TiposDePago';

export const PantallaPrincipal: React.FC = () => {
  const [cliente, setCliente] = useState('');
  const [metodoPago, setMetodoPago] = useState('efectivo');
  const [carrito, setCarrito] = useState<any[]>([]);

  const agregarAlCarrito = (producto: any) => {
    setCarrito([...carrito, producto]);
  };

  return (
    <div>
      <h1>Venta</h1>
      <Factura cliente={cliente} setCliente={setCliente} />
      <Productos agregarAlCarrito={agregarAlCarrito} />
      <TiposDePago metodo={metodoPago} setMetodo={setMetodoPago} />
      <h3>Resumen:</h3>
      <p>Cliente: {cliente}</p>
      <p>Método de Pago: {metodoPago}</p>
      <ul>
        {carrito.map((p, i) => (
          <li key={i}>{p.nombre} - ${p.precio}</li>
        ))}
      </ul>
    </div>
  );
};

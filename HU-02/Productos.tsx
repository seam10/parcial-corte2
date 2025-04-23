import React, { useState } from 'react';

interface Producto {
  id: number;
  nombre: string;
  precio: number;
}

const productosDisponibles: Producto[] = [
  { id: 1, nombre: 'Pan', precio: 2000 },
  { id: 2, nombre: 'Galletas', precio: 1500 },
  { id: 3, nombre: 'Torta', precio: 5000 },
];

export const Productos: React.FC<{ agregarAlCarrito: (producto: Producto) => void }> = ({ agregarAlCarrito }) => {
  return (
    <div>
      <h2>Productos</h2>
      <ul>
        {productosDisponibles.map((producto) => (
          <li key={producto.id}>
            {producto.nombre} - ${producto.precio}
            <button onClick={() => agregarAlCarrito(producto)}>Agregar</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

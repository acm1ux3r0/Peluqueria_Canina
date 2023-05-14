-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-06-2021 a las 13:15:54
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `peluqueria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `canes`
--

CREATE TABLE `canes` (
  `num_cliente` int(11) NOT NULL COMMENT 'Cliente Numero',
  `nombre_perro` varchar(20) NOT NULL COMMENT 'Nombre del can',
  `raza` varchar(20) NOT NULL COMMENT 'Raza del can',
  `color` varchar(20) NOT NULL COMMENT 'Color del can',
  `alergico` tinyint(1) DEFAULT 0 COMMENT 'Es alergico?',
  `atencion_especial` tinyint(1) DEFAULT 0 COMMENT 'Necesita atención especial?',
  `nombre_duenio` varchar(20) NOT NULL COMMENT 'Nombre del dueño',
  `celular_duenio` varchar(20) NOT NULL COMMENT 'Celular del dueño',
  `observaciones` text DEFAULT 'Sin observaciones' COMMENT 'Observaciones'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `canes`
--

INSERT INTO `canes` (`num_cliente`, `nombre_perro`, `raza`, `color`, `alergico`, `atencion_especial`, `nombre_duenio`, `celular_duenio`, `observaciones`) VALUES
(1, 'Pichichu', 'Pichu', 'Gris', 1, 1, 'Rosales Claudio', '555', 'Tener cuidado con la pata delantera derecha'),
(2, 'Bravitus', 'Ladrador', 'Negro orejas blancas', 0, 0, 'Blanco Julio', '6667', ''),
(3, 'Molesteitor', 'Mordedor', 'Rojo', 1, 0, 'Julio', '111', 'Alergia a Julio'),
(4, 'Guardian', 'Protectorians', 'Verde ojos tempano', 0, 1, 'Julian Marcos', '963', 'Corte al raz'),
(5, 'Triniti', 'Matrixul', 'Naranja y negro', 0, 0, 'Neox', '777', 'Tener cuidado con sus anteojos'),
(6, 'Perla', 'Diamons', 'Ruby', 0, 0, 'Reina Beatriz', '45', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `canes`
--
ALTER TABLE `canes`
  ADD PRIMARY KEY (`num_cliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `canes`
--
ALTER TABLE `canes`
  MODIFY `num_cliente` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Cliente Numero', AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

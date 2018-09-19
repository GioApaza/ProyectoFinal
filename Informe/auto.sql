-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-03-2018 a las 14:48:28
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `auto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `auto`
--

CREATE TABLE `auto` (
  `codigoAuto` int(11) NOT NULL,
  `color` varchar(30) DEFAULT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `numeroPuestos` int(11) DEFAULT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `precio` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AVG_ROW_LENGTH=2340 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `auto`
--

INSERT INTO `auto` (`codigoAuto`, `color`, `modelo`, `numeroPuestos`, `marca`, `stock`, `precio`) VALUES
(12, 'Blanco', 'MK12', 4, 'BMW', 2, '12560'),
(13, 'Gris', 'YY66', 2, 'PORSCHE', 1, '14600'),
(14, 'Negro Opaco', 'GG99', 4, 'CHEVROLET', 2, '12890'),
(15, 'Azul Oscuro', 'PO90', 6, 'FORD', 2, '7350'),
(16, 'Rosa', 'GL47', 5, 'NISSAN', 3, '6420'),
(17, 'Negro', 'LK50', 4, 'VOLVO', 2, '13800'),
(18, 'Verde', 'KJ89', 4, 'KIA', 3, '7590');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codigoCliente` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AVG_ROW_LENGTH=1820 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codigoCliente`, `nombre`) VALUES
(1, 'Alberto'),
(11, 'a'),
(120, 'Karen Alvarenga'),
(123, 'Roberto Romero'),
(456, 'Jesus Guzman'),
(745, 'Alicia Villaroel'),
(753, 'Luis Gutierrez'),
(789, 'Vladimir Claros'),
(834, 'Luca Ferreri'),
(951, 'Laura Pinto'),
(965, 'Alejandro Orellana'),
(1213, 'vfv');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `codigoCompra` int(11) NOT NULL,
  `codigoAuto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`codigoCompra`, `codigoAuto`, `cantidad`) VALUES
(1, 12, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `codigoDetalleCompra` int(11) NOT NULL,
  `numeroContrato` int(11) DEFAULT NULL,
  `codigoAuto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`codigoDetalleCompra`, `numeroContrato`, `codigoAuto`, `cantidad`) VALUES
(1, 1, 12, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `codigoDetalleVenta` int(11) NOT NULL,
  `numeroContrato` int(11) DEFAULT NULL,
  `codigoAuto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`codigoDetalleVenta`, `numeroContrato`, `codigoAuto`, `cantidad`) VALUES
(3, 3, 12, 3),
(122, 122, 12, 121);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `numeroFactura` int(11) NOT NULL,
  `monto` double DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `NIT` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`numeroFactura`, `monto`, `fecha`, `NIT`) VALUES
(3, 37680, '2018-03-15', '12'),
(122, 1519760, '2018-03-15', '322');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `codigoProveedor` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AVG_ROW_LENGTH=3276 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`codigoProveedor`, `nombre`, `telefono`, `direccion`) VALUES
(1, 'q', 12, 'q'),
(12, 'adrian', 121, 'cdc'),
(100, 'Ford Motor/EU', 2147483647, 'EU'),
(123, 'Volkswagen Group/Alemania', 756984236, 'Mexico'),
(486, 'BMW Group/Alemania', 2147483647, 'Alemania'),
(856, 'Toyota Motor/Japón', 815874569, 'Japón'),
(994, 'Daimler/Alemania', 498965547, 'Alemania');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `codigoVenta` int(11) NOT NULL,
  `codigoAuto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`codigoVenta`, `codigoAuto`, `cantidad`) VALUES
(1, 12, 2),
(2, 12, 2),
(3, 12, 3),
(122, 12, 121);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `auto`
--
ALTER TABLE `auto`
  ADD PRIMARY KEY (`codigoAuto`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigoCliente`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`codigoCompra`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`codigoDetalleCompra`),
  ADD KEY `FK_detallecompra_auto_codigoAuto` (`codigoAuto`),
  ADD KEY `FK_detallecompra_contratocomprador_numeroContratoCompra` (`numeroContrato`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`codigoDetalleVenta`),
  ADD KEY `FK_detalleventa_auto_codigoAuto` (`codigoAuto`),
  ADD KEY `FK_detalleventa_contratoventa_numeroContratoVenta` (`numeroContrato`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`numeroFactura`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`codigoProveedor`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`codigoVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `auto`
--
ALTER TABLE `auto`
  MODIFY `codigoAuto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `numeroFactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `codigoProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=995;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 17, 2021 at 03:42 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perusahaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(10) NOT NULL,
  `nama_barang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `harga` int(10) NOT NULL,
  `stok` int(10) NOT NULL DEFAULT 10
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `harga`, `stok`) VALUES
(1, 'Octarine Core', 5275, 10),
(2, 'Eternal Shroud', 3300, 6),
(3, 'Eye Of Skadi', 5300, 8),
(4, 'Bloodstone', 5750, 9),
(5, 'Divine Rapier', 6000, 9),
(6, 'Wind Waker', 7125, 10),
(7, 'Battle Fury', 4130, 10),
(8, 'Ethereal Blade', 4300, 9),
(9, 'Radiance', 5150, 10),
(10, 'Daedalus', 5150, 10),
(11, 'Silver Edge', 5600, 6),
(12, 'Mjolnir', 5600, 5),
(13, 'Witch Blade', 2600, 7),
(14, 'Refresher Orb', 5600, 9),
(15, 'Scyte Of Vyse', 5675, 9),
(16, 'Glepnir', 6160, 7),
(17, 'Black King Bar', 4050, 9),
(18, 'Linken\'s Sphere', 4600, 10),
(19, 'Hurricane Pike', 4550, 7),
(20, 'Assault Cuirass', 5125, 8);

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` int(10) NOT NULL,
  `nama_karyawan` varchar(255) NOT NULL,
  `no_telp` varchar(12) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `no_telp`, `alamat`) VALUES
(1, 'Side Shop', '14045', 'Radiant'),
(2, 'Secret Shop', '14022', 'Jungle'),
(3, 'Mid Shop', '14099', 'Dire'),
(4, 'Top Shop', '14011', 'Jungle');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(10) NOT NULL,
  `nama_pembeli` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `id_karyawan` int(10) NOT NULL,
  `id_barang` int(10) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `nama_pembeli`, `alamat`, `id_karyawan`, `id_barang`, `status`) VALUES
(1, 'Visage', 'Radiant', 1, 12, 'Lunas'),
(2, 'Storm', 'Dire', 1, 2, 'Kredit'),
(3, 'Ember', 'Radiant', 1, 3, 'Lunas'),
(4, 'Tinker', 'Dire', 1, 2, 'Lunas'),
(5, 'Invoker', 'Dire', 1, 3, 'Kredit'),
(6, 'Storm', 'Radiant', 1, 4, 'Kredit'),
(7, 'Morph', 'Dire', 2, 11, 'Lunas'),
(8, 'Morph', 'Dire', 4, 12, 'Lunas'),
(9, 'Storm', 'Radiant', 2, 13, 'Kredit'),
(10, 'Tinker', 'Radiant', 1, 13, 'Lunas'),
(11, 'Traxex', 'Dire', 2, 11, 'Lunas'),
(12, 'Tinker', 'Radiant', 3, 5, 'Kredit'),
(13, 'Traxex', 'Radiant', 2, 2, 'Kredit'),
(14, 'Legion', 'Dire', 1, 8, 'Lunas'),
(15, 'Traxex', 'Dire', 3, 11, 'Lunas'),
(16, 'Legion', 'Radiant', 4, 19, 'Kredit'),
(17, 'Traxex', 'Dire', 2, 12, 'Lunas'),
(18, 'Traxex', 'Radiant', 1, 16, 'Kredit'),
(19, 'Chen', 'Dire', 2, 12, 'Lunas'),
(20, 'Traxex', 'Radiant', 4, 14, 'Kredit'),
(21, 'Traxex', 'Radiant', 2, 15, 'Kredit'),
(22, 'Slardar', 'Radiant', 3, 17, 'Kredit'),
(23, 'Slark', 'Dire', 2, 11, 'Lunas'),
(24, 'Slark', 'Radiant', 2, 16, 'Lunas'),
(25, 'Traxex', 'Dire', 1, 16, 'Kredit'),
(26, 'Slardar', 'Radiant', 1, 19, 'Kredit'),
(27, 'Traxex', 'Dire', 4, 13, 'Lunas'),
(28, 'Slardar', 'Dire', 1, 12, 'Kredit'),
(29, 'Storm', 'Radiant', 2, 19, 'Lunas'),
(30, 'Ember', 'Dire', 3, 20, 'Lunas'),
(31, 'Invoker', 'Dire', 1, 20, 'Kredit'),
(32, 'Tinker', 'Radiant', 2, 2, 'Lunas');

--
-- Triggers `transaksi`
--
DELIMITER $$
CREATE TRIGGER `after_transaksi_insert` AFTER INSERT ON `transaksi` FOR EACH ROW BEGIN 
UPDATE barang SET
stok = stok-1
WHERE barang.id_barang = NEW.id_barang;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_karyawan` (`id_karyawan`),
  ADD KEY `id_barang` (`id_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id_karyawan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `karyawan` (`id_karyawan`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 20, 2022 at 05:40 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `polkam`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `NAMA` varchar(50) DEFAULT NULL,
  `NIP` varchar(15) NOT NULL,
  `JENIS_KELAMIN` varchar(15) DEFAULT NULL,
  `TANGGAL_LAHIR` varchar(20) DEFAULT NULL,
  `AGAMA` varchar(15) DEFAULT NULL,
  `ALAMAT` varchar(50) DEFAULT NULL,
  `PENGAJAR` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`NAMA`, `NIP`, `JENIS_KELAMIN`, `TANGGAL_LAHIR`, `AGAMA`, `ALAMAT`, `PENGAJAR`) VALUES
('Tati', '001', 'Perempuan', '12101989', 'ISLAM', 'Banda', 'Administrasi Bisnis Internasional'),
('Yuli', '002', 'Perempuan', '03061995', 'ISLAM', 'Aceh', 'Teknik Informatika'),
('Jaya', '010', 'Laki laki', '02051991', 'ISLAM', 'Solo', 'Teknik Pengolahan Sawit'),
('Jumi', '021', 'Perempuan', '06011997', 'ISLAM', 'Jakarta', 'Perawatan dan Perbaikan Mesin'),
('MAMAT', '111', 'Laki laki', '04041945', 'ISLAM', 'SERANG', 'Administrasi Bisnis Internasional'),
('Topang', '112', 'Perempuan', '22051979', 'ISLAM', 'Subang', 'Perawatan dan Perbaikan Mesin'),
('roma', '123', 'Laki laki', '22111950', 'ISLAM', 'BANTEN', 'Teknik Pengolahan Sawit'),
('bowo', '212', 'Laki laki', '04061958', 'ISLAM', 'baru', 'Teknik Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `dosenakademik`
--

CREATE TABLE `dosenakademik` (
  `KELAS` varchar(5) NOT NULL,
  `PRODI` varchar(40) NOT NULL,
  `JURUSAN` varchar(40) NOT NULL,
  `NIM` varchar(15) NOT NULL,
  `MAHASISWA` varchar(50) NOT NULL,
  `NIP` varchar(15) NOT NULL,
  `NAMA_DOSEN` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dosenakademik`
--

INSERT INTO `dosenakademik` (`KELAS`, `PRODI`, `JURUSAN`, `NIM`, `MAHASISWA`, `NIP`, `NAMA_DOSEN`) VALUES
('2 ABI', 'ADMINISTRASI BISNIS INTERNASIONAL', 'INTERNATIONAL BUSINESS ADMINISTRATIONS', '201912123', 'Doni', '322', 'bowo'),
('2 TIF', 'TEKNIK INFORMATIKA', 'INFORMATICS ENGINEERING', '201915043', 'Beti', '123', 'roma'),
('1 PPM', 'PERAWATAN DAN PERBAIKAN MESIN', 'MAINTENANCE ENGINEERING', '201943523', 'Rena', '002', 'Yuli');

-- --------------------------------------------------------

--
-- Table structure for table `indexnilai`
--

CREATE TABLE `indexnilai` (
  `NIM` varchar(15) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `IP` varchar(5) NOT NULL,
  `SEMESTER` varchar(10) NOT NULL,
  `JURUSAN` varchar(40) NOT NULL,
  `PRODI` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `indexnilai`
--

INSERT INTO `indexnilai` (`NIM`, `NAMA`, `IP`, `SEMESTER`, `JURUSAN`, `PRODI`) VALUES
('201912123', 'Doni', '3.7', '1', 'Maintenance Engineering', 'Perawatan dan Perbaikan Mesin'),
('201912345', 'ayu', '3.6', '5', 'Internasional Business Administrations', 'Administrasi Bisnis Internasional'),
('201913035', 'Ribut Wibowo Rahayu', '5', '2', 'Informatics Engineering', 'Teknik Informatika'),
('201913241', 'Budi', '4', '3', 'Palm Oil Engineering', 'Teknik Pengolahan Sawit'),
('201915043', 'Beti', '3', '7', 'Informatics Engineering', 'Teknik Informatika'),
('201943523', 'Rena', '3.7', '2', 'Internasional Business Administrations', 'Administrasi Bisnis Internasional');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NAMA` varchar(50) NOT NULL,
  `NIM` varchar(15) NOT NULL,
  `JENIS_KELAMIN` varchar(15) NOT NULL,
  `JURUSAN` varchar(40) NOT NULL,
  `PRODI` varchar(40) NOT NULL,
  `ALAMAT` varchar(50) NOT NULL,
  `HOBI` varchar(25) NOT NULL,
  `AGAMA` varchar(15) NOT NULL,
  `HP` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NAMA`, `NIM`, `JENIS_KELAMIN`, `JURUSAN`, `PRODI`, `ALAMAT`, `HOBI`, `AGAMA`, `HP`) VALUES
('Doni', '201912123', 'Laki-laki', 'Maintenance Engineering', 'Perawatan dan Perbaikan Mesin', 'Surabaya', 'Menggambar', 'ISLAM', '0023487284028'),
('ayu', '201912345', 'Perempuan', 'Internasional Business Administrations', 'Administrasi Bisnis Internasional', 'ujung pandang', 'Memasak', 'ISLAM', '08127106533'),
('Ribut Wibowo Rahayu', '201913035', 'Perempuan', 'Informatics Engineering', 'Teknik Informatika', 'Sarolangun, Jambi', 'Fotografi', 'ISLAM', '08127106544'),
('Budi', '201913241', 'Laki-laki', 'Palm Oil Engineering', 'Teknik Pengolahan Sawit', 'Selat Malaka', 'Olahraga', 'ISLAM', '012380189417'),
('Beti', '201915043', 'Perempuan', 'Informatics Engineering', 'Teknik Informatika', 'Semarang', 'Traveling', 'ISLAM', '084812678142'),
('Rena', '201943523', 'Perempuan', 'Internasional Business Administrations', 'Administrasi Bisnis Internasional', 'Jogja', 'Menulis', 'ISLAM', '07562961074');

-- --------------------------------------------------------

--
-- Table structure for table `matkul`
--

CREATE TABLE `matkul` (
  `KODE` varchar(15) NOT NULL,
  `NAMA_MATKUL` varchar(30) NOT NULL,
  `SKS` varchar(3) NOT NULL,
  `SEMESTER` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matkul`
--

INSERT INTO `matkul` (`KODE`, `NAMA_MATKUL`, `SKS`, `SEMESTER`) VALUES
('001', 'PBO', '3', '3'),
('002', 'MULTIMEDIA', '4', '4'),
('003', 'BUDIDAYA BIBIT SAWIT', '3', '3'),
('004', 'MATEMATIKA', '3', '3');

-- --------------------------------------------------------

--
-- Table structure for table `ruangmahasiswa`
--

CREATE TABLE `ruangmahasiswa` (
  `KELAS` varchar(10) NOT NULL,
  `PRODI` varchar(40) NOT NULL,
  `JURUSAN` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ruangmahasiswa`
--

INSERT INTO `ruangmahasiswa` (`KELAS`, `PRODI`, `JURUSAN`) VALUES
('1 ABI', 'ADMINISTRASI BISNIS INTERNASIONAL', 'INTERNATIONAL BUSINESS ADMINISTRATIONS'),
('1 PPM', 'PERAWATAN DAN PERBAIKAN MESIN', 'MAINTENANCE ENGINEERING'),
('1 TIF', 'TEKNIK INFORMATIKA', 'INFORMATICS ENGINEERING'),
('1 TPS', 'TEKNIK PENGOLAHAN SAWIT', 'OIL PALM ENGINEERING'),
('2 ABI', 'ADMINISTRASI BISNIS INTERNASIONAL', 'INTERNATIONAL BUSINESS ADMINISTRATIONS'),
('2 PPM', 'PERAWATAN DAN PERBAIKAN MESIN', 'MAINTENANCE ENGINEERING'),
('2 TIF', 'TEKNIK INFORMATIKA', 'INFORMATICS ENGINEERING'),
('2 TPS', 'TEKNIK PENGOLAHAN SAWIT', 'OIL PALM ENGINEERING'),
('3 ABI', 'ADMINISTRASI BISNIS INTERNASIONAL', 'INTERNATIONAL BUSINESS ADMINISTRATIONS'),
('3 PPM', 'PERAWATAN DAN PERBAIKAN MESIN', 'MAINTENANCE ENGINEERING'),
('3 TIF', 'TEKNIK INFORMATIKA', 'INFORMATICS ENGINEERING'),
('3 TPS', 'TEKNIK PENGOLAHAN SAWIT', 'OIL PALM ENGINEERING'),
('4 ABI', 'ADMINISTRASI BISNIS INTERNASIONAL', 'INTERNATIONAL BUSINESS ADMINISTRATIONS');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `NAMA` varchar(50) NOT NULL,
  `KODE` varchar(15) NOT NULL,
  `ALAMAT` varchar(50) NOT NULL,
  `AGAMA` varchar(15) NOT NULL,
  `BIDANG` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`NAMA`, `KODE`, `ALAMAT`, `AGAMA`, `BIDANG`) VALUES
('bowo', '1232', 'padang', 'ISLAM', 'Kemahasiswaan'),
('ribut', '1234', 'Jepang', 'ISLAM', 'Operasional'),
('kurnia', '2313', 'Makasar', 'ISLAM', 'Jurusan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`NIP`);

--
-- Indexes for table `dosenakademik`
--
ALTER TABLE `dosenakademik`
  ADD PRIMARY KEY (`NIM`);

--
-- Indexes for table `indexnilai`
--
ALTER TABLE `indexnilai`
  ADD PRIMARY KEY (`NIM`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`);

--
-- Indexes for table `matkul`
--
ALTER TABLE `matkul`
  ADD PRIMARY KEY (`KODE`);

--
-- Indexes for table `ruangmahasiswa`
--
ALTER TABLE `ruangmahasiswa`
  ADD PRIMARY KEY (`KELAS`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`KODE`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

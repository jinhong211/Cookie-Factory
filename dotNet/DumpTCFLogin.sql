USE [master]
GO

/****** Object:  Database [TCFLogin]    Script Date: 05/16/2015 15:29:09 ******/
CREATE DATABASE [TCFLogin] ON  PRIMARY 
( NAME = N'TCFLogin', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.CODSERVER\MSSQL\DATA\TCFLogin.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'TCFLogin_log', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL10_50.CODSERVER\MSSQL\DATA\TCFLogin_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO

ALTER DATABASE [TCFLogin] SET COMPATIBILITY_LEVEL = 100
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [TCFLogin].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [TCFLogin] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [TCFLogin] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [TCFLogin] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [TCFLogin] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [TCFLogin] SET ARITHABORT OFF 
GO

ALTER DATABASE [TCFLogin] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [TCFLogin] SET AUTO_CREATE_STATISTICS ON 
GO

ALTER DATABASE [TCFLogin] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [TCFLogin] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [TCFLogin] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [TCFLogin] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [TCFLogin] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [TCFLogin] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [TCFLogin] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [TCFLogin] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [TCFLogin] SET  DISABLE_BROKER 
GO

ALTER DATABASE [TCFLogin] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [TCFLogin] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [TCFLogin] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [TCFLogin] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [TCFLogin] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [TCFLogin] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [TCFLogin] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [TCFLogin] SET  READ_WRITE 
GO

ALTER DATABASE [TCFLogin] SET RECOVERY SIMPLE 
GO

ALTER DATABASE [TCFLogin] SET  MULTI_USER 
GO

ALTER DATABASE [TCFLogin] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [TCFLogin] SET DB_CHAINING OFF 
GO

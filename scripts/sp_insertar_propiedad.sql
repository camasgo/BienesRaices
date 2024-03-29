USE [BienesRaicesA80703]
GO
/****** Object:  StoredProcedure [dbo].[sp_insertar_propiedad]    Script Date: 05/13/2014 09:54:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[sp_insertar_propiedad]
(
	@cod_propiedad int OUTPUT,
	@descripcion varchar(100),
	@direccion varchar(60),
	@precio_venta float,
	@electricidad bit,
	@id_propietario int
)
AS
BEGIN
	INSERT INTO Propiedad
	(
		descripcion,
		direccion,
		precio_venta,
		electricidad,
		id_propietario
	)
     VALUES
	(
		@descripcion,
		@direccion,
		@precio_venta,
		@electricidad,
		@id_propietario
	)
	SELECT cod_propiedad = @@IDENTITY;
END

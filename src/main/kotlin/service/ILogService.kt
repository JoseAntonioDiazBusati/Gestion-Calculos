package service

import model.Calculadora

interface ILogService {
    fun registrarEntradaLog(msj: String)
    fun registrarEntradaLog(calculadora: Calculadora)
    fun getInfoUltimoLog(): List<String>
    fun crearNuevoLog()
    fun crearRutaLog(ruta: String): Boolean
}
}
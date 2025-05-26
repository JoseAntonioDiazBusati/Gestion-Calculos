package repo

import model.Calculadora

interface IRepoLog {
    var ruta: String?
    var logActual: String?

    fun crearRutaLog(): Boolean
    fun crearNuevoLog(): String
    fun getUltimoLog(): List<String>
    fun registrarEntrada(msj: String)
    fun registrarEntrada(calculadora: Calculadora)
}
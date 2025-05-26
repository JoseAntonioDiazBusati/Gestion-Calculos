package service

import model.Calculadora
import repo.RepoLog

class LogService(private val repoLog: RepoLog): ILogService {
    override fun registrarEntradaLog(msj: String) {
        repoLog.registrarEntrada(msj)
    }

    override fun registrarEntradaLog(calculadora: Calculadora) {
        repoLog.registrarEntrada(calculadora)
    }

    override fun getInfoUltimoLog(): List<String> {
        return repoLog.getUltimoLog()
    }

    override fun crearNuevoLog() {
        repoLog.crearNuevoLog()
    }

    override fun crearRutaLog(ruta: String): Boolean {
        repoLog.ruta = ruta
        require(ruta.isNotEmpty()){"No puedes crear una ruta vacía"}
        return repoLog.crearRutaLog()
    }
}
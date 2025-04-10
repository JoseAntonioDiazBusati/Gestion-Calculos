package CalcBasicaConErrorACorregir.utils

import java.io.File
import java.time.LocalDateTime

open class Logs : ILogs {

    private var archivoLog: File? = null

    override fun existeRuta(ruta: File): Boolean {
        if (!ruta.exists()) {
            ruta.mkdir()
            return false
        }
        return true
    }

    fun logInfo(mensaje: String) {
        registrar(mensaje)
    }

    private fun registrar(mensaje: String) {
        archivoLog?.appendText("$mensaje\n")
    }

    override fun iniciarLog(ruta: File) {
        val timestamp = LocalDateTime.now()
            .format(java.time.format.DateTimeFormatter.ofPattern("YYYYMMddHHmmss"))
        var logFile = File(ruta, "log$timestamp.txt")
        archivoLog = logFile
        logFile.writeText("LOG iniciado: ${LocalDateTime.now()}\n")
    }
}
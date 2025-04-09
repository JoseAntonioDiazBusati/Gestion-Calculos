package CalcBasicaConErrorACorregir.utils

import java.io.File

open class Logs : ILogs {
    override fun existeRuta(ruta: File): Boolean {
        if (!ruta.exists()) {
            ruta.mkdir()
            return false
        }
        return true
    }

    override fun iniciarLog(ruta: File) {
        val timestamp = java.time.LocalDateTime.now()
            .format(java.time.format.DateTimeFormatter.ofPattern("YYYYMMddHHmmss"))
        val logFile = File(ruta, "log$timestamp.txt")

        logFile.writeText("LOG iniciado: ${java.time.LocalDateTime.now()}\n")
    }
}
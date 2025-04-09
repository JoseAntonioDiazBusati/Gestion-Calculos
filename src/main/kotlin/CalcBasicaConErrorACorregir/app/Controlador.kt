package CalcBasicaConErrorACorregir.app

import CalcBasicaConErrorACorregir.utils.Logs
import java.io.File
import es.iesraprog2425.pruebaes.ui.Consola

class Controlador(val ui: Consola = Consola()) : Logs() {
    override fun existeRuta(ruta: File): Boolean {
        return super.existeRuta(ruta)
    }

    override fun iniciarLog(ruta: File) {
        ui.mostrar("Iniciando log en: ${ruta.absolutePath}")
        super.iniciarLog(ruta)
    }
}
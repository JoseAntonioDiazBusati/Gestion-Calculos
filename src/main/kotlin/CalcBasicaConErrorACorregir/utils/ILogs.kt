package CalcBasicaConErrorACorregir.utils

import java.io.File

interface ILogs {
    fun existeRuta(ruta: File): Boolean
    fun iniciarLog(ruta: File)
}
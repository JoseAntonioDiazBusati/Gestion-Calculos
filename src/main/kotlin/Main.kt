import app.CalculadoraManager
import repo.RepoLog
import service.CalculadoraService
import service.LogService
import ui.Consola
import utils.Ficheros

fun main(args: Array<String>){
    val consola = Consola()
    val gestorFicheros = Ficheros()
    val repoLog = RepoLog(gestorFicheros)
    val servicioLog = LogService(repoLog)
    val calculadora = CalculadoraService()

    val ejecutor = CalculadoraManager(consola, calculadora, servicioLog)
    ejecutor.iniciar(args)
}
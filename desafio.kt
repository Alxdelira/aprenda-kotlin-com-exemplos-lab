enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome")
    }
}

fun main() {
    // Criando alguns usuários
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    // Criando alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 90)
    val conteudo3 = ConteudoEducacional("Desenvolvimento Android com Kotlin", 120)

    // Criando uma formação
    val formacaoKotlin = Formacao("Formação Kotlin", mutableListOf(conteudo1, conteudo2, conteudo3))

    // Matriculando usuários na formação
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
}


package creational.builder

data class Mail(
    val to: String = "",
    var title: String? = "",
    var message: String? = "",
    var cc: List<String> = listOf(),
    var bcc: List<String> = listOf(),
    var attachments: List<java.io.File> = listOf()
)


class MailBuilder(private val to: String) {
    private var mail: Mail = Mail(to)

    fun title(tile: String): MailBuilder {
        mail.title = tile

        return this
    }

    fun cc(cc: List<String>): MailBuilder {
        mail.cc = cc

        return this
    }

    fun bcc(bcc: List<String>): MailBuilder {
        mail.bcc = bcc

        return this
    }

    fun message(message: String): MailBuilder {
        mail.message = message

        return this
    }

    fun build(): Mail {
        return mail
    }

}

fun main() {

    val mail = Mail("one@recepient.org", "Hi")
    val mail2 = Mail(title = "Hello", message = "There", to = "my@dear.cat")

    val mail3 = Mail("hello@mail.com").apply {
        title = "Apply"
        message = "Hello dear!"
    }

    val emailBuilder = MailBuilder("hello@hello.com").title("Ping").build()
    println(emailBuilder)
}
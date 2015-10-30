package i_introduction._7_Nullable_Types

import util.*

fun todoTask5(client: Client?, message: String?, mailer: Mailer): Nothing = TODO(
    """
        Task 5.
        Rewrite JavaCode5.sendMessageToClient in Kotlin, using only one 'if' expression.
        Declarations of Client, PersonalInfo and Mailer are given below.
    """,
    documentation = doc5(),
    references = { JavaCode5().sendMessageToClient(client, message, mailer) }
)

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    var clientEmail: String = client?.personalInfo?.email ?: return
    if(message != null) mailer.sendMessage(clientEmail, message) else return
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}호

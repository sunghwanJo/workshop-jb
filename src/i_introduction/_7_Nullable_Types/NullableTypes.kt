package i_introduction._7_Nullable_Types

import util.*

fun test() {
    val s: String = "this variable cannot store null references"
    val q: String? = null

    if (q != null) q.length      // you have to check to dereference
    val i: Int? = q?.length      // null
    val j: Int = q?.length ?: 0  // 0
}

fun todoTask7(client: Client?, message: String?, mailer: Mailer): Nothing = TODO(
    """
        Task 7.
        Rewrite JavaCode7.sendMessageToClient in Kotlin, using only one 'if' expression.
        Declarations of Client, PersonalInfo and Mailer are given below.
    """,
    documentation = doc7(),
    references = { JavaCode7().sendMessageToClient(client, message, mailer) }
)

<<<<<<< HEAD
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    var clientEmail: String = client?.personalInfo?.email ?: return
    if(message != null) mailer.sendMessage(clientEmail, message) else return
=======
fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    todoTask7(client, message, mailer)
>>>>>>> 350fc69a6a89148f21ace7bb429e7d3d60987881
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
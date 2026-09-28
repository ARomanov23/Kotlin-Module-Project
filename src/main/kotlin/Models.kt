class Archive (
val name: String,
val notes: MutableList<Note> = mutableListOf()

)
class Note (
val name: String,
val content: String
)
fun showNoteScreen (note: Note){
    Menu(
        title = "Заметка \"${note.name}\": \"${note.content}\"",
        itemsProvider = {
            listOf(MenuItem("Назад"){false})
        }
    ).show()
}
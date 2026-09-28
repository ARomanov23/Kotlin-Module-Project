fun showNotesMenu(archive: Archive) {
    Menu(
        title = "Заметки архива \"${archive.name}\":",
        itemsProvider = {
            mutableListOf<MenuItem>().apply {
                add(MenuItem("Создать заметку") {
                    createNote(archive)
                    true
                })
                archive.notes.forEach {note -> add(MenuItem(note.name){showNoteScreen(note)

                    true})}
                add(MenuItem("Выход"){
                    false
                })
            }
        }
    ).show()
}
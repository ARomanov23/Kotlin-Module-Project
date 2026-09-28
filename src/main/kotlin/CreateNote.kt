fun createNote (archive: Archive) {
    print("Введите название заметки: ")
    val name = ConsoleInput.readLine().trim()
    if (name.isEmpty()) {
    println("Название не может быть пустым.\n")
        return
    }
    print("Введите текст заметки: ")
    val content = ConsoleInput.readLine().trim()
    if (content.isEmpty()) {
        println("Текст не может быть пустым.\n")
        return
    }
    archive.notes.add(Note(name, content))
    println("Заметка \"$name\" создана.\n")
}
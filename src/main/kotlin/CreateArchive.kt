fun createArchive(){
    print("Введите название архива:")
    val name = ConsoleInput.readLine().trim()
    if (name.isEmpty()){
println("Название архива не может быть пустым.\n")
        return
    }
    archives.add(Archive(name))
    println("Архив \"$name\" создан.\n")
}
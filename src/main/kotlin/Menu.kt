class Menu (
private val title: String,
private val itemsProvider: () -> List<MenuItem>
) {
    fun show() {
        var running = true
        while(running) {
            val items = itemsProvider()
            println(title)
            items.forEachIndexed { index, item -> println("$index. ${item.title}") }
        println("Введите номер пункта меню: ")
            val input = ConsoleInput.readLine().trim()
            val number = input.toIntOrNull()
            when{
                number == null -> println("Cледует вводить цифру.\n")
                number !in items.indices -> println("Такой цифры нет. Введите корректный символ.\n")
                else  -> running = items[number].action()
            }
        }
    }
}

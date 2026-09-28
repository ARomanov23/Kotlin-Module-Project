import kotlin.system.exitProcess

fun showArchivesMenu() {
    Menu(
        title = "Список архивов: ",
        itemsProvider = {
            mutableListOf<MenuItem>().apply {
                add(MenuItem("Создать архив") {
                    createArchive()
                    true
                })
                archives.forEach {archive ->
                    add(MenuItem(archive.name) {
                        showNotesMenu(archive)
                        true
                    })
                }
                add(MenuItem("Выход"){
                    exitProcess(0)
                })
            }
        }
    ).show()
}
import kotlinx.browser.document

fun main() {
    document.title = "Mr. Batchelore - Borough of Bertrothshire"
    val root = document.getElementById("app") ?: document.createElement("div").also {
        it.id = "app"
        document.body!!.appendChild(it)
    }
    root.textContent = "Hapless birthday to you: ready... set... run!!!"
}

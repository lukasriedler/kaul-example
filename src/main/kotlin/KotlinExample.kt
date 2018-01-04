import javafx.scene.control.Label
import javafx.scene.layout.VBox
import tornadofx.App
import tornadofx.View

class KotlinExample : View() {
    override val root = VBox()

    init {
        root.add(Label("application-name: kotlin-example"))
        root.add(Label("application-version: 0.1"))
    }
}

class KotlinExampleApp : App() {
    override val primaryView = KotlinExample::class
}
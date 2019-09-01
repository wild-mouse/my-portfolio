import react.*
import react.dom.div

class App: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            + "Hello, World!"
        }
    }
}
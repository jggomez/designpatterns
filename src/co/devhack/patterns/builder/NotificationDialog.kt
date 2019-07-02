package co.devhack.patterns.builder

class NotificationDialog(
        private val title: String,
        private val description: String,
        private val iconUri: String,
        private val buttonAccept: Boolean,
        private val buttonCancel: Boolean
) {

    fun show() =
            "$iconUri -> $title : $description -- $buttonAccept - $buttonCancel"

    class Builder(private val description: String) {

        var title: String = "Informacion"
        var iconUri: String = "URL ICON DEFAULT"
        var buttonAccept: Boolean = false
        var buttonCancel: Boolean = false

        fun addTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun addIconUri(iconUri: String): Builder {
            this.iconUri = title
            return this
        }

        fun addButtonAccept(buttonAccept: Boolean): Builder {
            this.buttonAccept = buttonAccept
            return this
        }

        fun addButtonCancel(buttonCancel: Boolean): Builder {
            this.buttonCancel = buttonCancel
            return this
        }

        fun build(): NotificationDialog {
            return NotificationDialog(
                    title = this.title,
                    description = this.description,
                    iconUri = this.iconUri,
                    buttonAccept = this.buttonAccept,
                    buttonCancel = this.buttonCancel
            )
        }

    }
}
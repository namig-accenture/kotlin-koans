class LazyProperty(val initializer: () -> Int) {

    private var _lazy:Int? = null
    val lazy: Int
        get() {
            return _lazy ?: initializer().also {
                _lazy = it
            }
        }
}

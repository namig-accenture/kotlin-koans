fun Int.r(): RationalNumber = RationalNumber(
        numerator = this,
        denominator = 1
)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(
        numerator = this.first,
        denominator = this.second
)

data class RationalNumber(val numerator: Int, val denominator: Int)

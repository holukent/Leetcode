fun reverse(x: Int): Int {
    val y = x.toLong()
    var z = 0
    when {
        x > 0 -> {
            y.toString().reversed().run {
                z = if (this.toLong() > Int.MAX_VALUE) 0 else this.toInt()
            }
        }
        x < 0 -> {
            (y * -1).toString().reversed().run {
                z = if (this.toLong() * -1 < Int.MIN_VALUE) 0 else this.toInt() * -1
            }
        }
        else -> z
    }
    return z
}
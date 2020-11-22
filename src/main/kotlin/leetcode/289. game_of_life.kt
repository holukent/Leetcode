package leetcode

fun gameOfLife(board: Array<IntArray>): Unit {
    val result: Array<IntArray> = Array(board.size){ IntArray(board[0].size) }
    for (i in board.indices) {
        for (j in board[i].indices) {
            val temp = IntArray(8)
            runCatching { board[i - 1][j - 1] }.onSuccess { temp[0] = it }.onFailure { temp[0] = -1 }
            runCatching { board[i - 1][j] }.onSuccess { temp[1] = it }.onFailure { temp[1] = -1 }
            runCatching { board[i - 1][j + 1] }.onSuccess { temp[2] = it }.onFailure { temp[2] = -1 }
            runCatching { board[i][j - 1] }.onSuccess { temp[3] = it }.onFailure { temp[3] = -1 }
            runCatching { board[i][j + 1] }.onSuccess { temp[4] = it }.onFailure { temp[4] = -1 }
            runCatching { board[i + 1][j - 1] }.onSuccess { temp[5] = it }.onFailure { temp[5] = -1 }
            runCatching { board[i + 1][j] }.onSuccess { temp[6] = it }.onFailure { temp[6] = -1 }
            runCatching { board[i + 1][j + 1] }.onSuccess { temp[7] = it }.onFailure { temp[7] = -1 }
            when(board[i][j]) {
                0 -> if (temp.count { it == 1 } == 3)
                    result[i][j] = 1
                1 -> if (temp.count { it == 1 } !in 2..3) result[i][j] = 0
                else result[i][j] = 1
            }
        }
    }
    result.forEachIndexed { index, ints ->
        board[index] = ints
    }
}

package leetcode

fun findJudge(N: Int, trust: Array<IntArray>): Int {
    val array0 = IntArray(trust.size)
    trust.forEachIndexed { index, ints ->
        array0[index] = ints[0]
    }
    val judge = ((1..N) subtract array0.toList()).toList()
    if (judge.size != 1) return -1
    val result = ((1..N) - judge[0]).toMutableList()
    trust.filter { it[1] == judge[0] }.forEach { result -= it[0] }

    return if (result.isNotEmpty()) -1 else judge[0]
}

fun findJudge1(N: Int, trust: Array<IntArray>): Int {

    val count = IntArray(N)

    for (i in trust.indices) {
        val trustee = trust[i][0]
        val trusted = trust[i][1]

        count[trustee -1] -= 1
        count[trustee -1] = count[trustee - 1] - 1
        count[trusted -1] += 1
    }

    for (i in count.indices) {
        if (count[i] == N -1) return i + 1
    }

    return -1
}
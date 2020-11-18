fun merge1(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val list1 = nums1.toList().subList(0, m)
    val list2 = nums2.toList().subList(0, n)
    val result = (list1 + list2).sorted()
    for (i in result.indices) {
        nums1[i] = result[i]
    }
}
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var msize = m - 1
    var nsize = n - 1
    for (i in nums1.lastIndex downTo 0) {
        when {
            nsize < 0 -> return
            msize < 0 -> {
                nums1[i] = nums2[nsize--]
            }
            nums1[msize] >= nums2[nsize] -> {
                nums1[i] = nums1[msize--]
            }
            nums1[msize] < nums2[nsize] -> {
                nums1[i] = nums2[nsize--]
            }
        }
    }
}
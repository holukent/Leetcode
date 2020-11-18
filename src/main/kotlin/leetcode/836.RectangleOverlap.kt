fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean{
    if ((rec1[2] - rec1[0]) * (rec1[3] - rec1[1]) == 0) return false
    if ((rec2[2] - rec2[0]) * (rec2[3] - rec2[1]) == 0) return false
    if (rec2[0] >= rec1[2]) return false
    if (rec2[2] <= rec1[0]) return false
    if (rec2[1] >= rec1[3]) return false
    if (rec2[3] <= rec1[1]) return false
    return true

    //return Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) &&
    //                Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1])
}



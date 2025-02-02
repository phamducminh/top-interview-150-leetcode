class Solution {
    // fun canComplete(gas: IntArray, cost: IntArray, start: Int): Boolean {
    //     val n = gas.size
    //     var step = start
    //     var tank = gas[step]

    //     while (true) {
    //         val temp = (step + 1) % n
    //         tank = tank - cost[step] + gas[temp] 
    //         step = temp

    //         if (tank < cost[step]) {
    //             return false
    //         }

    //         if (step == start) {
    //             return true
    //         }
    //     }  

    //     return false
    // }

    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        // for (i in 0 until gas.size) {
        //     if (gas[i] < cost[i]) {
        //         continue
        //     }

        //     if (canComplete(gas, cost, i)) {
        //         return i
        //     }
        // }

        // return -1
        if (gas.sum() < cost.sum()) return -1

        var total = 0
        var startIdx = 0

        for (i in 0 until gas.size) {
            total += gas[i] - cost[i]

            if (total < 0) {
                total = 0
                startIdx = i + 1
            }
        }

        return startIdx
    }
}
package Algorithm.kotlin.leetcode

// https://leetcode.com/problems/design-parking-system/

class DesignParkingSystem1603 {
    class ParkingSystem(val big: Int, val medium: Int, val small: Int) {
        private val bigList = mutableListOf<Int>()
        private val mediumList = mutableListOf<Int>()
        private val smallList = mutableListOf<Int>()


        fun addCar(carType: Int): Boolean {
            when (carType) {
                1 -> {
                    if (bigList.size == big) {
                        return false
                    }
                    bigList.add(1)
                }
                2 -> {
                    if (mediumList.size == medium) {
                        return false
                    }
                    mediumList.add(1)
                }
                3 -> {
                    if (smallList.size == small) {
                        return false
                    }
                    smallList.add(1)
                }
                else -> {
                    return false
                }
            }
            return true
        }

    }

}

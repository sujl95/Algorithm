package Algorithm.kotlin.leetcode

class LongestAbsoluteFilePath {
    fun lengthLongestPath(input: String): Int {
        if (input.isEmpty()) return 0

        val lines = input.split("\n")
        val pathLengths = mutableMapOf<Int, Int>() // depth -> pathLength
        pathLengths[0] = 0

        var maxLength = 0

        for (line in lines) {
            // 탭 개수로 깊이 계산
            val depth = line.takeWhile { it == '\t' }.length
            // 엔트리명 추출 (탭 제거)
            val name = line.drop(depth)

            // 현재 깊이의 경로 길이 = 이전 깊이 경로 길이 + "/" + 엔트리명
            // (깊이가 0이면 "/" 미포함, 깊이 > 0이면 "/" 포함)
            pathLengths[depth + 1] = pathLengths[depth]!! + name.length + 1

            // 파일이면 (확장자 있음 = '.' 포함)
            if (name.contains(".")) {
                // 마지막 '/' 제거한 길이
                maxLength = maxOf(maxLength, pathLengths[depth + 1]!! - 1)
            }
        }

        return maxLength
    }
}

fun main() {
    val solution = LongestAbsoluteFilePath()

    // 테스트 1
    val input1 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.txt"
    println("Test 1: ${solution.lengthLongestPath(input1)}") // 기대값: 20

    // 테스트 2
    val input2 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
    println("Test 2: ${solution.lengthLongestPath(input2)}") // 기대값: 32

    // 테스트 3: 파일 없음
    val input3 = "dir\n\tsubdir1\n\tsubdir2"
    println("Test 3: ${solution.lengthLongestPath(input3)}") // 기대값: 0

    // 테스트 4: 단일 파일
    val input4 = "file.txt"
    println("Test 4: ${solution.lengthLongestPath(input4)}") // 기대값: 8
}


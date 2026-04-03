package Algorithm.kotlin.leetcode

class EncodeAndDecodeStrings {
    class Codec {

        // Encodes a list of strings to a single string.
        fun encode(strs: List<String>): String {
            return strs.joinToString(separator = "") { "${it.length}#${it}" }
        }

        // Decodes a single string to a list of strings.
        fun decode(s: String): List<String> {
            val result = mutableListOf<String>()
            var current = StringBuilder()
            var i = 0
            var length = StringBuilder()
            while (i < s.length) {
                val char = s[i]
                if (char.isDigit()) {
                    length.append(char)
                } else if (char == '#') {
                    val strLength = length.toString().toInt()
                    val str = s.substring(i + 1, i + 1 + strLength)
                    current.append(str)
                    i += strLength
                    length = StringBuilder()
                    result.add(current.toString())
                    current = StringBuilder()
                } else {
                    current.append(char)
                }
                i++
            }
            return result
        }
    }
}

fun main() {
//    val codec = EncodeAndDecodeStrings.Codec()
//    val strs = listOf("hello", "world", "foo,bar", "baz")
//    val encoded = codec.encode(strs)
//    println(encoded) // Output: hello,world,foo\,bar,baz
//    val decoded = codec.decode(encoded)
//    println(decoded) // Output: [hello, world, foo,bar, baz]
    val codec = EncodeAndDecodeStrings.Codec()

// 케이스 1: 빈 문자열 포함
    println(codec.decode(codec.encode(listOf("", "hello"))))
// 기대값: ["", "hello"]

// 케이스 2: 숫자가 문자열 안에 있는 경우
    println(codec.decode(codec.encode(listOf("12#hello", "world"))))
// 기대값: ["12#hello", "world"]

// 케이스 3: 빈 리스트
    println(codec.decode(codec.encode(listOf())))
// 기대값: []
    val result = codec.decode(codec.encode(listOf("", "hello")))
    println(result.size)        // 2가 나와야 함
    println("'${result[0]}'")   // ''  (빈 문자열)
    println("'${result[1]}'")   // 'hello'
}

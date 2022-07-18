fun main(args: Array<String>) {

    // "Set" contém elementos únicos
     // "HashSet" também contém elementos exclusivos, mas a sequência não é garantida na saída

    var mySet = mutableSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8)  // Conjunto Mutável, READ e WRITE ambos
//    var mySet = hashSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8) // Mutable Set, READ e WRITE ambos

    mySet.remove(54)
    mySet.add(100)

    for (element in mySet) {
        println(element)
    }
}
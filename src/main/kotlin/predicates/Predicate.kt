package predicates

interface Predicate <T>{
    fun predicate(T: T): Boolean
}
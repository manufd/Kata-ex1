import actions.ActionA
import actions.ActionB
import actions.ActionC
import predicates.PredicateA
import predicates.PredicateB
import predicates.PredicateC
class OffersFactory {
    companion object {
        fun createOffers() =
            mutableListOf<Offer>(Offer(PredicateA()::predicate, ActionA()::action),
                    Offer(PredicateB()::predicate, ActionB()::action),
                    Offer(PredicateC()::predicate, ActionC()::action)
                    )

    }
}
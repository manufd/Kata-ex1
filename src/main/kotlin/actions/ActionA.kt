package actions

import PaymentBill
import Price

class ActionA(): Action {

    fun action(bill: PaymentBill): PaymentBill =
        bill.reduceByAmount(Price(16.0, Coin.SHEKEL))
}

// Create a payment system to accept different types of payment

//  Violates Open Close Principle

class Payment {
    public void cash_payment() {
        System.out.println("Cash Payment Complete");
    }

    public void debit_card_payment() {
        System.out.println("Debit Card Payment Complete");
    }

    public void credit_card_payment() {
        System.out.println("Credit Card Payment Complete");
    }

}

// in above example to add new payment methods we need to modify the class
// 'Payment'

// Complies with Open Close Principle

/**
 * open_close_principle
 */
interface MakePayment {
    public void complete_payment();
}

class CashPayment implements MakePayment {

    @Override
    public void complete_payment() {
        System.out.println("Cash Payment Complete");
    }

}

class DebitCardPayment implements MakePayment {

    @Override
    public void complete_payment() {
        System.out.println("Debit Card Payment Complete");
    }

}

class CreditCardPayment implements MakePayment {

    @Override
    public void complete_payment() {
        System.out.println("Credit Card Payment Complete");
    }

}

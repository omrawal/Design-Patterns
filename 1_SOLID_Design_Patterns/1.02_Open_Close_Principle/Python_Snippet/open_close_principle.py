'''
Create a payment system to accept different types of payment
'''

# Violates Open Close Principle
class Payment(object):
    def cash_payment(self):
        print("Cash Payment Complete")
    
    def debit_card_payment(self):
        print("Debit Card Payment Complete")
    
    def credit_card_payment(self):
        print("Credit Card Payment Complete")

# in above example to add new payment methods we need to modify the class 'Payment'
        
# Complies with Open Close Principle
class Payment(object):
    def complete_payment(self):
        print("Payment Class initialised")

class CashPayment(Payment):
    def complete_payment(self):
        print("Cash Payment Complete")
    
class DebitCardPayment(Payment):
    def complete_payment(self):
        print("Debit Card Payment Complete") 

class CreditCardPayment(Payment):
    def complete_payment(self):
        print("Credit Card Payment Complete")

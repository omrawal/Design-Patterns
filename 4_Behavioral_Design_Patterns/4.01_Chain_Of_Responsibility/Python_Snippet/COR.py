class Expense:
    def __init__(self, amount):
        self.amount = amount

class Approver:
    def __init__(self, name, approval_limit, next_approver=None):
        self.name = name
        self.approval_limit = approval_limit
        self.next_approver = next_approver

    def approve_expense(self, expense):
        if expense.amount <= self.approval_limit:
            print(f"{self.name} approved the expense of ${expense.amount}")
        elif self.next_approver:
            print(f"{self.name} cannot approve. Passing to {self.next_approver.name}.")
            self.next_approver.approve_expense(expense)
        else:
            print(f"None of the approvers can handle this expense of ${expense.amount}")

# Example usage
manager3 = Approver("Manager 3", 300)
manager2 = Approver("Manager 2", 200, manager3)
manager1 = Approver("Manager 1", 100, manager2)

expense1 = Expense(150)
expense2 = Expense(250)
expense3 = Expense(350)

manager1.approve_expense(expense1)
print("-------------------")
manager1.approve_expense(expense2)
print("-------------------")
manager1.approve_expense(expense3)
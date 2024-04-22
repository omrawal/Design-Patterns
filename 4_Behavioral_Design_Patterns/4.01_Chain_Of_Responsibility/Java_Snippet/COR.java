class Expense {
    double amount;

    public Expense(double amount) {
        this.amount = amount;
    }
}

class Approver {
    String name;
    double approvalLimit;
    Approver nextApprover;

    public Approver(String name, double approvalLimit, Approver nextApprover) {
        this.name = name;
        this.approvalLimit = approvalLimit;
        this.nextApprover = nextApprover;
    }

    public void approveExpense(Expense expense) {
        if (expense.amount <= approvalLimit) {
            System.out.println(this.name + " approved the expense of " + expense.amount);
        } else if (nextApprover != null) {
            System.out.println(this.name + " cant approve. Passing to " + nextApprover.name);
            nextApprover.approveExpense(expense);
        } else {
            System.out.println("None of the approvers can approve the expense of " + expense.amount);
        }
    }
}

public class COR {
    public static void main(String[] args) {
        Approver manager3 = new Approver("Manager 3", 300, null);
        Approver manager2 = new Approver("Manager 2", 200, manager3);
        Approver manager1 = new Approver("Manager 1", 100, manager2);

        Expense expense1 = new Expense(150);
        Expense expense2 = new Expense(250);
        Expense expense3 = new Expense(350);

        manager1.approveExpense(expense1);
        System.out.println("-------------------");
        manager1.approveExpense(expense2);
        System.out.println("-------------------");
        manager1.approveExpense(expense3);
    }
}
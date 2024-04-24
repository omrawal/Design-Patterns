class Context:
    def __init__(self):
        self.variables = {}

    def get_value(self, var_name):
        return self.variables.get(var_name, 0)

    def set_value(self, var_name, value):
        self.variables[var_name] = value


class Expression:
    def interpret(self, context):
        pass


class Number(Expression):
    def __init__(self, value):
        self.value = value

    def interpret(self, context):
        return self.value


class Plus(Expression):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def interpret(self, context):
        return self.left.interpret(context) + self.right.interpret(context)


class Minus(Expression):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def interpret(self, context):
        return self.left.interpret(context) - self.right.interpret(context)


class Multiply(Expression):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def interpret(self, context):
        return self.left.interpret(context) * self.right.interpret(context)


if __name__ == "__main__":
    context = Context()
    context.set_value("x", 3)
    context.set_value("y", 5)

    # Interpret the expression: x + y * 2
    expression = Plus(Number(context.get_value("x")), Multiply(Number(context.get_value("y")), Number(2)))
    result = expression.interpret(context)
    print("Result:", result)  # Output: 13

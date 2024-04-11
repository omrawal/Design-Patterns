'''
Create a Pizza maker and allow options to choose Base, Sauce and Topping
'''

class PizzaMaker():
    def __init__(self,
                 is_thin_crust=False, is_pan_crust=False,
                 has_tomato_sauce=False,has_bbq_sauce=False,
                 has_tomato=False,has_mushrooms=False,has_pepperoni=False) -> None:
        self.base = None
        self.sauce = None
        self.toppings = []
        
        # set pizza base
        if is_thin_crust:
            self.base = 'thin crust'
        else:
            self.base = 'pan crust'
        
        # set pizza sauce
        if has_tomato_sauce:
            self.sauce = 'tomato'
        else:
            self.sauce = 'bbq'
        
        # set toppings
        if has_tomato:
            self.toppings.append('tomato')
        if has_mushrooms:
            self.toppings.append('mushrooms')
        if has_pepperoni:
            self.toppings.append('pepperoni')
    def __str__(self) -> str:
        return f"Pizza with {self.base} base, {self.sauce} sauce and {', '.join(self.toppings)} toppings"

# with to add more toppings the number of parameters will increase 
# we use builder to solve this 

class Pizza():
    def __init__(self,base,sauce,toppings) -> None:
        self.base = base
        self.sauce = sauce
        self.toppings = toppings
    
    def __str__(self) -> str:
        return f"Pizza with {self.base} base, {self.sauce} sauce and {', '.join(self.toppings)} toppings"
    
class PizzaBuilder():
    def __init__(self) -> None:
        self.base = None
        self.sauce = None
        self.toppings = []
    
    def set_base(self,base):
        self.base = base
        return self
    
    def set_sauce(self,sauce):
        self.sauce = sauce
        return self
    
    def add_topping(self,topping): 
        self.toppings.append(topping)
        return self
    
    def build(self):
        if not all([self.base,self.sauce]):
            raise Exception('Pizza must have base and sauce')
        return Pizza(self.base,self.sauce,self.toppings)

pizzaBuilder = PizzaBuilder()
veg_pizza = pizzaBuilder.set_base('Thin Crust').set_sauce('Tomato').add_topping('Olive').add_topping('Tomato').add_topping('Cheese').add_topping('pepper').build()
print(veg_pizza)
    
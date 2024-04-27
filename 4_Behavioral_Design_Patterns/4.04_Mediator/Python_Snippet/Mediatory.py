# Mediator interface
class ChatMediator:
    def add_user(self, user):
        pass

    def send_message(self, message, user):
        pass

# Concrete mediator
class ChatRoom(ChatMediator):
    def __init__(self):
        self.users = []

    def add_user(self, user):
        self.users.append(user)

    def send_message(self, message, user):
        for u in self.users:
            if u != user:
                u.receive(message)

# Colleague interface
class User:
    def __init__(self, name, mediator):
        self.name = name
        self.mediator = mediator

    def send(self, message):
        self.mediator.send_message(message, self)

    def receive(self, message):
        print(f"{self.name} received: {message}")

# Concrete colleague
class BasicUser(User):
    pass

# Concrete colleague
class PremiumUser(User):
    pass

# Usage
if __name__ == "__main__":
    # Create mediator
    chat_room = ChatRoom()

    # Create users
    user1 = BasicUser("Alice", chat_room)
    user2 = BasicUser("Bob", chat_room)
    user3 = PremiumUser("Charlie", chat_room)

    # Add users to the chat room
    chat_room.add_user(user1)
    chat_room.add_user(user2)
    chat_room.add_user(user3)

    # User1 sends a message
    user1.send("Hello everyone!")

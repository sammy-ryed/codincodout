class Stack:
    def __init__(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)
        print(f"Pushed: {item}")

    def pop(self):
        if not self.is_empty():
            print(f"Popped: {self.stack.pop()}")
        else:
            print("Stack is empty!")

    def peek(self):
        if not self.is_empty():
            print("Top element:", self.stack[-1])
        else:
            print("Stack is empty!")

    def is_empty(self):
        return len(self.stack) == 0

    def display(self):
        print("Stack:", self.stack)

s = Stack()
while True:
    print("\nOptions: PUSH <val> / POP / PEEK / DISPLAY / EXIT")
    cmd = input("Enter command: ").split()
    if cmd[0].upper() == "PUSH":
        s.push(cmd[1])
    elif cmd[0].upper() == "POP":
        s.pop()
    elif cmd[0].upper() == "PEEK":
        s.peek()
    elif cmd[0].upper() == "DISPLAY":
        s.display()
    elif cmd[0].upper() == "EXIT":
        break
    else:
        print("Invalid command!")
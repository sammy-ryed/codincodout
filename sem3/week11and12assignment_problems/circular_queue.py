class CircularQueue:
    def __init__(self, size):
        self.size = size
        self.queue = [None] * size
        self.front = -1
        self.rear = -1

    def enqueue(self, item):
        if (self.rear + 1) % self.size == self.front:
            print("Queue is full!")
            return
        if self.front == -1:
            self.front = 0
        self.rear = (self.rear + 1) % self.size
        self.queue[self.rear] = item
        print(f"Inserted: {item}")

    def dequeue(self):
        if self.front == -1:
            print("Queue is empty!")
            return
        print(f"Deleted: {self.queue[self.front]}")
        if self.front == self.rear:
            self.front = self.rear = -1
        else:
            self.front = (self.front + 1) % self.size

    def display(self):
        if self.front == -1:
            print("Queue is empty!")
            return
        print("Queue elements:", end=" ")
        x = self.front
        while True:
            print(self.queue[x], end=" ")
            if x == self.rear:
                break
            x = (x + 1) % self.size
        print()

cq = CircularQueue(int(input("Enter queue size: ")))
while True:
    print("\nCommands: ENQUEUE <val> / DEQUEUE / DISPLAY / EXIT")
    cmd = input("Enter command: ").split()
    if cmd[0].upper() == "ENQUEUE":
        cq.enqueue(cmd[1])
    elif cmd[0].upper() == "DEQUEUE":
        cq.dequeue()
    elif cmd[0].upper() == "DISPLAY":
        cq.display()
    elif cmd[0].upper() == "EXIT":
        break
    else:
        print("Invalid command!")
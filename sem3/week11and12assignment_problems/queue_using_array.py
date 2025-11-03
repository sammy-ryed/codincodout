class Queue:
    def __init__(self, size):
        self.size = size
        self.queue = [None] * size
        self.front = -1
        self.rear = -1

    def isFull(self):
        return self.rear == self.size - 1

    def isEmpty(self):
        return self.front == -1 or self.front > self.rear

    def enqueue(self, item):
        if self.isFull():
            print("Queue is full!")
            return
        if self.front == -1:
            self.front = 0
        self.rear += 1
        self.queue[self.rear] = item
        print(f"Enqueued: {item}")

    def dequeue(self):
        if self.isEmpty():
            print("Queue is empty!")
            return
        print(f"Dequeued: {self.queue[self.front]}")
        self.front += 1

    def peek(self):
        if not self.isEmpty():
            print("Front element:", self.queue[self.front])
        else:
            print("Queue is empty!")

    def display(self):
        if self.isEmpty():
            print("Queue is empty!")
        else:
            print("Queue:", self.queue[self.front:self.rear + 1])

q = Queue(int(input("Enter queue size: ")))
while True:
    print("\nCommands: ENQUEUE <val> / DEQUEUE / PEEK / DISPLAY / EXIT")
    cmd = input("Enter command: ").split()
    if cmd[0].upper() == "ENQUEUE":
        q.enqueue(cmd[1])
    elif cmd[0].upper() == "DEQUEUE":
        q.dequeue()
    elif cmd[0].upper() == "PEEK":
        q.peek()
    elif cmd[0].upper() == "DISPLAY":
        q.display()
    elif cmd[0].upper() == "EXIT":
        break
    else:
        print("Invalid command!")
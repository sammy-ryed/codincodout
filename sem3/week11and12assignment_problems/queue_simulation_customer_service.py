from collections import deque

def customer_service():
    queue = deque()
    while True:
        cmd = input("Command (ARRIVE <name>/SERVE/SHOW/EXIT): ").split()
        if cmd[0].upper() == "ARRIVE":
            queue.append(cmd[1])
            print(f"{cmd[1]} arrived.")
        elif cmd[0].upper() == "SERVE":
            if queue:
                print("Serving:", queue.popleft())
            else:
                print("No customers to serve!")
        elif cmd[0].upper() == "SHOW":
            print("Waiting customers:", list(queue))
        elif cmd[0].upper() == "EXIT":
            break
        else:
            print("Invalid command!")

customer_service()
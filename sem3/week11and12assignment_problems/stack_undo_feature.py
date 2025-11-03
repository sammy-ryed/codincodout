def text_editor():
    stack = []
    while True:
        cmd = input("Command (TYPE <word>/UNDO/SHOW/EXIT): ").split()
        if cmd[0].upper() == "TYPE":
            stack.append(cmd[1])
        elif cmd[0].upper() == "UNDO":
            if stack:
                print("Undo:", stack.pop())
            else:
                print("Nothing to undo!")
        elif cmd[0].upper() == "SHOW":
            print("Current text:", " ".join(stack))
        elif cmd[0].upper() == "EXIT":
            break
        else:
            print("Invalid command!")

text_editor()
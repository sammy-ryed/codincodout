def next_greater(arr):
    result = [-1] * len(arr)
    stack = []

    for x in range(len(arr)):
        while stack and arr[x] > arr[stack[-1]]:
            result[stack.pop()] = arr[x]
        stack.append(x)
    return result

arr = list(map(int, input("Enter elements: ").split()))
print("Next Greater Elements:", next_greater(arr))
def bubble_sort(arr):
    size = len(arr)
    
    for i in range(0, size-1):
        for j in range(0, size - 1 - i):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

arr = [int(x) for x in input().split()]
bubble_sort(arr)
print(*arr)
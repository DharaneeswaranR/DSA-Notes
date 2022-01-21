def binary_search(arr, num):
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left + right) // 2

        if arr[mid] < num:
            left = mid + 1
        elif arr[mid] > num:
            right = mid - 1
        else:
            return mid

    return -1

arr = [int(x) for x in input().split()]
num = int(input())

print(f"{num} is found at the position {binary_search(arr, num)}")


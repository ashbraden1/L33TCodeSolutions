from _ast import List


def unique_occurrences(arr: List[int]) -> bool:
    occurrences = {}

    for x in range(len(arr)):
        if arr[x] in occurrences:
            occurrences[arr[x]] += 1
        else:
            occurrences.update({arr[x]: 1})

    values = list(occurrences.values())
    for i in range(len(values)):
        for j in range(i + 1, len(values)):
            if values[i] == values[j]:
                return False

    return True

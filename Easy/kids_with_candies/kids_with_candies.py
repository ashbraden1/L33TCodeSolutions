from _ast import List


def kids_with_candies(candies: List[int], extra_candies: int) -> List[bool]:
    results = []
    greatest = max(candies)

    for x in range(len(candies)):
        if candies[x] + extra_candies >= greatest:
            results.append(True)
        else:
            results.append(False)

    return results

from _ast import List


def running_sum(nums: List[int]) -> List[int]:
    results = []
    for x in range(len(nums)):
        if x == 0:
            results.append(nums[0])
        else:
            results.append(results[x - 1] + nums[x])

    return results

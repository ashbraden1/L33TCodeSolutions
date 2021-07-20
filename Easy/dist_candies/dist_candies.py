from _ast import List


def dist_candies(candy_type: List[int]) -> int:
    max_val = len(candy_type) / 2
    candies = len(set(candy_type))

    if candies > max_val:
        return int(max_val)
    else:
        return int(candies)

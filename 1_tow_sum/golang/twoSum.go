package main

import "fmt"

var target = 45
var nums = []int{2, 7, 11, 15, 30, 45, 78}

func twoSum(nums []int, target int) []int {
	index := make(map[int]int, len(nums))
	for i, b := range nums {
		if j, ok := index[target-b]; ok {
			fmt.Println(j)
			fmt.Println(i)
			return []int{j, i}
		}
		index[b] = i
	}
	return nil
}

func main() {
	twoSum(nums, target)
}

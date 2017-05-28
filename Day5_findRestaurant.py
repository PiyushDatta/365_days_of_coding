
class Solution:
	def findRestaurant(self, list1, list2):
		"""
		:type list1: List[str]
		:type list2: List[str]
		:rtype: List[str]
		"""
		list1_len = len(list1)
		list2_len = len(list2)
		min_list1_ind = [None]
		min_index = list1_len + list2_len + 1
		return_lst = []

		# O(n)
		for i in list1:
			# If the restaurant is in list 2
			if i in list2:
				# Appending is O(1)
				if min_index == (list1.index(i) + list2.index(i)):
					min_list1_ind.append(list1.index(i))
				elif min_index > (list1.index(i) + list2.index(i)):
					min_list1_ind[0] = list1.index(i)
					min_index = (list1.index(i) + list2.index(i))
		
		# O(n)
		for m in min_list1_ind:
			return_lst.append(list1[m])


		return return_lst
		

if __name__ == '__main__':
	c = Solution()
	# lst1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]
	# lst2 = ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
	# lst1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]
	# lst2 = ["KFC", "Shogun", "Burger King"]
	lst1 = ["Shogun", "KFC"]
	lst2 = ["KFC", "Shogun"]

	print(c.findRestaurant(lst1, lst2))
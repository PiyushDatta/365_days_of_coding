"""
Remove duplicate in a sorted list - Interview prep
Problem from InterviewBit
"""

# import collections -- for one-liner, O(n) solution
from copy import deepcopy
class Solution:
	# @param A : list of integers
	# @return an integer
	def removeDuplicates(self, A):
		# O(n**2) solution
		copy_array = deepcopy(A)
		del A[:]

		for j in copy_array:
			if j in A:
				pass
			else:
				A.append(j)

		return len(A)

		# The one liner solution which gives a O(n) solution. Pretty neat one liner.
		"""
		A[:] = collections.OrderedDict.fromkeys(A)
		return len(A)
		"""

if __name__ == '__main__':
	# Testing
	list1 = [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
	1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
	2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 ]
	c = Solution()
	print(c.removeDuplicates(list1)) # Should return 4
	print(list1) # Should be [0, 1, 2, 3]

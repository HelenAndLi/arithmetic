# 排序算法
## 1、冒泡排序
冒泡两个字生动形象，让数据一点一点往上（前）冒，而冒的这个数据要么是最大值，要么是最小值。
具体做法就是做遍历，每轮遍历确定当前剩余数组的最大或最小值，确定后的数其实就移动到当前数组的最后面了，且不必参与下轮及后续的遍历（比较）了，这样每一轮比较，都会减少一个数，直到数组只剩一个数。
每次比较都是相邻两个数比较，用下标来表示，这里我们举例，按照从小到大的排序来，就是：a[0]跟a[1]比较，该交换交换（也就是a[0]小于a[1]），然后新a[1]再跟a[2]比较，该交换交换，然后新a[2]跟a[3]比较……直到a
[n-1]跟a[n]比较，该交换交换，这样当前数组的a[n]，一定是整个数组中最大的了；下一轮遍历，a[n]就不参与了，

## 2、快排
是冒泡排序的改进，相比之下多了个基数的概念，把比基数小的后放基数前面去，比基数大的都放基数后面，然后再对这两个数组做相同操作，确定一个基数，跟基数比较，再一分为二，就这样不断细分，直到待排数组只剩下一个元素。

## 3、归并排序
速度仅次于快排，比较次数比快排少，但移动次数更多；
相对稳定；
做法是把数组不断二分成只剩一个元素的小数组，然后跟相邻小数组进行比较、排序、合并，逐步递归数组渐渐变大，直到回到大数组，就是一个局部有序到全局有序的过程。

## 4、选择排序
每次遍历选出当前剩余序列中的最小值，跟当前剩余序列的第一位交换，下一轮该第一位就不参与比较了，注意跟冒泡比较，冒泡是相邻两个数做比较，一步一步挪，这个是直接交换位置。


